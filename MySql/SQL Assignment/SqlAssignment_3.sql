use sakila;

#1. **Retrieve the first 10 characters of the title of each film.**

select * from film;
select left(title,10) from film;

#2. **Convert the titles of all films to uppercase.**

select ucase(title) from film;

#3. **Find the length of each film title.**

select length(title) from film;

#4. **Concatenate the first name and last name of each actor, separated by a space.**
select * from actor;
select concat(first_name, last_name) from actor;

#5. **Replace the word "Action" with "Thriller" in the film description.**

select * from film;
select replace(description,'Action','Thriller') from film;

#6. **Extract the domain name from the email addresses of all customers.**
select * from customer;
select substring_index2(email,'@')from customer;

#7. **Find all films whose title starts with the letter 'A'.**

select * from film where title like 'A%';

#8. **Trim leading and trailing spaces from the first names of customers.**
select * from customer;
select trim(first_name)from customer;

#9. **Find the position of the first occurrence of the word "GREAT" in the film description.**
select * from film;
select 	locate('Great',description) from film;

#10. **Reverse the first name of each customer.**

select reverse(first_name) from customer;

#11. **Round the rental rate of each film to 2 decimal places.**
select * from film;
select round(rental_rate, 2) from film;

#12. **Calculate the square root of the replacement cost of each film.**
select sqrt(replacement_cost)from film;

#13. **Find the absolute value of the difference between rental duration and length for each film.**
select abs(length-rental_duration) from film;

#14. **Raise the rental rate of each film to the power of 3.**
select pow(rental_rate,3) from film;

#15. **Get the ceiling value of the replacement cost of each film.**
select ceil(replacement_cost) from film;

#16. **Get the floor value of the replacement cost of each film.**
select floor(replacement_cost) from film;

#17. **Calculate the modulus (remainder) of the rental duration divided by 3 for each film.**
select mod(rental_duration,3) from film;

#18. **Get the highest rental rate of all films.**
select max(rental_rate)from film;

#19. **Get the lowest replacement cost of all films.**
select min(replacement_cost)from film;

#20. **Calculate the average length of all films.**
select avg(length) from film;

#21. **Extract the year from the rental date for each rental.**

select year(rental_date) from rental;

#22. **Find the day of the week for each rental date.**

select week(rental_date) from rental;

#23. **Calculate the age of each customer based on their create_date.**
select * from customer;
SELECT create_date,
(DATEDIFF(CURDATE(), create_date) / 365.25) AS age FROM customer;

#24. **Add 7 days to the rental date to get the return due date for each rental.**
select * from rental;
select rental_date , date_add(rental_date, interval 7 day) as due_date from rental;

#25. **Get the month name from the rental date for each rental.**
select rental_date, monthname(rental_date) from rental;

#26. **Extract the hour from the last update timestamp of each film.**
select * from film;
select hour(last_update) from film;

#27. **Calculate the difference in days between the return date and rental date for each rental.**
select rental_date, datediff(return_date, rental_date) from rental;

#28. **Find the first day of the month for each rental date.**
select * from rental;
select rental_date, date_format(rental_date,'%Y-%m-01') from rental;

#29. **Format the rental date as 'DD-MM-YYYY' for each rental.**
select rental_date, date_format(rental_date, '%d-%m-%Y') from rental;

#30. **Extract the quarter from the rental date for each rental.**
select * from rental;
select rental_date, quarter(rental_date) from rental;

#31. **Find the ASCII value of the first character of each film title.**

select title, ascii(substring(title,1,1)) from film;

#32. **Return the binary representation of the film_id for each film.**

select bin(film_id) from film;

#33. **Convert the rental duration of each film to a hexadecimal value.**
select * from film ;
select hex(rental_duration) from film;

#34. **Find all films with a replacement cost that is a power of 2.**
select pow(replacement_cost, 2) from film;

#35. **Check if the length of the film title is even or odd.**
select * from film;
select length, if (length(title)%2=0,'even','odd') from film;

#36. **Find all films with a rental rate greater than 3 and categorize them as 'High' or 'Low'.**

select rental_rate, if(rental_rate > 3,'High','Low') from film;

#37. **Return the IP address equivalent of the film_id for the first 10 films.**


#38. **Select the 3rd character of each film title.**
select title, substring(title,3,1)from film;

#39. **Return the Unicode code point of the first character of each actor's first name.**
select * from actor;
select first_name, ascii(substring(first_name,1,1))from actor;

#40. **Convert the rental rate of each film to a binary string.**

select rental_rate, bin(rental_rate)from film;
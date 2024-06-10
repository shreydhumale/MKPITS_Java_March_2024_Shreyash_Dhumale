use sakila;
/* 1. **Retrieve all films with a rental duration of more than 5 days:**
*/

select * from film where rental_duration >5;

/* 2. **List all customers who live in the city of 'San Diego':**
*/

select * from customer_list group by city="San Diego";

/* 3. **Find all films with a rating of 'PG-13' and sort them by title:**
*/
select * from film where rating='PG-13' order by title;

/* 4. **Display all actors whose last name starts with 'A' and order by first name:**
*/
select * from actor_info where last_name='A' order by first_name;

/* 5. **Retrieve all films released in the year 2006:**
*/
select * from film where release_year='2006';

/* 6. **Find all customers whose first name is 'John' and sort by last name in descending order:**
*/
select * from customer where first_name='John' order by last_name;

/* 7. **List all films with a rental rate between 2.99 and 4.99, inclusive:**
*/
select * from film where rental_rate between '2.99' and '4.99';

/* 8. **Retrieve all actors with a last name containing 'son' and order by last name:**
*/
select * from actor_info where last_name ='son' order by last_name;

/* 9. **Find all stores in city 'Los Angeles' and sort by store ID:**
*/
select city from city where city='Los Angles'; 

/* 10. **Display all films with a replacement cost greater than 20 and sort by replacement cost in ascending order:**
*/
select * from film where replacement_cost >20 order by replacement_cost;

/* 11. **List all films with a length greater than 120 minutes:**
*/
select * from film where length > 120;

/* 12. **Find all customers who have an active status (status = 1):**
*/
select * from customer where active =1;

/* 13. **Retrieve all films with a rental rate of 0.99 and sort them by length in descending order:**
*/
select * from film where rental_rate='0.99' order by length desc;

/* 14. **Display all actors with a first name containing 'Tom' and order by last name:**
*/
select * from actor_info where first_name='Tom' order by last_name;

/* 15. **Find all films with a replacement cost less than 15 and sort them by title:**
*/
select * from film where replacement_cost <15 order by title;

/* 16. **List all customers with a last name ending with 'son':**
*/
select * from customer where last_name='son';

/* 17. **Retrieve all films with a rating of 'R' and sort them by rental duration:**
*/
select * from film where rating='R' order by rental_duration;

/* 18. **Find all actors with a last name exactly equal to 'Smith' and order by first name:**
*/
select * from actor where last_name ='Smith' order by first_name;

/* 19. **Display all films with a rental duration of exactly 7 days and sort by replacement cost:**
*/
select * from film where rental_duration='7' order by replacement_cost;

/* 20. **List all customers with a first name starting with 'A' and order by last name in ascending order:**
*/
select * from customer where first_name='A' order by last_name;

/* 21. **Retrieve all films with a rental duration between 3 and 7 days and a rental rate greater than 2.99:**
*/
select * from film where rental_duration between '3' and '7' and rental_rate> '2.99';

/* 22. **List all customers who live in 'New York' or 'Los Angeles':**
*/
select * from customer where address_id in(select city_id from city where city='Abu Dhabi' or city ='Adana');

/* 23. **Find all films with a rating of 'PG' or 'G' and a length less than 90 minutes:**
*/
select * from film where rating='PG' or rating='G' and length <'90';

/* 24. **Display all actors with a first name containing 'Sam' or a last name starting with 'B':**
*/
select * from actor where first_name='Sam' or last_name ='B%' ;

/* 25. **Retrieve all films with a replacement cost between 15 and 25 and sort them by title:**
*/
select * from film where replacement_cost between '15' and '25' order by title;

/* 26. **Find all customers who have rented a film in the last month and have an active status (status = 1):**
*/
SELECT 
    customer.customer_id,
    customer.first_name,
    customer.last_name,
    MAX(rental.rental_date) AS last_rental_date
FROM rental JOIN customer ON rental.customer_id = customer.customer_id
WHERE rental.customer_id IN (SELECT customer.customer_id FROM  customer
WHERE customer.active = 1)
GROUP BY rental.customer_id;

/* 27. **List all films with a rental rate of 4.99, 3.99, or 2.99:**
*/
select * from film where rental_rate in(4.99, 3.99, 2.99);

/* 28. **Retrieve all actors with a first name starting with 'M' and a last name ending with 'y':**
*/
select * from actor where first_name='M%' and last_name='Y';

/* 29. **Find all films released in the years 2005, 2006, or 2007 and sort them by release year:**
*/
select * from film where release_year in(2005, 2006, 2007) order by release_year;

/* 30. **Display all customers with a first name of 'Emily' or a last name containing 'Lee':**
*/
select * from customer where first_name='Emily' or last_name='Lee';
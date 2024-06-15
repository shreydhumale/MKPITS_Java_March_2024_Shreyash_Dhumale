#1.	Retrieve the names of all customers and the titles of the films they have rented.
use sakila;

select first_name,last_name as customer_name, title
from customer c
join rental r on c.customer_id = r.customer_id
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
ORDER BY customer_name, f.title;

#2.	Display the rental date and return date for each rental along with the customer's first name and last name.
select first_name, last_name, rental_date, return_date
from customer c
join rental r on c.customer_id = r.customer_id
order by c.last_name, c.first_name, r.rental_date;


#3.	List the names of actors who have appeared in the film titled "Chamber Italian".

select first_name, last_name
from actor a
join film_actor fa on a.actor_id = fa.actor_id
join film f on fa.film_id = f.film_id
where f.title = 'Chamber Italian';

#4.	Get the titles of all films rented by the customer named "William Brown".

select title
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where c.first_name = 'William' and c.last_name = 'Brown';

#5.	Retrieve the film titles rented by the customer with customer_id 100.

select f.title
from rental r
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where r.customer_id = 100;

#6.	List the film titles and rental dates for all rentals made by the customer with customer_id 200.

select title as film_title, r.rental_date
from rental r
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where r.customer_id = 200
order by r.rental_date;

#7.	Display the film titles and rental durations for all rentals made on May 15, 2005.

select f.title as film_title, 
       r.rental_date, 
       r.return_date, 
       DATEDIFF(r.return_date, r.rental_date) as rental_duration
from rental r
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where date(r.rental_date) = '2005-05-15'
order by f.title;

#8.	List the names of customers who have rented the film titled "Alien Center".

select first_name,last_name, title
from customer c
join rental r on c.customer_id = r.customer_id
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
where f.title='Alien Center';

select first_name, last_name, email
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where f.title = 'Flight Lies';

#10.Retrieve the rental date and rental duration for each rental made by customer "Linda Williams".

select rental_date, 
DATEDIFF(return_date, rental_date) as rental_duration
from customer c
join rental r on c.customer_id = r.customer_id
where c.first_name = 'Linda' and c.last_name = 'Williams'
order by r.rental_date;

#11.List the film titles and rental dates for all rentals made by customer "Mary Johnson".

select f.title as film_title, r.rental_date
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where c.first_name = 'Mary' and c.last_name = 'Johnson'
order by r.rental_date;

#12.Display the film titles rented by the customer with customer_id 300.

select f.title as film_title
from rental r
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where r.customer_id = 300
order by f.title;

#13.Get the names of all customers who have rented more than 5 films.
select first_name,  last_name as customer_name, count(r.rental_id) as rental_count
from customer c
join rental r on c.customer_id = r.customer_id
group by c.customer_id, c.first_name, c.last_name
having rental_count > 5
order by customer_name;

#14.List the film titles and rental dates for all rentals made by the customer with customer_id 400.

select title ,rental_date
from rental r
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where r.customer_id = 400
order by r.rental_date;

#15.Retrieve the rental date and return date for each rental made by customer "Richard Davis".

select rental_date, return_date
from customer c
join rental r on c.customer_id = r.customer_id
where c.first_name = 'richard' and c.last_name = 'davis';

#16.Display the first name, last name, and email of customers who have rented the film titled "Dinosaur Secretary".

select first_name, last_name, email
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where f.title = 'Dinosaur Secretary';

#17.List the names of customers who have rented the film titled "Silence Kane".

select first_name, last_name
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where f.title = 'silence kane';

#18.Get the film titles and rental dates for all rentals made on August 10, 2005.

select title , rental_date
from rental r
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where date(r.rental_date) = '2005-08-10';

#19.Retrieve the film titles rented by the customer with customer_id 500.

select title
from rental r
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where r.customer_id = 500;

#20.Display the rental date and rental duration for each rental made by customer "Karen Smith".

select r.rental_date
from customer c
join rental r on c.customer_id = r.customer_id
where c.first_name = 'karen' and c.last_name = 'smith'
order by r.rental_date;

#21.	List the film titles and rental dates for all rentals made by customer "Steven Taylor".

select f.title as film_title, r.rental_date
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where c.first_name='Steven' and c.last_name='Taylor	'
order by r.rental_date;

#22.Display the names of customers who have rented the film titled "Ocean Luke".

select c.first_name, c.last_name, r.rental_date
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where f.title='Ocean Luke';

#23.Get the first name, last name, and email of customers who have rented more than 10 films.

select c.first_name,c.last_name,c.email 
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where  c.customer_id > 10;

#24.Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 600.

select f.title, r.rental_date
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
where c.customer_id='600';

#25.List the rental date and return date for all rentals made by customer "Susan Johnson".

select rental_date, return_date
from customer c
join  rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
where c.first_name='Susan' and c.last_name='Johnson';

#26.Display the film titles rented by the customer with customer_id 700.

select f.title
from customer c
join rental r on c.customer_id=r.customer_id
join inventory i on r.inventory_id= i.inventory_id
join film f on f.film_id=i.film_id
where c.customer_id='700';

#27.Get the names of customers who have rented the film titled "Murder Antitrust".

select c.first_name, c.last_name
from customer c
join rental r on r.customer_id=c.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id
where f.title='Murder Antitrust';

#28.Retrieve the rental date and rental duration for each rental made by customer "Joseph Brown".

select r.rental_date, f.rental_duration
from customer c
join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id
where c.first_name='Joseph' and c.last_name='Brown';

#29.List the film titles and rental dates for all rentals made by customer "Michael Davis".

select f.title, r.rental_date
from customer c
join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id = i.film_id
where c.first_name='Michale'and c.last_name='Davis';

#30.Display the first name, last name, and email of customers who have rented the film titled "Squad Fisherman".

select c.first_name,c.last_name, c.email
from customer c
join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id
where f.title='Squad Fisherman';

#31.Get the film titles and rental dates for all rentals made on July 25, 2005.

select f.title, r.rental_date
from film f
join inventory i on i.film_id=f.film_id
join rental r on i.inventory_id=r.inventory_id
where r.rental_date =date('25/07/2005');

#32.Retrieve the film titles rented by the customer with customer_id 800.

select f.title
from film f
join inventory i on i.film_id=f.film_id
join rental r on r.inventory_id=i.inventory_id
join customer c on c.customer_id=r.customer_id
where c.customer_id='800';

#33.List the rental date and return date for all rentals made by customer "Barbara Taylor".

select rental_date, return_date
from customer c
join rental r on r.customer_id=c.customer_id
where c.first_name='barbara' and c.last_name='taylor';

#34.Display the names of customers who have rented the film titled "Riders Zorro".

select c.first_name, c.last_name, f.title
from customer c
join rental r on r.customer_id=c.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id
where f.title='Riders Zorro';

#35.Get the first name, last name, and email of customers who have rented more than 8 films.

select c.first_name, c.last_name, c.email
from customer c
join rental r on r.customer_id=c.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id
where f.rental_rate > 8
order by
c.last_name, c.first_name;

#36.Retrieve the film titles and rental dates for all rentals made by the customer with customer_id 900.

select f.title, r.rental_date
from rental r
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id
where r.customer_id = '900';

# 37.List the rental date and rental duration for each rental made by customer "Charles Harris".

select r.rental_date,f.rental_duration 
from film f 
join inventory i on f.film_id=i.film_id 
join rental r on r.inventory_id=i.inventory_id 
join customer c on c.customer_id=r.customer_id 
where c.first_name="Charles" and c.last_name="Harris";

#38.Display the film titles rented by the customer with customer_id 1000.

select c.customer_id,f.title
from customer c
join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id
where c.customer_id='1000';

#39.Get the names of customers who have rented the film titled "Casino Royale".

select c.first_name,c.last_name,f.title
from customer c
join rental r on c.customer_id=r.customer_id
join inventory i on r.inventory_id=i.inventory_id
join film f on f.film_id=i.film_id
where f.title='Casino Royale';

#40.Retrieve the rental date and return date for each rental made by customer "Lisa Anderson".
 
select concat(c.first_name,' ',c.last_name) as customers ,r.rental_date, return_date
from rental r
join customer c on c.customer_id=r.customer_id
where c.first_name='Lisa' and c.last_name='Anderson'



	



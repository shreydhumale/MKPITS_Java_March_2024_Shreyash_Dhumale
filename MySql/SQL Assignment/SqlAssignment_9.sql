use sakila;
/* 1. Find customers who rented a specific film:
Retrieve the names of customers who rented the film with the title 'Inception'.
*/

select c.customer_id,c.first_name,c.last_name
from customer c 
join rental r on r.customer_id=c.customer_id
where r.inventory_id in(
	select inventory_id
    from inventory 
    where film_id in(
		select film_id
        from film 
        where title='Mask Peach'
    )
);

/* 
2. Find films rented by a specific customer:
Retrieve the titles of films rented by a customer with a given customer_id. */

select f.title 
from film f
where f.film_id in(
	select f.film_id
    from inventory i
    where i.inventory_id in(
		select i.inventory_id
        from rental r
        where r.customer_id='101'
    )
);

/* 
3. Find rental details for the most recent rental:
Retrieve the rental details for the most recent rental transaction 
in the database. */

select r.rental_id, r.rental_date, r.customer_id
from rental r
where r.rental_date = (
    select max(rental_date)
    from rental
    order by rental_date desc
);

/* 4. Find the average rental duration compared to the overall average:
Compare the average rental duration of films in a specific category with
the overall average rental duration.
 */
 
use sakila;
select avg(rental_duration) 
from film  
where film_id in(
	select f.film_id
    from film f
    join film_category fc on fc.film_id=f.film_id
    where fc.category_id=3
);

/* 
5. Find films with rental counts above average:
Retrieve films with rental counts greater than the average number 
of rentals across all films.
- Count film wise rental
- Display films whose rental count is > avg rental count */


select f.title, count(rental_id) as rental_count
from film f
    join inventory i on i.film_id= f.film_id
    join rental r on r.inventory_id=i.inventory_id
    group by f.film_id 
	having count(r.rental_id)>(
		select avg(rental_count)
        from(
			select f.film_id,count(r.rental_id) as rental_count
            from film f 
            join inventory i on i.film_id=f.film_id
            join rental r on r.inventory_id=i.inventory_id
            group by f.film_id
        ) as rental_count_per_film
    );


/* 6. Find customers who rented the same film as another customer:
Identify customers who rented the same film as a specific customer 
(based on customer_id).*/

select c.first_name,c.last_name,c.customer_id
from customer c
join rental r on c.customer_id=r.customer_id
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id 
where f.film_id in(
	select distinct f.film_id 
    from customer c
    join rental r on c.customer_id=r.customer_id
	join inventory i on i.inventory_id=r.inventory_id
	join film f on f.film_id=i.film_id 
    where c.customer_id=4
);

/* 
7. Find customers who have rented from both stores:
Identify customers who have rented films from both store_id 1 
and store_id 2. */


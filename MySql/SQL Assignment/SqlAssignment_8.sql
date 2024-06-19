/* 1. High revenue categories:
Find categories with an average rental revenue greater than $10. */

select c.name as category_name, avg(p.amount) as avg_rental_revenue
from category c
join film_category fc on c.category_id = fc.category_id
join film f on fc.film_id = f.film_id
join inventory i on f.film_id = i.film_id
join rental r on i.inventory_id = r.inventory_id
join payment p on r.rental_id = p.rental_id
group by c.category_id
having avg(p.amount) > 10
order by avg_rental_revenue desc;

/* 2. Customers with many rentals:
Identify customers who have rented more than 30 films.
*/

select c.first_name, c.last_name, count(r.rental_id) as rental_count
from customer c
join  rental r on c.customer_id = r.customer_id
group by c.customer_id
having count(r.rental_id) > 30
order by rental_count desc;

/* 
3. Popular languages:
List languages with more than 50 films. */

select l.name as language_name, count(f.film_id) as film_count
from language l
join film f on l.language_id = f.language_id
group by l.language_id
having count(f.film_id) > 50
order by film_count desc;

/* 
4. Stores with high revenue:
Find stores with total revenue exceeding $5000.
*/

select s.store_id, sum(p.amount) as total_revenue
from store s
join staff st on s.store_id = st.store_id
join payment p on st.staff_id = p.staff_id
join rental r on p.rental_id = r.rental_id
group by s.store_id
having sum(p.amount) > 5000
order by total_revenue desc;

/*  
5. Actors in popular films:
Show actors who have appeared in more than 10 films.*/

select a.first_name, a.last_name, count(fa.film_id) as film_count
from actor a
join film_actor fa on a.actor_id = fa.actor_id
join film f on fa.film_id = f.film_id
group by a.actor_id
having count(fa.film_id) > 10
order by film_count desc;

/* 
6. Staff with high customer interactions:
List staff members who have handled more than 500 customer transactions.*/

select s.first_name, s.last_name, count(distinct p.customer_id) as transaction_count
from staff s
join payment p on s.staff_id = p.staff_id
join rental r on p.rental_id = r.rental_id
group by s.staff_id
having count(distinct p.customer_id) > 500
order by transaction_count desc;

/* 
7. Active customers:
Identify customers who have rented in the last 30 days. */

select c.customer_id, c.first_name, c.last_name,
max(r.rental_date) as last_rental_date
from customer c
join rental r on c.customer_id = r.customer_id
where r.rental_date >= date_sub(now(), interval 30 day)
group by c.customer_id, c.first_name, c.last_name
order by last_rental_date desc;

/* 
8. Long rentals:
List films with an average rental duration of more than 7 days. */

select f.title as film_title,
avg(timestampdiff(day, r.rental_date, r.return_date)) as avg_rental_duration_days
from film f
join inventory i on f.film_id = i.film_id
join rental r on i.inventory_id = r.inventory_id
group by f.film_id, f.title
having avg_rental_duration_days > 7
order by avg_rental_duration_days desc;

/* 9. Highly rented films:
Identify films that have been rented more than 30 times */

select f.title as film_title, count(r.rental_id) as rental_count
from film f
join inventory i on f.film_id = i.film_id
join rental r on i.inventory_id = r.inventory_id
group by f.film_id, f.title
having rental_count > 30
order by rental_count desc;

/* 
10. Customers with diverse film preferences:
Find customers who have rented films from at least 5 different categories. */

select c.customer_id, c.first_name, c.last_name
from customer c
join rental r on c.customer_id = r.customer_id
join inventory i on r.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
join film_category fc on f.film_id = fc.film_id
group by c.customer_id, c.first_name, c.last_name
having count(distinct fc.category_id) >= 5;
 
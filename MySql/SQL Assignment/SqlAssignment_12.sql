/* ### Problem Statement 1
**Create a view named `customer_rental_info` that lists each 
customer's full name (first and last), email, the number of rentals 
they have made, and the total amount they have spent on rentals.** */

use sakila;

# CREATING VIEW
create view customer_rental_info
as
select first_name,last_name,email,count(r.rental_id),sum(p.amount)
from customer c
join rental r on c.customer_id=r.customer_id
join payment p on p.rental_id=r.rental_id
group by c.customer_id;

#USING VIEW

select * from customer_rental_info;

/* ### Problem Statement 2
**Create a view named `top_rented_films` that displays the top 10 most 
rented films, including the film title and the number of times it has 
been rented.** */

create view  top_rented_films as
select f.title, count(r.rental_id) as rentals
from rental r
join inventory i on i.inventory_id=r.inventory_id
join film f on f.film_id=i.film_id
group by f.film_id
order by rentals 
limit 10;

/* 
### Problem Statement 3
**Create a view named `active_customers` that lists all customers who have 
 rented at least one film in the last 30 days. Include the customer's full name,
 email, and the date of their last rental.**
 */
 
 create view active_customers as
 select first_name,last_name,email, max(r.rental_date) as last_rental
 from customer c
 join rental r on r.customer_id=c.customer_id
 where r.rental_date >= date_sub(now(), interval 30 day)
 group by c.customer_id
 having max(r.rental_date)>=date_sub(now(), interval 30 day);
 
 /* ### Problem Statement 4
**Create a view named `inventory_by_store` that displays the number
  of films available in each store. Include the store ID and the count 
  of films available in that store.** */
  
  create view inventory_by_store as
  select s.store_id, count(f.film_id) as films
  from store s
  join inventory i on s.store_id=i.store_id
  join film f on f.film_id=i.film_id
  group by s.store_id
  order by films;
  
  /* ### Problem Statement 5
**Create a view named `staff_sales_performance` that lists each 
  staff member's full name, their store, and the total sales amount 
  they have made.**
 */
 
 create view staff_sales_performance as
 select s1.first_name,s1.last_name,st.store_id, sum(p.amount) as sales_amount
 from store st
 
 join staff s1 on s1.store_id=st.store_id
 join payment p on p.staff_id=s1.staff_id

 group by s1.staff_id
 order by sales_amount;
 

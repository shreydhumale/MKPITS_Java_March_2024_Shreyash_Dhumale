/* Problem Statement 1: 
Retrieve Customers Who Have Rented the Same Film Twice
Retrieve the customer IDs and film titles for customers 
who have rented the same film more than once.*/

use sakila;
select r1.customer_id, f.title as film_title
from rental r1
join rental r2 on r1.customer_id = r2.customer_id 
and r1.inventory_id = r2.inventory_id 
and r1.rental_id < r2.rental_id
join inventory i on r1.inventory_id = i.inventory_id
join film f on i.film_id = f.film_id
group by r1.customer_id, f.title;

/* 
Problem Statement 2: 
Find Actors Who Have Worked Together in a Film
Retrieve pairs of actor names who have worked together in the same film. */

select
    a1.first_name, a1.last_name as actor_1,
    a2.first_name, a2.last_name as actor_2,
    f.title as film_title
from film_actor fa1
join film_actor fa2 on fa1.film_id = fa2.film_id
and fa1.actor_id < fa2.actor_id
join actor a1 on fa1.actor_id = a1.actor_id
join actor a2 on fa2.actor_id = a2.actor_id
join film f on fa1.film_id = f.film_id
order by f.title, actor_1, actor_2;

/* 
Problem Statement 3: 
Identify Customers Who Share the Same Address
Retrieve pairs of customer names who share the same address. */

select
    c1.first_name, c1.last_name as customer_1,
    c2.first_name, c2.last_name as customer_2,
    a.address
from customer c1
join customer c2 on c1.address_id = c2.address_id
and c1.customer_id < c2.customer_id
join address a on c1.address_id = a.address_id
order by a.address, customer_1, customer_2;

/* 
Problem Statement 4: 
Find Employees and Their Managers
Retrieve employee names and their corresponding manager names 
within the same department */

select 
    concat(s1.first_name, ' ', s1.last_name) as employee_name,
    concat(s2.first_name, ' ', s2.last_name) as manager_name
from 
    staff s1
left join 
    staff s2 on s1.store_id = s2.store_id and s1.staff_id = s2.staff_id
join 
    store s on s1.store_id = s.store_id
order by 
     s1.first_name, s1.last_name;

/* 
Problem Statement 5: 
Identify Films with Similar Titles
Retrieve pairs of film titles that have a similar title structure 
(e.g., differing by one character or having a common substring).
 */
 
 


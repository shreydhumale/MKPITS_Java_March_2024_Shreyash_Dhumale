### Problem 1:
#**Find the total number of films in the database.**
use sakila;
select count(title) from film;

### Problem 2:
#**Find the average rental rate of all films.**

select avg(rental_rate) from film;


### Problem 3:
#**Find the total number of rentals made.**

select count(rental_id) from rental;

### Problem 4:
#**Find the highest replacement cost of any film.**
select  max(replacement_cost) from film;

### Problem 5:
#**Find the total revenue generated from rentals.**
select * from film;
select sum(rental_rate) from film;

### Problem 6:
#**Find the average length of films.**

select avg(length) from film;

### Problem 7:
#**Find the minimum rental duration among all films.**

select min(rental_rate) from film;

### Problem 8:
#**Find the total number of distinct customer IDs in the rental table.**

select distinct(customer_id)from rental;

### Problem 9:
#**Find the average payment amount made by customers.**

select * from payment;
select avg(amount) from payment;

### Problem 10:
#**Find the total number of inventory items available.**

select * from inventory;
select count(inventory_id) from inventory;

### Problem 11:
#**Find the total number of distinct films rented.**

### Problem 12:
#**Find the highest payment amount made by any customer.**

select * from payment;
select max(amount) from payment;

### Problem 13:
#**Find the average length of films that have a rating of 'PG'.**

select * from film;
select avg(length)from film where rating='PG';

### Problem 14:
#**Find the total number of payments made in May 2005.**

select * from payment;
select count(payment_id) from payment where year(payment_date)=2005 and month(payment_date)=5;


### Problem 15:
#**Find the total number of films with a rental duration of 7 days.**

select * from film;
select count(rental_duration) from film where rental_duration='7';

### Problem 16:
#**Find the average replacement cost of films with a rental rate of 2.99.**

select avg(replacement_cost) from film where rental_rate='2.99';
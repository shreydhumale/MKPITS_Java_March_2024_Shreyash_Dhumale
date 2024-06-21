/* 1. **Retrieve Actor Information by Last Name**:
   Write a procedure that accepts an actor's last name as input and 
   returns a list of all actors with that last name, including their first name, 
   last name, and actor ID. */
   
USE `sakila`;
DROP procedure IF EXISTS actor_info;

DELIMITER $$
USE `sakila`$$
CREATE PROCEDURE actor_info (IN last_name_a VARCHAR(50))

BEGIN
	SELECT actor_id,first_name,last_name
    FROM actor
    WHERE last_name=last_name_a;
END$$

DELIMITER ;

call actor_info('WAHLBERG');

/* 2. **List Films by Category**:
   Create a procedure that takes a category name as input and returns all films in that category, 
   including film title, description, release year, and rating. */
   
DROP procedure IF EXISTS film_category;

DELIMITER $$
USE `sakila`$$
CREATE PROCEDURE film_category (IN film_category VARCHAR(50))

BEGIN
	SELECT f.title, f.description, f.release_year, f.rating 
    FROM category c
    join film_category fc on fc.category_id=c.category_id
    join film f on f.film_id=fc.film_id
    WHERE c.name=film_category;
END$$

DELIMITER ;

CALL film_category('Action');


/* 3. **Calculate Total Payment by Customer**:
		Develop a procedure that accepts a customer ID and returns the total amount paid 
        by that customer. The result should include the customer ID, first name, last name, 
        and total payment amount. */

DROP procedure IF EXISTS total_payment;

DELIMITER $$
USE `sakila`$$
CREATE PROCEDURE total_payment (IN customer_ids INT)

BEGIN
	SELECT c.customer_id, c.first_name, c.last_name, sum(p.amount) as total_payment 
	FROM customer c
    JOIN payment p ON p.customer_id=c.customer_id
    WHERE c.customer_id=customer_ids
    GROUP BY c.customer_id,c.first_name,c.last_name;
    
END$$

DELIMITER ;

call total_payment(2);

/* 
4. **Count Rentals by Date Range**:
   Implement a procedure that accepts a start date and an end date and returns the number 
   of rentals made within that date range. Include the rental ID and rental date in the results. */
   
   DROP procedure IF EXISTS Date_Range;

DELIMITER $$
USE `sakila`$$
CREATE PROCEDURE Date_Range (IN start_date DATE, IN end_date DATE, OUT rental_count INT)

BEGIN
	SELECT rental_id, COUNT(rental_id) 
	FROM rental
    WHERE rental_date between start_date AND end_date
    GROUP BY rental_id;
END$$

DELIMITER ;

SET @rental_count=0;

CALL Date_Range('2005-05-24','2005-05-27 ',@rental_count);

/* 
5. **Update Film Rental Rate**:
   Write a procedure to update the rental rate of a specific film. 
   The procedure should accept the film ID and the new rental rate as inputs 
   and then update the rental rate for that film in the database. Return the film ID, 
   old rental rate, and new rental rate as output.*/
   

   
   

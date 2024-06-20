use mydatabase;


DELIMITER $$

CREATE PROCEDURE mySP(IN FILM_ID INT, OUT TITLE VARCHAR(100))
BEGIN
SELECT FILM_ID , TITLE
FROM film
WHERE film_id ='';
END$$

DELIMITER ;

DROP PROCEDURE MYSP;

CALL mySP(100,@ttl);
SELECT @ttl;
--------------------------------------
use sakila;
call film_in_stock(100,2,@count);
select @count;
select * from film
USE SHOP
DELIMITER //

CREATE TRIGGER update_product_stock_after_insert
AFTER INSERT ON order_items
FOR EACH ROW
BEGIN
    UPDATE products
    SET stock = stock - NEW.quantity
    WHERE product_id = NEW.product_id;
END //

DELIMITER ;

SELECT * FROM CUSTOMERS;
SELECT * FROM ORDER_ITEMS;
SELECT * FROM ORDERS;
SELECT * FROM PRODUCTS;

INSERT INTO ORDERS VALUES(7,1,'2023-06-15', 'Completed', 76000.00);

INSERT INTO order_items (order_id, product_id, quantity, price) VALUES
(7, 1, 2, 60000.00), 
(7, 2, 1, 16000.00), 
(7, 4, 15,7000.00);


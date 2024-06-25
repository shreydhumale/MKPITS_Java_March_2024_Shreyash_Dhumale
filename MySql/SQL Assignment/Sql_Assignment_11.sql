
/*1.Retrieve the names and addresses of all suppliers in 'Los Angeles'.*/
SELECT s.Name,s.Address
FROM Supplier s 
WHERE s.City="Los Angeles";

/*2.Find the total quantity of products sold.
*/
SELECT SUM(Quantity) AS Total_Quantity_Sold
FROM Sale;

/*3.List all purchases of product ID 'P001' sorted by date in ascending order*/
SELECT *
FROM Purchase
WHERE Product_Id = 'P001'
ORDER BY Date ASC;

/*4.Find the names of products that have been sold more than 100 times*/
SELECT pm.Name,COUNT(s.Quantity)
FROM ProductMaster pm
join sale s on s.Product_Id=pm.Product_id
GROUP by pm.Product_Id
HAVING COUNT(s.quantity)>100


/*5. Retrieve the product ID and name of the product with the highest price.
*/
SELECT p.Product_id,p.Name
FROM ProductMaster p 
ORDER by Price DESC
LIMIT 1;

/*6. Find the average price of products in the product master.*/
SELECT AVG(p.Price) 
FROM ProductMaster p


/*7. List the product IDs that have not been sold.*/
SELECT p.Product_id 
FROM ProductMaster p 
WHERE p.Product_id NOT IN (SELECT DISTINCT s.Product_id FROM sale s);

/*8.Retrieve the total number of sales made in the month of June 2024.*/
SELECT COUNT(s.Sale_Id) FROM sale
WHERE YEAR(Date) in (2024 ) and month(Date) in (6);

/*9.Find the quantity on hand (QOH) of the product with product ID 'P005'.*/
SELECT p.QOH
FROM ProductMaster p
WHERE QOH=p005;

/*10.List the names and total quantities purchased of products that have been purchased more than 200 times.*/
select p.name,sum(pr.quantity) from purchase pr join
productmaster p on pr.product_id=p.product_id  
group by p.name 
having count(pr.product_id)>200;
select * from purchase;
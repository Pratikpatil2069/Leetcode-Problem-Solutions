# Write your MySQL query statement below
SELECT C.customer_id 
FROM Customer C
GROUP BY C.customer_id
HAVING COUNT(DISTINCT product_key)=(SELECT COUNT(P.product_key) FROM Product P);
# Write your MySQL query statement below
SELECT P.product_name ,S.year ,S.price 
FROM SALES S
INNER JOIN PRODUCT P
ON P.product_id = S.product_id ;

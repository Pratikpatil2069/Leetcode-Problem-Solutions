# Write your MySQL query statement below
SELECT S2.product_id, S1.first_year  , S2.quantity, S2.price 
FROM (SELECT product_id,MIN(year) AS first_year  FROM Sales GROUP BY product_id) AS S1
JOIN Sales S2
ON S1.product_id=S2.product_id
WHERE S1.first_year=S2.year ;


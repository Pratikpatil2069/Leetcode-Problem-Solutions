# Write your MySQL query statement below
SELECT P.product_name, SUM(unit) AS unit
FROM Products P
JOIN Orders O
ON P.product_id=O.product_id && MONTH(O.order_date)=2 && YEAR(O.order_date)=2020
GROUP BY P.product_id
HAVING SUM(O.unit)>=100;
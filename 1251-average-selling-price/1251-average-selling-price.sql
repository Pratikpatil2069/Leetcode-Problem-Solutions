# Write your MySQL query statement below
SELECT P.product_id ,IFNULL(ROUND(SUM(P.PRICE*US.units)/SUM(US.UNITS),2),0)  AS average_price 
FROM Prices P
left JOIN UnitsSold US
ON P.product_id =US.product_id 
AND US.purchase_date  BETWEEN P.start_date AND P.end_date
GROUP BY P.product_id ;

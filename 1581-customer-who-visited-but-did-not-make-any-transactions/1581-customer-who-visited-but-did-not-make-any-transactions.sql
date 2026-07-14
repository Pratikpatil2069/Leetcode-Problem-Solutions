# Write your MySQL query statement below
SELECT V.customer_id ,COUNT(V.customer_id) AS count_no_trans 
FROM Visits V
left JOIN Transactions T
ON V.visit_id =T.visit_id 
where t.transaction_id is null
GROUP BY V.customer_id ;
 
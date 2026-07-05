# Write your MySQL query statement below
SELECT NAME FROM CUSTOMER 
WHERE NOT (referee_id=2) OR referee_id IS NULL; 

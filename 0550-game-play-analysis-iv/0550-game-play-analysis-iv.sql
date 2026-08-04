# Write your MySQL query statement below
SELECT ROUND(COUNT(CASE WHEN DATEDIFF(A.event_date,B.MIN_DATE)=1 THEN 1 ELSE NULL END)/COUNT( DISTINCT A.player_id),2) AS fraction 
FROM Activity A
JOIN (SELECT player_id ,MIN(event_date) AS MIN_DATE FROM Activity GROUP BY player_id ) AS B
ON A.player_id =B.player_id ;

# Write your MySQL query statement below
SELECT person_name 
FROM (SELECT person_name, SUM(weight) OVER (ORDER BY TURN) AS weight FROM Queue) AS Q
WHERE weight<=1000
ORDER BY Q.weight DESC
LIMIT 1;

# Write your MySQL query statement below
SELECT * 
FROM CINEMA
WHERE description != "boring" && ID%2!=0 
ORDER BY RATING DESC;

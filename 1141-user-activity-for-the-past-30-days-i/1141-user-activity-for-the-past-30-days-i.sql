# Write your MySQL query statement belo
SELECT activity_date AS DAY ,COUNT(DISTINCT USER_ID) AS active_users FROM Activity 
WHERE activity_date>='2019-06-28' && activity_date<='2019-07-27'
GROUP BY activity_date ;
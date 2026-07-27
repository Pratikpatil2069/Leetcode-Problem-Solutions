# Write your MySQL query statement below
SELECT E1.NAME
FROM Employee E1
JOIN Employee E2
ON E1.ID=E2.managerId
GROUP BY E1.ID,E1.NAME
HAVING COUNT(*)>=5;

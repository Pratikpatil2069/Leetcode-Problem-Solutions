# Write your MySQL query statement below
SELECT E.NAME ,B.bonus
FROM Employee E
LEFT JOIN Bonus B
ON E.empId=B.empId
WHERE B.BONUS<1000 OR B.BONUS IS NULL;
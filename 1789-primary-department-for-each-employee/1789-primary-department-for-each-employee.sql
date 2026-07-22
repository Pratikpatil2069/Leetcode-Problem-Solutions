# Write your MySQL query statement below
SELECT E1.employee_id ,E1.department_id 
FROM Employee E1
WHERE primary_flag='Y'
UNION
SELECT E1.employee_id ,E1.department_id 
FROM Employee E1
GROUP BY employee_id 
HAVING COUNT(employee_id)=1;
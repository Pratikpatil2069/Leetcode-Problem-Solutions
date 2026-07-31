SELECT MAX(salary)  AS SecondHighestSalary 
FROM Employee 
WHERE salary NOT IN
    (SELECT MAX(SALARY) FROM Employee);

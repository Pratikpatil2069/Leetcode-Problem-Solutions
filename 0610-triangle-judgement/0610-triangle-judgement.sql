# Write your MySQL query statement below
SELECT x,y,z,IF(X+Y>Z && X+Z>Y && Z+Y>X,'Yes','No') AS triangle 
FROM Triangle 
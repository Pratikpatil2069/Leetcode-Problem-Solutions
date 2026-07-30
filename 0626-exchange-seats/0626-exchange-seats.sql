SELECT s1.id,
       CASE
           WHEN s1.id % 2 = 1 THEN
               COALESCE(
                   (SELECT s2.student
                    FROM Seat s2
                    WHERE s2.id = s1.id + 1),
                   s1.student
               )
           ELSE
               (SELECT s2.student
                FROM Seat s2
                WHERE s2.id = s1.id - 1)
       END AS student
FROM Seat s1;
SELECT p.product_id,
       IF(t.new_price IS NULL, 10, t.new_price) AS price
FROM
(
    SELECT DISTINCT product_id
    FROM Products
) p
LEFT JOIN
(
    SELECT p1.product_id,
           p1.new_price
    FROM Products p1
    JOIN
    (
        SELECT product_id,
               MAX(change_date) AS max_date
        FROM Products
        WHERE change_date <= '2019-08-16'
        GROUP BY product_id
    ) x
    ON p1.product_id = x.product_id
    AND p1.change_date = x.max_date
) t
ON p.product_id = t.product_id;
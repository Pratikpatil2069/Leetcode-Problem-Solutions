# Write your MySQL query statement below
(SELECT U.name AS results
FROM MovieRating MR
JOIN Movies M
ON MR.movie_id=M.movie_id
JOIN Users U
ON MR.user_id=U.user_id
GROUP BY MR.user_id
ORDER BY COUNT(*) DESC, U.name ASC
LIMIT 1)

UNION ALL

(SELECT title AS results   
FROM MovieRating MR
JOIN Movies M
ON MR.movie_id=M.movie_id
JOIN Users U
ON MR.user_id=U.user_id
WHERE created_at>='2020-02-01' && created_at<='2020-02-29'
GROUP BY MR.movie_id
ORDER BY SUM(MR.rating)/COUNT(*) DESC, M.title ASC
LIMIT 1);


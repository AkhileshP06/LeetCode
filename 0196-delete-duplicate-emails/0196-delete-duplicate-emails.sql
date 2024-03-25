# Write your MySQL query statement below
DELETE p1
FROM Person p1
JOIN (
    SELECT MIN(id) as min_id, email
    FROM Person
    GROUP BY email
    HAVING COUNT(*) > 1
) p2 ON p1.email = p2.email AND p1.id != p2.min_id;

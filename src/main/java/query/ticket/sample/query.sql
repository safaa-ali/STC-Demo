SELECT username, tranning_date
FROM User u
INNER JOIN training_details t ON(u.user_id = t.user_id)
GROUP BY username, tranning_date
HAVING COUNT(*) > 1
ORDER BY  tranning_date DESC
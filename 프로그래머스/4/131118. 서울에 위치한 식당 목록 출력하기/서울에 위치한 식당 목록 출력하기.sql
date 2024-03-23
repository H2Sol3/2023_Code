SELECT i.REST_ID, i.REST_NAME, i.FOOD_TYPE, i.FAVORITES , i.ADDRESS, round(avg(REVIEW_SCORE),2) SCORE from REST_INFO i
join REST_REVIEW r
on i.REST_ID = r.REST_ID
where i.ADDRESS like "서울%"
GROUP BY i.REST_ID
order by score desc, i.FAVORITES desc
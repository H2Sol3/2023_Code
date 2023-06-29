-- 코드를 입력하세요
SELECT user_id, PRODUCT_ID from online_sale
group by user_id,PRODUCT_ID
having count(*) > 1
ORDER BY USER_ID ASC, PRODUCT_ID DESC;

-- 코드를 입력하세요
SELECT left(PRODUCT_CODE,2) AS CATEGORY, COUNT(PRODUCT_CODE) AS PRODUCT from PRODUCT 
GROUP BY CATEGORY
ORDER BY CATEGORY
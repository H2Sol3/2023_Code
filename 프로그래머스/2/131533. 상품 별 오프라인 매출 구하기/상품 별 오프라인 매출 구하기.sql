SELECT PRODUCT_CODE, SUM(PRICE*SALES_AMOUNT) AS SALES FROM PRODUCT P
JOIN OFFLINE_SALE S
ON P.PRODUCT_ID = S.PRODUCT_ID
GROUP BY 1
ORDER BY 2 DESC, 1
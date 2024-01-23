-- 코드를 입력하세요
SELECT product_code, sum(PRICE * SALES_AMOUNT) as sales from product p 
join offline_sale s
on p.product_id = s.product_id
group by s.PRODUCT_ID
order by sales desc, product_code
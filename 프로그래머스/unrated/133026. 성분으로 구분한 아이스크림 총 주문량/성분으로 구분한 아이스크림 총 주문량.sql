-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, sum(TOTAL_ORDER) as TOTAL_ORDER from first_half h
join icecream_info i
on h.FLAVOR = i.FLAVOR
group by INGREDIENT_TYPE
order by total_order
-- 코드를 입력하세요
SELECT h.flavor from FIRST_HALF h
join ICECREAM_INFO i
on h.flavor = i.flavor
where TOTAL_ORDER>3000 
and INGREDIENT_TYPE like "fruit_based";
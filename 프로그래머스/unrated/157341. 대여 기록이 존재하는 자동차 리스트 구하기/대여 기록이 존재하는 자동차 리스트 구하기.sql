-- 코드를 입력하세요
SELECT c.car_id from CAR_RENTAL_COMPANY_CAR c
join CAR_RENTAL_COMPANY_RENTAL_HISTORY h
on c.car_id = h.car_id
where h.START_DATE like "2022-10%" and c.car_type = "세단"
group by c.car_id
order by car_id desc;
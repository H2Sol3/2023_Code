-- 코드를 작성해주세요
select count(*) FISH_COUNT,month(time) MONTH from fish_info
group by MONTH
order by 2
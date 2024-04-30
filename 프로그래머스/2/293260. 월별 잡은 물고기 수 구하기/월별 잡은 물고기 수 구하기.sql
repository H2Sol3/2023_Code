select count(*) FISH_COUNT,month(time) MONTH from fish_info
group by MONTH
order by 2
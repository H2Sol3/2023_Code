SELECT f.FLAVOR from first_half f
join JULY j
on f.flavor = j.flavor
group by f.flavor
order by sum(f.TOTAL_ORDER)+sum(j.TOTAL_ORDER) desc
limit 3
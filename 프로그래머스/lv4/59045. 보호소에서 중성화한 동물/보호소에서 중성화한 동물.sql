-- 코드를 입력하세요
SELECT o.ANIMAL_ID,o.ANIMAL_TYPE,o.NAME from ANIMAL_INS i
join ANIMAL_OUTS o
on i.animal_id = o.animal_id
where i.SEX_UPON_INTAKE like "Intact%" 
and (o.SEX_UPON_OUTCOME like "Spayed%" or o.SEX_UPON_OUTCOME like "Neutered%")
order by o.ANIMAL_ID

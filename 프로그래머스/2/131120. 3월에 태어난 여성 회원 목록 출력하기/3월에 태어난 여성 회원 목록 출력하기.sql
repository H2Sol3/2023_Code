SELECT MEMBER_ID,MEMBER_NAME,GENDER,date_format(DATE_OF_BIRTH, "%Y-%m-%d") as DATE_OF_BIRTH 
FROM MEMBER_PROFILE 
WHERE DATE_OF_BIRTH like "%-03-%" and TLNO is not null and gender = "W"
ORDER BY member_id;
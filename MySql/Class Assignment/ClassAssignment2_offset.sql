use mydatabase;
select * from marksdetails;

select Rollno, sum(physics+chemistry+Maths) as total
from marksdetails
group by Rollno
order by total desc
limit 1
offset 4

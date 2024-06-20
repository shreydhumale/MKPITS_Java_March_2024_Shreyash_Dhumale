use mydatabase;
select * from marksdetails;

select Rollno
from marksdetails
group by Rollno
limit 6
offset 2

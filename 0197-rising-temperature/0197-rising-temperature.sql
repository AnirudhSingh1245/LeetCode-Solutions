# Write your MySQL query statement below
select i1.id from weather as i1 join weather as i2 on datediff(i1.recorddate,i2.recorddate)=1 where i1.temperature>i2.temperature; 
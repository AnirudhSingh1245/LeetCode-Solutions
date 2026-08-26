# Write your MySQL query statement below
select e2.name from employee e1 join employee e2 on e1.managerID=e2.id group by e2.id having count(e1.id)>=5;
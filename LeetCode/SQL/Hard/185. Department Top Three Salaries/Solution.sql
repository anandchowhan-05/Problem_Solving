# Write your MySQL query statement below
select (
           SELECT d.name
           FROM Department d
           WHERE d.id=e.departmentId
       ) AS Department,e.name as Employee,e.salary as Salary
from (select name,salary,departmentId,dense_rank() over(partition by departmentId order by salary desc) as ans
from Employee
) e
where e.ans < 4;
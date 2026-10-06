# Write your MySQL query statement below
select id as Id from
(select id,temperature,lag(temperature) over(order by recordDate) as prev
from Weather) e
where temperature > prev;
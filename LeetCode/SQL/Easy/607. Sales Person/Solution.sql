-- # Write your MySQL query statement below
-- select (select s.name from SalesPerson s
-- where s.sales_id != o.sales_id) as name
-- from (c.com_id,c.name from Company c Inner Join Orders o on c.com_id= o.com_id); 

select name from SalesPerson
where sales_id not in (
    select o.sales_id from Orders o
    join Company c on o.com_id=c.com_id
    where c.name ='Red'
);
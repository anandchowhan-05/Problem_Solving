CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
      select max(salary) as 'getNthHighestSalary(n)' from employee where salary < (select max(salary) from employee)

  );
END
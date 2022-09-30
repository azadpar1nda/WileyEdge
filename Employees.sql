show databases;
create database employee;
use employee;
create table employee(
Employee_id int auto_increment primary key,
First_name varchar(50),
Last_NAME varchar(50),
Salary int,
Joining_date date,
Departement varchar(50)
);

desc employee;
create table reward(
employee_ref_id int,
date_reward date,
amount int,
foreign key (Employee_ref_id) references employee(Employee_id)
);
desc reward;
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (1, 'Bob', 'Kinto', 1000000, "2019-01-20", "Finance");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (2, 'Jerry', 'Kansxo', 6000000, "2019-01-15", "IT");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (3, 'Philip', 'Jose', 8900000, "2019-02-05", "Banking");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (4, 'John', 'Abraham', 2000000, "2019-02-25", "Insurance");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (5, 'Michael', 'Mathew', 2200000, "2019-02-28", "Finance");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (6, 'Alex', 'chreketo', 4000000, "2019-05-10", "IT");
INSERT INTO Employee (Employee_id, First_name, Last_name, Salary, Joining_date, Departement) VALUES (7, 'Yohan', 'Soso', 1230000, "2019-06-20", "Banking");

INSERT INTO reward (Employee_ref_id, date_reward, amount) VALUES (1, '2019-05-11', '1000');
INSERT INTO reward (Employee_ref_id, date_reward, amount) VALUES (2, '2019-02-15', '5000');
INSERT INTO reward (Employee_ref_id, date_reward, amount) VALUES (3, '2019-04-22', '2000');
INSERT INTO reward (Employee_ref_id, date_reward, amount) VALUES (1, '2019-06-20', '8000');

select * from employee;
select first_name,last_name from employee;
select First_Name as "Employee Name" from employee;
select lower(Last_name) from employee;
select upper(Last_Name) from employee;
select distinct departement from employee;
select left(first_name,4) from employee ;
select length(first_name) from employee;
select position("h" in first_name)  from employee where first_name="john";
select rtrim(first_name) from employee;
select ltrim(first_name) from employee;
select replace(first_name,"o","#") from employee;
select year(joining_date),month(joining_date),day(joining_date) from employee;
select * from employee order by first_name;
select * from employee order by first_name desc;
select * from employee order by first_name and salary desc;
select * from employee where first_name="bob" ;
select * from employee where first_name  in ("bob","alex") ;
select * from employee where first_name not in ("bob","alex") ;
select * from employee where first_name like("j%") and length(first_name)=4 ;
select * from employee where month(joining_date)="1" ;
select * from employee where  joining_date < date("2019-03-1") ;
select datediff(r.date_reward,e.joining_date) from employee as e ,reward as r where e.employee_id=r.employee_ref_id; 







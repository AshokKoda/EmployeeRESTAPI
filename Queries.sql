use employeedb;

create table employee(
	id int not null auto_increment,
    fname varchar(50) not null,
    lname varchar(50) not null,
    email varchar(50) not null,
    phoneno varchar(50) not null,
    doj varchar(10),
    salary Double not null,
    primary key(id)
);

select * from employee;

alter table employee
add total_salary int,
add tax_pay int;

update employee set total_salary=(salary*12) where id!=0;
update employee set tax_pay=(total_salary-12500) where id!=0;
create table departments()(
    department varchar(100),
    division varchar(100),
    primary key (department)
);



create table employees(
    employee_id INT,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(50),
    hire_date DATE,
    department VARCHAR(17),
    gender VARCHAR(1),
    salary INT,
    primary key (employee_id)
);
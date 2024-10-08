CREATE DATABASE hospitals_db;

USE hospitals_db;

CREATE TABLE employees (
						  employee_id INT PRIMARY KEY,
						  department VARCHAR(50),
						  name VARCHAR(100),
						  status VARCHAR(20)
);

CREATE TABLE patients (
						 patient_id INT PRIMARY KEY,
						 name VARCHAR(100),
						 date_of_birth DATE,
						 admitted_by INT,
						 FOREIGN KEY (admitted_by) REFERENCES employees(employee_id)
);
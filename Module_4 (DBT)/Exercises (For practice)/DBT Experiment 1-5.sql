CREATE DATABASE EXPERIMENTS;
SHOW DATABASES;
USE EXPERIMENTS;
CREATE TABLE SEMP (
  EMPNO CHAR(4),
  EMPNAME CHAR(20),
  BASIC FLOAT,
  DEPTNO CHAR(2),
  DEPTHEAD CHAR(4)
);
CREATE TABLE SDEPT (
	DEPTNO CHAR(2),
    DEPTNAME CHAR(15)
);
INSERT INTO SDEPT(DEPTNO, DEPTNAME) VALUES
('10', 'Development'),
('20', 'Training');

INSERT INTO SEMP(EMPNO, EMPNAME, BASIC, DEPTNO, DEPTHEAD) VALUES
('0001', 'SUNIL', 6000, '10', NULL),
('0002', 'HIREN', 8000, '20', NULL),
('0003', 'ALI', 4000, '10', '0001'),
('0004', 'GEORGE', 6000, NULL, '0002');

DESC SEMP;
SELECT * FROM SEMP;
DESC SDEPT;

show databases;
use experiments;
show tables;
create table supplier 
(
 S_num VARCHAR(2) PRIMARY KEY,  -- Renamed column to avoid reserved word issues
    S_name VARCHAR(50),             -- Renamed column to avoid reserved word issues
    Status INT,
    City VARCHAR(50)
);
INSERT INTO SUPPLIER (S_num, S_name, Status, City) VALUES
('S1', 'Supplier A', 10, 'London'),
('S2', 'Supplier B', 20, 'Paris'),
('S3', 'Supplier C', 30, 'Athens'),
('S4', 'Supplier D', 25, 'London'),
('S5', 'Supplier E', 15, 'Berlin');
CREATE TABLE PARTS (
    P_num VARCHAR(2) PRIMARY KEY,
    P_name VARCHAR(50),
    Color VARCHAR(20),
    Weight INT,
    City VARCHAR(50)
);
INSERT INTO PARTS (P_num, P_name, Color, Weight, City) VALUES
('P1', 'Part A', 'Red', 12, 'London'),
('P2', 'Part B', 'Blue', 14, 'Paris'),
('P3', 'Part C', 'Green', 13, 'Athens'),
('P4', 'Part D', 'Yellow', 15, 'Berlin');

CREATE TABLE PROJECTS (
    J_num VARCHAR(2) PRIMARY KEY,
    J_name VARCHAR(50),
    City VARCHAR(50)
);
CREATE TABLE SPJ (
    S_num VARCHAR(2),
    P_num VARCHAR(2),
    J_num VARCHAR(2),
    Qty INT,
    PRIMARY KEY (S_num, P_num, J_num)
    );
INSERT INTO SPJ (S_num, P_num, J_num, Qty) VALUES
('S1', 'P1', 'J1', 10),
('S2', 'P2', 'J2', 20),
('S3', 'P3', 'J3', 15),
('S4', 'P4', 'J1', 5);
SELECT * FROM SUPPLIER;
SELECT S_num, S_name FROM SUPPLIER;
SELECT P_name, Color FROM PARTS WHERE City = 'London';
SELECT * FROM SUPPLIER WHERE City IN ('Paris', 'Athens');
SELECT * FROM PROJECTS WHERE City = 'Athens';
SELECT P_name FROM PARTS WHERE Weight BETWEEN 12 AND 14;
SELECT * FROM SUPPLIER WHERE Status >= 20;
SELECT * FROM SUPPLIER WHERE City <> 'London';
SELECT DISTINCT City FROM SUPPLIER;
SELECT P_name, Weight / 1000.0 AS Weight_KG FROM PARTS;
SELECT 
    P_name, 
    Weight * 1000 AS Weight_MG,  -- Convert grams to milligrams
    Weight / 1000.0 AS Weight_KG   -- Convert grams to kilograms
FROM PARTS;

-- exercise 2

show databases;
use dbt;
show tables;
SELECT * FROM SUPPLIER ORDER BY City DESC;
SELECT * FROM PARTS ORDER BY City ASC, P_name ASC;
SELECT * FROM SUPPLIER WHERE Status BETWEEN 10 AND 20;
SELECT P_name, Weight FROM PARTS WHERE Weight NOT BETWEEN 10 AND 15;
SELECT P_name FROM PARTS WHERE P_name LIKE 'S%';
SELECT * FROM SUPPLIER WHERE City LIKE 'L%';
SELECT * FROM PROJECTS WHERE J_name LIKE 'N%';

-- exercise 3

show databases;
use dbt;
show tables;
SELECT CONCAT(UPPER(LEFT(S_name, 1)), LOWER(SUBSTRING(S_name, 2))) AS CapitalizedName FROM SUPPLIER;
SELECT UPPER(S_name) AS UpperCaseName FROM SUPPLIER;
SELECT LOWER(S_name) AS LowerCaseName FROM SUPPLIER;
SELECT lpda (S_name, 25) AS PaddedName FROM SUPPLIER;
SELECT REPLACE(REPLACE(S_name, 'l', 'r'), 'a', 'o') AS ModifiedName FROM SUPPLIER;
SELECT S_name, LENGTH(S_name) AS NameLength FROM SUPPLIER;
SELECT * FROM SUPPLIER WHERE SOUNDEX(S_name) = SOUNDEX('BLOKE');
SELECT S_name, 
    CASE 
        WHEN Status = 10 THEN 'Ten'
        WHEN Status = 20 THEN 'Twenty'
        WHEN Status = 30 THEN 'Thirty'
        ELSE 'Other'
    END AS StatusName
FROM SUPPLIER;
SELECT DAYNAME(CURDATE()) AS CurrentDay;

-- exercise 4

show databases;
use dbt;
show tables;
SELECT MIN(Status) AS MinStatus FROM SUPPLIER;
SELECT MAX(Weight) AS MaxWeight FROM PARTS;
SELECT AVG(Weight) AS AvgWeight FROM PARTS;
SELECT SUM(Qty) AS TotalQuantitySold FROM SPJ WHERE P_num = 'P1';
SELECT P_num, SUM(Qty) AS TotalQuantitySold FROM SPJ GROUP BY P_num;
SELECT P_num, AVG(Qty) AS AvgQuantitySold FROM SPJ GROUP BY P_num;
SELECT P_num, MAX(Qty) AS MaxQuantitySold 
FROM SPJ 
GROUP BY P_num 
HAVING MAX(Qty) > 800;
SELECT Status, COUNT(*) AS SupplierCount 
FROM SUPPLIER 
GROUP BY Status;
SELECT City, COUNT(*) AS ProjectCount 
FROM PROJECTS 
GROUP BY City;
SELECT 
    CASE 
        WHEN Status = 10 THEN 'Ten'
        WHEN Status = 20 THEN 'Twenty'
        WHEN Status = 30 THEN 'Thirty'
        ELSE 'Other'
    END AS Status,
    COUNT(*) AS Count
FROM SUPPLIER
GROUP BY Status
ORDER BY Status;  -- Ensures the output is in order of status values

-- exercise 5

show databases;
use dbt;
show tables;


#1. Display the Supplier name and the Quantity sold.

SELECT S.S_name, SUM(SPJ.Qty) AS TotalQuantitySold
FROM SUPPLIER S
JOIN SPJ ON S.S_num = SPJ.S_num
GROUP BY S.S_name;

#2. Display the Part name and Quantity sold.

SELECT P.P_name, SUM(SPJ.Qty) AS TotalQuantitySold
FROM PARTS P
JOIN SPJ ON P.P_num = SPJ.P_num
GROUP BY P.P_name;

#3. Display the Project name and Quantity sold.

SELECT J.J_name, SUM(SPJ.Qty) AS TotalQuantitySold
FROM PROJECTS J
JOIN SPJ ON J.J_num = SPJ.J_num
GROUP BY J.J_name;

#4. Display the Supplier name, Part name, Project name and Quantity sold.

SELECT S.S_name, P.P_name, J.J_name, SPJ.Qty
FROM SPJ
JOIN SUPPLIER S ON SPJ.S_num = S.S_num
JOIN PARTS P ON SPJ.P_num = P.P_num
JOIN PROJECTS J ON SPJ.J_num = J.J_num;
#5. Display the Supplier name, supplying Parts to a Project in the same City.

SELECT S.S_name, P.P_name, J.J_name
FROM SUPPLIER S
JOIN SPJ ON S.S_num = SPJ.S_num
JOIN PARTS P ON SPJ.P_num = P.P_num
JOIN PROJECTS J ON SPJ.J_num = J.J_num
WHERE S.City = J.City;
#6. Display the Part name that is ‘Red’ in color, and the Quantity sold.

SELECT P.P_name, SUM(SPJ.Qty) AS TotalQuantitySold
FROM PARTS P
JOIN SPJ ON P.P_num = SPJ.P_num
WHERE P.Color = 'Red'
GROUP BY P.P_name;

#7. Display all the Quantity sold by Suppliers with the Status = 20.

SELECT SUM(SPJ.Qty) AS TotalQuantitySold
FROM SUPPLIER S
JOIN SPJ ON S.S_num = SPJ.S_num
WHERE S.Status = 20;

#8. Display all the Parts and Quantity with a Weight > 14.
SELECT P.P_name, SUM(SPJ.Qty) AS TotalQuantitySold
FROM PARTS P
JOIN SPJ ON P.P_num = SPJ.P_num
WHERE P.Weight > 14
GROUP BY P.P_name;

#9. Display all the Project names and City, which has bought more than 500 Parts.
SELECT J.J_name, J.City, SUM(SPJ.Qty) AS TotalQuantity
FROM PROJECTS J
JOIN SPJ ON J.J_num = SPJ.J_num
GROUP BY J.J_name, J.City
HAVING SUM(SPJ.Qty) > 500;
#10. Display all the Part names and Quantity sold that have a Weight less than 15.

SELECT P.P_name, SUM(SPJ.Qty) AS TotalQuantitySold
FROM PARTS P
JOIN SPJ ON P.P_num = SPJ.P_num
WHERE P.Weight < 15
GROUP BY P.P_name;
#11. Display all the Employee names and the name of their Managers.
#Assuming there is an EMPLOYEES table with a ManagerID column:

SELECT E.EmployeeName, M.EmployeeName AS ManagerName
FROM EMPLOYEES E
LEFT JOIN EMPLOYEES M ON E.ManagerID = M.EmployeeID;


create database exp6;
show databases;
create table CompanyDB;
use CompanyDB;
SELECT E.EmployeeName, M.EmployeeName AS ManagerName
FROM EMPLOYEES E
LEFT JOIN EMPLOYEES M ON E.ManagerID = M.EmployeeID;
CREATE TABLE CompanyDB (
    EmployeeID INT PRIMARY KEY,
    EmployeeName VARCHAR(100),
    DepartmentID INT,
    ManagerID INT,
    Salary DECIMAL(10, 2),
    FOREIGN KEY (ManagerID) REFERENCES Employees(EmployeeID)
);
INSERT INTO Employees (EmployeeID, EmployeeName, DepartmentID, ManagerID, Salary) VALUES
(1, 'JOHN SMITH', 101, NULL, 70000.00),      -- Manager (no manager)
(2, 'JANE DOE', 102, 1, 60000.00),            -- Reports to JOHN SMITH
(3, 'MICHAEL BROWN', 101, 1, 65000.00),      -- Reports to JOHN SMITH
(4, 'EMILY DAVIS', 103, 2, 45000.00),        -- Reports to JANE DOE
(5, 'WILLIAM JOHNSON', 102, 2, 72000.00),    -- Reports to JANE DOE
(6, 'SARAH WILSON', 104, 3, 58000.00),       -- Reports to MICHAEL BROWN
(7, 'DAVID MsupplierILLER', 101, NULL, 80000.00),    -- Manager (no manager)
(8, 'LISA CLARK', 105, 7, 62000.00),          -- Reports to DAVID MILLER
(9, 'JAMES TAYLOR', 104, 7, 50000.00);        -- Reports to DAVID MILLER

SELECT 
    E.EmployeeName AS EmployeeName,
    M.EmployeeName AS ManagerName
FROM 
    Employees E
LEFT JOIN 
    Employees M ON E.ManagerID = M.EmployeeID;

CREATE TABLE Suppliers (
    SupplierID INT PRIMARY KEY,
    SupplierName VARCHAR(100),
    Status VARCHAR(50)
);

INSERT INTO Suppliers (SupplierID, SupplierName, Status) VALUES
(1, 'CLARK', 'Active'),
(2, 'ABC Supplies', 'Inactive'),
(3, 'XYZ Corp', 'Active');
SELECT *
FROM Suppliers
WHERE Status = (SELECT Status FROM Suppliers WHERE SupplierName = 'CLARK');
CREATE TABLE Partss (
    PartID INT PRIMARY KEY,
    PartName VARCHAR(100),
    Weight DECIMAL(10, 2),
    Color VARCHAR(20)
);

INSERT INTO Partss (PartID, PartName, Weight, Color) VALUES
(1, 'Part A', 2.5, 'Red'),
(2, 'Part B', 3.0, 'Green'),
(3, 'Part C', 1.5, 'Blue');

CREATE TABLE Projectss (
    ProjectID INT PRIMARY KEY,
    ProjectName VARCHAR(100),
    City VARCHAR(50)
);

INSERT INTO Projectss (ProjectID, ProjectName, City) VALUES
(1, 'TAPE', 'New York'),
(2, 'BRIDGE', 'Los Angeles');

CREATE TABLE Departments (
    DepartmentID INT PRIMARY KEY,
    DepartmentName VARCHAR(100)
);

INSERT INTO Departments (DepartmentID, DepartmentName) VALUES
(101, 'Sales'),
(102, 'Marketing'),
(103, 'Human Resources'),
(104, 'IT'),
(105, 'Finance');

SELECT *
FROM Employees
WHERE DepartmentID = (SELECT DepartmentID FROM Employees WHERE EmployeeName = 'DAVID MILLER');

SELECT *
FROM Partss
WHERE Weight > ALL (SELECT Weight FROM Parts WHERE Color = 'Red');
SELECT *
FROM Projectss
WHERE City = (SELECT City FROM Projectss WHERE ProjectName = 'TAPE');

SELECT *
FROM Partss
WHERE Weight < ALL (SELECT Weight FROM Partss WHERE Color = 'Green');

SELECT EmployeeName
FROM Employees
ORDER BY Salary ASC
LIMIT 1;

SELECT D.DepartmentName
FROM Departments D
WHERE D.DepartmentID = (
    SELECT DepartmentID
    FROM Employees
    GROUP BY DepartmentID
    ORDER BY COUNT(*) DESC
    LIMIT 1
);

CREATE TABLE Sales (
    SaleID INT PRIMARY KEY AUTO_INCREMENT,
    SupplierID INT,
    Quantity INT,
    SaleDate DATE,
    FOREIGN KEY (SupplierID) REFERENCES Suppliers(SupplierID)
);
INSERT INTO Sales (SupplierID, Quantity, SaleDate) VALUES
(1, 100, '2024-01-15'),  -- CLARK sold 100 units
(1, 200, '2024-02-20'),  -- CLARK sold 200 units
(2, 150, '2024-01-25'),  -- ABC Supplies sold 150 units
(3, 300, '2024-03-05'),  -- XYZ Corp sold 300 units
(1, 250, '2024-04-10'),  -- CLARK sold 250 units
(2, 50, '2024-05-12');    -- ABC Supplies sold 50 units

SELECT S.SupplierName
FROM Suppliers S
JOIN Sales Sa ON S.SupplierID = Sa.SupplierID
ORDER BY Sa.Quantity DESC
LIMIT 1;

SELECT S.SupplierName
FROM Suppliers S
JOIN Sales Sa ON S.SupplierID = Sa.SupplierID
GROUP BY S.SupplierID
ORDER BY SUM(Sa.Quantity) DESC
LIMIT 1;
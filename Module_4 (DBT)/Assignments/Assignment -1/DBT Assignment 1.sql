SHOW databases;
use assignments;
create table salespeople(
    Snum INT(4),
    Sname VARCHAR(10),
    City VARCHAR(10),
    Comm FLOAT(3,2)
);
INSERT INTO SALESPEOPLE VALUES
    (1001, 'Peel', 'London', 0.12), 
    (1002, 'Serres', 'San Jose', 0.13),
    (1004, 'Motika', 'London', 0.11),
    (1007, 'Rifkin', 'Barcelona', 0.15),
    (1003, 'Axelrod', 'New York', 0.10); 
select * from SALESPEOPLE;
CREATE TABLE ORDERS (
    Onum INT(4),
    Amt FLOAT(7,2),
    Odate DATE,
    Cnum INT(4),
    Snum INT(4)
);
INSERT INTO ORDERS VALUES
    (3001, 18.69, '1990-10-03', 2008, 1007),
    (3003, 767.19, '1990-10-03', 2001, 1001),
    (3002, 1900.10, '1990-10-03', 2007, 1004),
    (3005, 5160.45, '1990-10-03', 2003, 1002),
    (3006, 1098.16, '1990-10-03', 2008, 1007),
    (3009, 1713.23, '1990-10-04', 2002, 1003),
    (3007, 75.75, '1990-10-04', 2004, 1002),
    (3008, 4723.00, '1990-10-05', 2006, 1001),
    (3010, 1309.95, '1990-10-06', 2004, 1002),
    (3011, 9891.88, '1990-10-06', 2006, 1001);
select * from orders;
show databases;
use assignments;
show tables;
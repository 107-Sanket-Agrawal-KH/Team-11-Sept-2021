create table SEMP(
EMPNO CHAR(4) ,
 EMPNAME CHAR(20),
 BASIC FLOAT,
 DEPTNO CHAR(2), 
 DEPTHEAD CHAR(4)
);
insert into SEMP (EMPNO,EMPNAME,BASIC,DEPTNO,DEPTHEAD)values
('101','Sank',3000,'1','Mech'),
('102','Amit',5000,'2','Elec'),
('103','Anki',1000,'3','Mech'),
('104','Ash',3000,'4','Mech');
select * from SEMP;
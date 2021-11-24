create table SUPPLIER 
(`S#` char(3), Sname char(10), status int(10), City char(10));
create table PARTS 
(`P#` char(3), Pname char(20), Color char(20), Weight int(20), City char(10));
create table PROJECTS 
(`J#` char(3), Jname char(20), City char(20)); 
insert into SUPPLIER (`S#`, Sname,Status,City) values
('S1','Sanket',10,'Amravati'),
('S2','Saurabh',20,'Nagpur'),
('S3','Sagar',30,'Aurangabad');
select * from Supplier;
insert into PARTS (`P#`,Pname,Color,Weight,City) values
('P1','Screw','White',20,'Paris'),
('P2','Plug','Green',40,'London'),
('P3','Wire','Red',20,'Anthens');
select * from PARTS;
insert into PROJECTS (`J#`, Jname,City) values
('J1','Water','Kolkata'),
('J2','Science','Kanpur'),
('J3','Nature','Chennai');
select * from PROJECTS;
select `S#`,Sname from Supplier;
select Pname, color from PARTS where city = 'London';
select Supllier 



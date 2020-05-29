create table EMP(
ID NUMBER(7) CONSTRAINT emp_id_pk PRIMARY KEY,
LAST_NAME VARCHAR2(25) CONSTRAINT emp_ln_nn NOT NULL,
FIRST_NAME VARCHAR2(25),
DEPT_ID NUMBER(7),
CONSTRAINT emp_dept_id_fk FOREIGN KEY (DEPT_ID) REFERENCES DEPT(DEPT_ID)
);
DESCRIBE EMP;
insert into EMP values(101,'Sam','Sundar',10);
insert into EMP values(101,'Ram','Krishna',20);
insert into EMP values(102,'Gopi',null,40);
insert into EMP values(103,null,'ram',20);
select * from EMP;
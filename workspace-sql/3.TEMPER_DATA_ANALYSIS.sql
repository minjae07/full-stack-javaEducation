/*
 * SELF ����
 * 	 - ���� ���̺��� Ư�� �÷��� �������� ��Ī �Ǵ� �÷��� ����ϴ� �����̴�.
 * 	 - �� ���� ���̺��� �����͸� ������ �������� �з��� �� �����Ѵ�.
 * */

CREATE TABLE EMPLOYEE 
(
	  EMPLOYEE_ID NUMBER(2) PRIMARY KEY
	, FIRST_NAME VARCHAR2(255) NOT NULL
	, LAST_NAME VARCHAR2(255) NOT NULL
	, MANAGER_ID NUMBER(2) 		-- ������
	, FOREIGN KEY(MANAGER_ID)
	  REFERENCES EMPLOYEE(EMPLOYEE_ID)
	  ON DELETE CASCADE
);

INSERT INTO EMPLOYEE (
	  EMPLOYEE_ID 
	, FIRST_NAME 
	, LAST_NAME 
	, MANAGER_ID 
)
VALUES
(1, 'Windy', 'Hays', NULL);

SELECT * FROM EMPLOYEE;

INSERT INTO EMPLOYEE (
	  EMPLOYEE_ID
	, FIRST_NAME
	, LAST_NAME
	, MANAGER_ID
)
VALUES
(2, 'Ava', 'Christensen', 1);

INSERT INTO EMPLOYEE (
	  EMPLOYEE_ID
	, FIRST_NAME
	, LAST_NAME
	, MANAGER_ID
)
VALUES
(3, 'Hassan', 'Conner', 1);

INSERT INTO EMPLOYEE (
	  EMPLOYEE_ID
	, FIRST_NAME
	, LAST_NAME
	, MANAGER_ID
)
VALUES
(4, 'Anna', 'Reeves', 2);

INSERT INTO EMPLOYEE (
	  EMPLOYEE_ID
	, FIRST_NAME
	, LAST_NAME
	, MANAGER_ID
)
VALUES
(5, 'Sau', 'Norman', 2);

INSERT INTO EMPLOYEE (
	  EMPLOYEE_ID
	, FIRST_NAME
	, LAST_NAME
	, MANAGER_ID
)
VALUES
(6, 'Kelsie', 'Hays', 3);

INSERT INTO EMPLOYEE (
	  EMPLOYEE_ID
	, FIRST_NAME
	, LAST_NAME
	, MANAGER_ID
)
VALUES
(7, 'Tory', 'Goff', 3);

INSERT INTO EMPLOYEE (
	  EMPLOYEE_ID
	, FIRST_NAME
	, LAST_NAME
	, MANAGER_ID
)
VALUES
(8, 'Salley', 'Goff', 3);

commit;

select * from EMPLOYEE;
----------------------------------------------------------------
-- �� ������ ���� �����ڸ� �����
-- �ְ�������� 'Windy Hays'�� ��� ���տ� ���Ե��� ����.
select
     E.FIRST_NAME || ' ' || E.LAST_NAME EMPLOYEE
    ,M.FIRST_NAME || ' ' || M.LAST_NAME MANAGER
from
     EMPLOYEE E                             --EMPLOYEE ���̺��
inner join EMPLOYEE M                       --EMPLOYEE ���̺� ����
on M.EMPLOYEE_ID = E.MANAGER_ID             --EMPLOYEE_ID�� MANAGER_ID �÷��� ������.
ORDER BY MANAGER;

-- SELF LEFT OUTER ����
select
     E.FIRST_NAME || ' ' || E.LAST_NAME EMPLOYEE
    ,M.FIRST_NAME || ' ' || M.LAST_NAME MANAGER
from
     EMPLOYEE E                             --EMPLOYEE ���̺��
LEFT OUTER JOIN  EMPLOYEE M                       --EMPLOYEE ���̺� ����
on M.EMPLOYEE_ID = E.MANAGER_ID             --EMPLOYEE_ID�� MANAGER_ID �÷��� ������.
ORDER BY MANAGER;

----------------------------------------------------

--oracle join
select
     E.FIRST_NAME || ' ' || E.LAST_NAME EMPLOYEE
    ,M.FIRST_NAME || ' ' || M.LAST_NAME MANAGER
from
     EMPLOYEE E, EMPLOYEE M                      
where M.EMPLOYEE_ID = E.MANAGER_ID            
ORDER BY MANAGER;

--oracle join
select
     E.FIRST_NAME || ' ' || E.LAST_NAME EMPLOYEE
    ,M.FIRST_NAME || ' ' || M.LAST_NAME MANAGER
from
     EMPLOYEE E, EMPLOYEE M                       
where M.EMPLOYEE_ID(+) = E.MANAGER_ID             
ORDER BY MANAGER;





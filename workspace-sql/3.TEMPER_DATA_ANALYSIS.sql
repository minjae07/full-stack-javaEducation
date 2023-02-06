/*
 * SELF 조인
 * 	 - 같은 데이블끼리 특정 컬럼을 기준으로 매칭 되는 컬럼을 출력하는 조인이다.
 * 	 - 즉 같은 테이블의 데이터를 각각의 집합으로 분류한 후 조인한다.
 * */

CREATE TABLE EMPLOYEE 
(
	  EMPLOYEE_ID NUMBER(2) PRIMARY KEY
	, FIRST_NAME VARCHAR2(255) NOT NULL
	, LAST_NAME VARCHAR2(255) NOT NULL
	, MANAGER_ID NUMBER(2) 		-- 관리자
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
-- 각 직원의 상위 관리자를 출력함
-- 최고관리자인 'Windy Hays'는 결과 집합에 포함되지 않음.
select
     E.FIRST_NAME || ' ' || E.LAST_NAME EMPLOYEE
    ,M.FIRST_NAME || ' ' || M.LAST_NAME MANAGER
from
     EMPLOYEE E                             --EMPLOYEE 테이블과
inner join EMPLOYEE M                       --EMPLOYEE 테이블 조인
on M.EMPLOYEE_ID = E.MANAGER_ID             --EMPLOYEE_ID와 MANAGER_ID 컬럼을 조인함.
ORDER BY MANAGER;

-- SELF LEFT OUTER 조인
select
     E.FIRST_NAME || ' ' || E.LAST_NAME EMPLOYEE
    ,M.FIRST_NAME || ' ' || M.LAST_NAME MANAGER
from
     EMPLOYEE E                             --EMPLOYEE 테이블과
LEFT OUTER JOIN  EMPLOYEE M                       --EMPLOYEE 테이블 조인
on M.EMPLOYEE_ID = E.MANAGER_ID             --EMPLOYEE_ID와 MANAGER_ID 컬럼을 조인함.
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





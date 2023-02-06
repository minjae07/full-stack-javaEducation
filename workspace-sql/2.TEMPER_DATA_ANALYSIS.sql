/*
 * 	JOIN의 개념, 종류
 * 		1.JOIN : 
 * 			1)서로 다른 테이블을 공통 컬럼을 기준으로 합치는(결합하는) 테이블 단위 연산
 * 			2)2개 이상의 테이블에 있는 정보 중 사용자가 필요한 집합(테이블)에 맞게 가상의 테이블처럼 만들어서
 *            결과를 보여주는 것이다.
 * 		2.조인의 종류
 * 			1)INNER 조인 : 특정 컬럼을 기준으로 정확히 매칭된 집합을 출력한다. (교집합)
                           대표적인 조인의 종류이다.
 * 			2)OUTER 조인 : 특정 컬럼을 기준으로 매칭된 집합을 출력하지만 
 * 						  한쪽의 집합은 모두 출력하고 다른 한쪽의 집합은 매칭되는 컬럼의 값만 출력한다. (차집합)
 * */
DROP TABLE BASKET_A CASCADE CONSTRAINT;
CREATE TABLE BASKET_A
(
	 ID	NUMBER(2)
	,FRUIT	VARCHAR2(100) NOT NULL
	,CONSTRAINT BASKET_A_PK PRIMARY KEY(ID)
);
SELECT * FROM BASKET_A ba ;		-- 공집합
---------------------------------------------------------
DROP TABLE BASKET_B CASCADE CONSTRAINT;
CREATE TABLE BASKET_B
(
	 ID	NUMBER(2)
	,FRUIT	VARCHAR2(100) NOT NULL
	,CONSTRAINT BASKET_B_PK PRIMARY KEY(ID)
);
SELECT * FROM BASKET_B ba ;		-- 공집합

INSERT INTO DASQL.BASKET_A(ID, FRUIT)
VALUES (1, 'Apple');
INSERT INTO DASQL.BASKET_A(ID, FRUIT)
VALUES (2, 'Orange');
INSERT INTO DASQL.BASKET_A(ID, FRUIT)
VALUES (3, 'Banana');
INSERT INTO DASQL.BASKET_A(ID, FRUIT)
VALUES (4, 'Cucumber');
commit;
select * from BASKET_A;
------------------------------------------------
INSERT INTO DASQL.BASKET_B(ID, FRUIT)
VALUES (1, 'Orange');
INSERT INTO DASQL.BASKET_B(ID, FRUIT)
VALUES (2, 'Apple');
INSERT INTO DASQL.BASKET_B(ID, FRUIT)
VALUES (3, 'Watermelon');
INSERT INTO DASQL.BASKET_B(ID, FRUIT)
VALUES (4, 'Pear');
commit;
select * from BASKET_B;


select
     A.ID ID_A
    ,A.FRUIT FRUIT_A
    ,B.ID ID_B
    ,B.FRUIT FRUIT_B
from BASKET_A A
INNER JOIN BASKET_B B
ON A.FRUIT = B.FRUIT;           -- FRUIT 컬럼 기준으로 조인한다.

------------------------------------------------

select
     A.ID ID_A
    ,A.FRUIT FRUIT_A
    ,B.ID ID_B
    ,B.FRUIT FRUIT_B
from BASKET_A A LEFT OUTER JOIN BASKET_B B
ON A.FRUIT = B.FRUIT 
WHERE B.ID IS NULL ;
------------------------------------------------------
select
     A.ID ID_A
    ,A.FRUIT FRUIT_A
    ,B.ID ID_B
    ,B.FRUIT FRUIT_B
from BASKET_A A RIGHT OUTER JOIN BASKET_B B
ON A.FRUIT = B.FRUIT
WHERE A.ID IS NULL ;

/*
 * 기준집합 -> 보고자하는 -> 기준집합 출력 -> 고객은 다 보고싶다면 -> 필터링 기준외에 물품도 보여준다.
 * */













/*
 * 	JOIN�� ����, ����
 * 		1.JOIN : 
 * 			1)���� �ٸ� ���̺��� ���� �÷��� �������� ��ġ��(�����ϴ�) ���̺� ���� ����
 * 			2)2�� �̻��� ���̺� �ִ� ���� �� ����ڰ� �ʿ��� ����(���̺�)�� �°� ������ ���̺�ó�� ����
 *            ����� �����ִ� ���̴�.
 * 		2.������ ����
 * 			1)INNER ���� : Ư�� �÷��� �������� ��Ȯ�� ��Ī�� ������ ����Ѵ�. (������)
                           ��ǥ���� ������ �����̴�.
 * 			2)OUTER ���� : Ư�� �÷��� �������� ��Ī�� ������ ��������� 
 * 						  ������ ������ ��� ����ϰ� �ٸ� ������ ������ ��Ī�Ǵ� �÷��� ���� ����Ѵ�. (������)
 * */
DROP TABLE BASKET_A CASCADE CONSTRAINT;
CREATE TABLE BASKET_A
(
	 ID	NUMBER(2)
	,FRUIT	VARCHAR2(100) NOT NULL
	,CONSTRAINT BASKET_A_PK PRIMARY KEY(ID)
);
SELECT * FROM BASKET_A ba ;		-- ������
---------------------------------------------------------
DROP TABLE BASKET_B CASCADE CONSTRAINT;
CREATE TABLE BASKET_B
(
	 ID	NUMBER(2)
	,FRUIT	VARCHAR2(100) NOT NULL
	,CONSTRAINT BASKET_B_PK PRIMARY KEY(ID)
);
SELECT * FROM BASKET_B ba ;		-- ������

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
ON A.FRUIT = B.FRUIT;           -- FRUIT �÷� �������� �����Ѵ�.

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
 * �������� -> �������ϴ� -> �������� ��� -> ���� �� ����ʹٸ� -> ���͸� ���ؿܿ� ��ǰ�� �����ش�.
 * */













SELECT * FROM DUAL;

/*	SQL (Structured Query Language)
 * 	  - �����ͺ��̽��� �ִ� �ʿ��� ������ ����Ҽ� �ֵ��� �����ִ� ���
 * 	  - �ٸ� ���(Java, C, C#..)���� �ܼ���.
 * 	  - �ϳ��� ����θ� ��� DBMS���� ��밡����.
 * 	  - ����������
 *    	
 * 
 *	DML (CRUD - Create, Read, Update, Delete)
 *	1.SELECT ��
 *		- �Ϲ������� ���̺� ����� �����͸� �������� �� ���δ�.
 *		- SQL���� ���� ���� ���̴� �����̴�.
 *	2.SELECT ����
 *		SELECT		������ �÷�
 *			 COLUMN_1
 *			,COLUMN_1 
 *		FROM		������ ���̺�� �Է�
 *		;			�����ݷ����� ����
 *  
 * */
SELECT 
	*				-- ���̺��� ��� �÷��� ��ȸ�Ѵ�.
FROM 
	TB_TEMPER		-- ���̺���� �����Ѵ�.
;	

SELECT 						-- 3
	  A.STD_DE 				-- 4
	, A.AREA_CD 
	, A.AVG_TEMPER 
FROM 						-- 1
	TB_TEMPER A; 			-- 2
-- alias(��Ī) --> �ڵ��� ������ --> SQL ���� ���
-- dbms -> ��Ƽ������	-> ����ȭ�� -> SQL -> ���������, ���� �����, ����

/*
 * 3.���͸�
 * 		WHERE ��
 * 			- ������ ������ �� � ������ ������ �������� ���� ������ �����ϴ� ���̴�.
 * 
  *	    SELECT ����
 *		SELECT		������ �÷�
 *			 COLUMN_1
 *			,COLUMN_1 
 *		FROM		������ ���̺�� �Է�
 *			 TABLE_NAME
 *		WHERE 
 *			<����>	� ������ ���������� ���� ������ �ش�.
 *					������  =  >  <  >=  <=  
 *						  <>, !=     :  ~�� �ƴ�
 * 						  AND  OR
 *							
 *		;	�����ݷ����� ����* 
 * */	

SELECT 
	  A.STD_DE 						-- 3
	, A.AREA_CD 
FROM 
	TB_TEMPER A						-- 1
WHERE 
	STD_DE = '20210506';				-- 2
	

SELECT 
	  A.STD_DE 
	, A.MAX_TEMPER 
	, A.MIN_TEMPER 
FROM 
	TB_TEMPER A 
WHERE 
	A.MIN_TEMPER = -1.7
	AND A.MAX_TEMPER = 8.5;


-- �ְ����� 35���� 36���� ��츸 �����϶�.
SELECT 
	  A.STD_DE 
	, A.MAX_TEMPER 
	, A.MIN_TEMPER 
FROM 
	TB_TEMPER A 
WHERE 
	A.MAX_TEMPER <= 36
	AND A.MAX_TEMPER >= 35;


SELECT 
	  A.STD_DE 
	, A.MAX_TEMPER 
	, A.MIN_TEMPER 
FROM 
	TB_TEMPER A 
WHERE 	
	A.MIN_TEMPER >= 25.5
	OR A.MAX_TEMPER >= 35;

SELECT 
	  A.STD_DE 
	, A.MAX_TEMPER 
	, A.MIN_TEMPER 
FROM 
	TB_TEMPER A 
WHERE 
	A.MIN_TEMPER = -23.1
	OR A.MAX_TEMPER = 39.6;



/*	 4.GROUP BY
 * 		- SELECT������ ��ȯ�� ���� �׷����� ������.
 * 		- �� �׷쿡 ���� �հ�, ���, ī��Ʈ ���� ����Ҽ� �ִ�.
 * 
   *	SELECT ����
 *		SELECT		������ �÷�
 *			 COLUMN_1
 *			,�����Լ�(COLUMN_2)
 *		FROM		������ ���̺�� �Է�
 *			 TABLE_NAME
		GROUP BY COLUMN_1
 * 
 * 
 * */
SELECT 
	 tt.AREA_CD 
	,COUNT(AREA_CD) AS COUNT
FROM 
	TB_TEMPER tt 
GROUP BY
	tt.AREA_CD ;



SELECT 
	 tt.MIN_TEMPER 
	,COUNT(MIN_TEMPER) AS COUNT
FROM 
	TB_TEMPER tt 
GROUP BY
	tt.MIN_TEMPER ;


SELECT 
	 tt.MAX_TEMPER 
	,COUNT(MAX_TEMPER) AS COUNT
FROM 
	TB_TEMPER tt 
GROUP BY
	tt.MAX_TEMPER ;



SELECT 
	 tt.AVG_TEMPER 
	,COUNT(AVG_TEMPER) AS COUNT
FROM 
	TB_TEMPER tt 
GROUP BY
	tt.AVG_TEMPER ;
	

-- 01. ������� ����� ���� �� �ְ� �µ��� ���Ͻÿ�.
SELECT 
	 A.AREA_CD 
	,MIN(A.MIN_TEMPER) AS MIN_TEMPER 
	,MAX(A.MAX_TEMPER) AS MAX_TEMPER 
FROM 
	TB_TEMPER A 
WHERE 
	A.AREA_CD = '108'
GROUP BY 
	A.AREA_CD ;

--02. ������� ����� ���� �� �ְ� �µ��� ���ϰ� �ش� ���ڸ� ���Ͻÿ�.
SELECT * FROM  TB_TEMPER tt ;


















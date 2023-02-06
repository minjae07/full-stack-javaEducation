SELECT * FROM DUAL;

/*	SQL (Structured Query Language)
 * 	  - 데이터베이스에 있는 필요한 정보를 사용할수 있도록 도와주는 언어
 * 	  - 다른 언어(Java, C, C#..)보다 단순함.
 * 	  - 하나를 배워두면 모든 DBMS에서 사용가능함.
 * 	  - 인터프리터
 *    	
 * 
 *	DML (CRUD - Create, Read, Update, Delete)
 *	1.SELECT 문
 *		- 일반적으로 테이블에 저장된 데이터를 가져오는 데 쓰인다.
 *		- SQL에서 가장 많이 쓰이는 문장이다.
 *	2.SELECT 문법
 *		SELECT		추출대상 컬럼
 *			 COLUMN_1
 *			,COLUMN_1 
 *		FROM		추출대상 테이블명 입력
 *		;			세미콜론으로 끝남
 *  
 * */
SELECT 
	*				-- 테이블의 모든 컬럼을 조회한다.
FROM 
	TB_TEMPER		-- 테이블명을 지정한다.
;	

SELECT 						-- 3
	  A.STD_DE 				-- 4
	, A.AREA_CD 
	, A.AVG_TEMPER 
FROM 						-- 1
	TB_TEMPER A; 			-- 2
-- alias(별칭) --> 코드의 가독성 --> SQL 성능 향상
-- dbms -> 옵티마이저	-> 최적화기 -> SQL -> 가장빠르게, 가장 저비용, 실행

/*
 * 3.필터링
 * 		WHERE 절
 * 			- 집합을 가져올 때 어떤 집합을 가져올 것인지에 대한 조건을 설정하는 절이다.
 * 
  *	    SELECT 문법
 *		SELECT		추출대상 컬럼
 *			 COLUMN_1
 *			,COLUMN_1 
 *		FROM		추출대상 테이블명 입력
 *			 TABLE_NAME
 *		WHERE 
 *			<조건>	어떤 집합을 가져올지에 대한 조건을 준다.
 *					연산자  =  >  <  >=  <=  
 *						  <>, !=     :  ~가 아닌
 * 						  AND  OR
 *							
 *		;	세미콜론으로 끝남* 
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


-- 최고기온이 35에서 36도인 경우만 추출하라.
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
 * 		- SELECT문에서 반환된 행을 그룹으로 나눈다.
 * 		- 각 그룹에 대한 합계, 평균, 카운트 등을 계산할수 있다.
 * 
   *	SELECT 문법
 *		SELECT		추출대상 컬럼
 *			 COLUMN_1
 *			,집계함수(COLUMN_2)
 *		FROM		추출대상 테이블명 입력
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
	

-- 01. 서울시의 역사상 최저 및 최고 온도를 구하시오.
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

--02. 서울시의 역사상 최저 및 최고 온도를 구하고 해당 일자를 구하시오.
SELECT * FROM  TB_TEMPER tt ;


















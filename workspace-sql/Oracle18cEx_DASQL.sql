SELECT * FROM DUAL;

-- TB_TEMPER_DATA 테이블 생성 : CSV파일을 그대로 저장하는 용도로 사용
-- 데이터 분석은 TB_TEMPER 테이블에서 진행함.
CREATE TABLE TB_TEMPER_DATA
(
   STD_DE  CHAR(10)
 , AREA_CD  CHAR(3)
 , AVG_TEMPER   NUMBER(3, 1)
 , MIN_TEMPER   NUMBER(3, 1)
 , MAX_TEMPER   NUMBER(3, 1)
);

SELECT *
FROM tb_temper_data
WHERE area_cd = '108'
AND avg_temper = 28.5
ORDER BY std_de;

-- tb_temper_data 테이블 데이터 입력 완료 확인
SELECT COUNT(*) CNT
FROM tb_temper_data;


-- TB_TEMPER 테이블 생성
-- TB_TEMPER 테이블의 기본키는 STD_DE, AREA_CD로 지정함
-- TB_TEMPER 테이블은 STD_DE+AREA_CD 기준으로 한 건을 짚어 낼수 있음.
CREATE TABLE TB_TEMPER
(
   STD_DE    CHAR(8)
 , AREA_CD   CHAR(3)
 , AVG_TEMPER   NUMBER(3, 1)
 , MIN_TEMPER   NUMBER(3, 1)
 , MAX_TEMPER   NUMBER(3, 1)
 , CONSTRAINT TB_TEMPER_PK PRIMARY KEY(STD_DE, AREA_CD)
);

SELECT *
FROM tb_temper;

SELECT 
   REPLACE(STD_DE,'-','') AS STD_DE
 , AREA_CD
 , AVG_TEMPER
 , MIN_TEMPER
 , MAX_TEMPER 
FROM TB_TEMPER_DATA; 

SELECT 
   REPLACE(STD_DE,'-','') AS STD_DE
FROM TB_TEMPER_DATA; 

SELECT *
FROM tb_temper;

INSERT INTO tb_temper
 SELECT 
   REPLACE(STD_DE,'-','') AS STD_DE
 , AREA_CD
 , AVG_TEMPER
 , MIN_TEMPER
 , MAX_TEMPER 
 FROM TB_TEMPER_DATA ; 

SELECT COUNT(*) FROM tb_temper;







SELECT * FROM DUAL;

-- TB_TEMPER_DATA ���̺� ���� : CSV������ �״�� �����ϴ� �뵵�� ���
-- ������ �м��� TB_TEMPER ���̺��� ������.
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

-- tb_temper_data ���̺� ������ �Է� �Ϸ� Ȯ��
SELECT COUNT(*) CNT
FROM tb_temper_data;


-- TB_TEMPER ���̺� ����
-- TB_TEMPER ���̺��� �⺻Ű�� STD_DE, AREA_CD�� ������
-- TB_TEMPER ���̺��� STD_DE+AREA_CD �������� �� ���� ¤�� ���� ����.
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







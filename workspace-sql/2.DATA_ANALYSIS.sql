--�α� ������ ���̺� ���� �� ������ �Է�
CREATE TABLE tb_popltn_data
(
	  administ_zone			varchar2(150)									-- "��������"
	, tot_popltn_co			number(10)										-- "2021��04��_��_���α���"
	, age_sctn_popltn_co	number(10)										-- "2021��04��_��_���ɱ����α���"
	, popltn_co_0_9			number(10)										-- "2021��04��_��_0~9��"
	, popltn_co_10_19			number(10)										-- "2021��04��_��_10~19��"
	, popltn_co_20_29			number(10)										-- "2021��04��_��_20~29��"
	, popltn_co_30_39			number(10)										-- "2021��04��_��_30~39��"
	, popltn_co_40_49			number(10)										-- "2021��04��_��_40~49��"
	, popltn_co_50_59			number(10)										-- "2021��04��_��_50~59��"
	, popltn_co_60_69			number(10)										-- "2021��04��_��_60~69��"
	, popltn_co_70_79			number(10)										-- "2021��04��_��_70~79��"
	, popltn_co_80_89			number(10)										-- "2021��04��_��_80~89��"
	, popltn_co_90_99			number(10)										-- "2021��04��_��_90~99��"
	, popltn_co_100				number(10)										-- "2021��04��_��_100�� �̻�"
	, male_tot_popltn_co		number(10)										-- "2021��04��_��_���α���"
	, male_age_sctn_popltn_co	number(10)										-- "2021��04��_��_���ɱ����α���"
	, male_popltn_co_0_9		number(10)										-- "2021��04��_��_0~9��"
	, male_popltn_co_10_19			number(10)										-- "2021��04��_��_10~19��"
	, male_popltn_co_20_29			number(10)										-- "2021��04��_��_20~29��"
	, male_popltn_co_30_39			number(10)										-- "2021��04��_��_30~39��"
	, male_popltn_co_40_49			number(10)										-- "2021��04��_��_40~49��"
	, male_popltn_co_50_59			number(10)										-- "2021��04��_��_50~59��"
	, male_popltn_co_60_69			number(10)										-- "2021��04��_��_60~69��"
	, male_popltn_co_70_79			number(10)										-- "2021��04��_��_70~79��"
	, male_popltn_co_80_89			number(10)										-- "2021��04��_��_80~89��"
	, male_popltn_co_90_99			number(10)										-- "2021��04��_��_90~99��"
	, male_popltn_co_100				number(10)									-- "2021��04��_��_100�� �̻�"	
	, female_tot_popltn_co		number(10)										-- "2021��04��_��_���α���"
	, female_age_sctn_popltn_co	number(10)										-- "2021��04��_��_���ɱ����α���"
	, female_popltn_co_0_9		number(10)										-- "2021��04��_��_0~9��"
	, female_popltn_co_10_19			number(10)										-- "2021��04��_��_10~19��"
	, female_popltn_co_20_29			number(10)										-- "2021��04��_��_20~29��"
	, female_popltn_co_30_39			number(10)										-- "2021��04��_��_30~39��"
	, female_popltn_co_40_49			number(10)										-- "2021��04��_��_40~49��"
	, female_popltn_co_50_59			number(10)										-- "2021��04��_��_50~59��"
	, female_popltn_co_60_69			number(10)										-- "2021��04��_��_60~69��"
	, female_popltn_co_70_79			number(10)										-- "2021��04��_��_70~79��"
	, female_popltn_co_80_89			number(10)										-- "2021��04��_��_80~89��"
	, female_popltn_co_90_99			number(10)										-- "2021��04��_��_90~99��"
	, female_popltn_co_100				number(10)									-- "2021��04��_��_100�� �̻�"		
);

SELECT count(*) FROM TB_POPLTN_DATA;

SELECT *
FROM TB_POPLTN_DATA;

SELECT *
FROM TB_POPLTN_DATA
WHERE ADMINIST_ZONE LIKE '%������%';

SELECT *
FROM TB_POPLTN_DATA
WHERE ADMINIST_ZONE LIKE '%�뱸%';

SELECT *
FROM TB_POPLTN_DATA
WHERE ADMINIST_ZONE LIKE '%���%';

SELECT *
FROM TB_POPLTN_DATA
WHERE ADMINIST_ZONE LIKE '%�Ͼ���%';

SELECT *
FROM TB_POPLTN_DATA
WHERE ADMINIST_ZONE LIKE '%�︪%';

SELECT *
FROM TB_POPLTN_DATA
WHERE ADMINIST_ZONE LIKE '%����%';

-- �⺻ Ű ����
/*
 * 1) �÷� ������ �÷� ���� �ڿ� ��ġ�ϸ� ���̺� ������ ��� �÷� ������ ���� �Ŀ� ������ ��ġ�� �����Ѵ�.
 * 
 * 2) �⺻Ű(PK)�� �÷� �������� ������ ���� �ְ�, ���̺� �������� ������ ���� �ִ�.
 *     - �÷� �⺻Ű ���� : [constraint �̸�] PRIMARY KEY
 * 	   - ���̺� �⺻Ű ���� : [constraint �̸�] PRIMARY KEY(��� �ʵ�)
 * 3) PRIMARY KEY ������ NOT NULL �Ӽ��� ���Ѵ�.
 * 4) �̸��� �����ϸ� ������ �ڵ����� �̸��� ���δ�.
 * 5) ���� �ʵ�(�÷�)�� ���� ����Ű(Composite Key)�� �����Ҽ� �ִ�.
 * 6) ����Ű�� �� ���� �ʵ带 ���� �⺻Ű�� �����ϴ� ������ �⺻Ű�� �� ���� ���� �ƴϴ�.
 * 7) �ǹ������� ����Ű���� ����Ű�� �� ���ϴ�.
 * */

CREATE TABLE tb_popltn 
(
	  administ_zone_no	varchar2(10)				-- ����������ȣ
	, administ_zone_nm	varchar2(150)
	, std_mt			varchar2(6) 				-- ���س��
	, popltn_se_cd 		char(1)						-- M: ����, F: ����, T: ��ü (�α������ڵ�)
	, agred_se_cd		char(3)		-- '000':0��,'010':10��,'020':20��,'030':30��,'040':40��,'050':50��,'060':60��,'070':70��,'080':80��,'090':90��,'100':100�� (���ɱ����ڵ�)
	, popltn_cnt		number(10)
	, CONSTRAINT tb_popltn_pk PRIMARY KEY(administ_zone_no, std_mt, popltn_se_cd, agred_se_cd)
);

-- �ϳ��� ����������ȣ�� �������� ���ؿ��� ������ �ְ�, �������� �α������ڵ� �� ���ɱ����ڵ带 �������� �ִ�.

SELECT * FROM TB_POPLTN_DATA;

/*
    1)������ �α������� ���ɴ뺰 �α������� ����
    2)����ȭ�� Ʋ�� �°� �����͵��� ���� ��
    3)���������信 �°� sql�� ������ٰ���.
    4)�����ͺм��� �Ҽ� �ְ� ����.
    5)������ ��ó�� �����.
    
*/


SELECT * FROM dual;					-- �Ѳ��� ��µ�.

SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3; 	-- 3�� ��µ�.  	-- CONNECT BY ������踦 �����ϴ� ����,  level�̶�� �÷�.

-- 3847 * 3 = 11541 �����͸� 3��� ������(��Ƣ����), �ѱ��� å�� �������� �� 3������ ������ٰ� ��������.
-- 3847 * 3 * 11 = 126951  �����͸� 33��� ������(��Ƣ����). �ѱ��� å�� �������� �� 33������ ������ٰ� ��������.
SELECT COUNT(*) FROM    TB_POPLTN_DATA
                     , (SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3)
                     , (SELECT LEVEL AS lvl2 FROM dual CONNECT BY LEVEL <= 11);


select ADMINIST_ZONE, lvl1, lvl2 from tb_popltn_data
                                    , (SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3)
                                    , (SELECT LEVEL AS lvl2 FROM dual CONNECT BY LEVEL <= 11);

-- ����Ư���� �߶��� �����4��(1126054000)

select substr(ADMINIST_ZONE, instr(ADMINIST_ZONE, '(')+1, 10) as administ_zone_no              --����������ȣ
from tb_popltn_data, (SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3), (SELECT LEVEL AS lvl2 FROM dual CONNECT BY LEVEL <= 11);



select substr(ADMINIST_ZONE, 1, instr(ADMINIST_ZONE, '(')-1) as administ_zone_no              --����������
from tb_popltn_data, (SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3), (SELECT LEVEL AS lvl2 FROM dual CONNECT BY LEVEL <= 11);


select '202104' as std_mt
from tb_popltn_data, (SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3), (SELECT LEVEL AS lvl2 FROM dual CONNECT BY LEVEL <= 11);


select    '202104' as std_mt
        , MALE_POPLTN_CO_0_9        , MALE_POPLTN_CO_10_19      , MALE_POPLTN_CO_20_29
        , MALE_POPLTN_CO_30_39      , MALE_POPLTN_CO_40_49      , MALE_POPLTN_CO_50_59
        , MALE_POPLTN_CO_60_69      , MALE_POPLTN_CO_70_79      , MALE_POPLTN_CO_80_89,     MALE_POPLTN_CO_90_99,   MALE_POPLTN_CO_100
        , feMALE_POPLTN_CO_0_9      , feMALE_POPLTN_CO_10_19    , feMALE_POPLTN_CO_20_29
        , feMALE_POPLTN_CO_30_39    , feMALE_POPLTN_CO_40_49    , feMALE_POPLTN_CO_50_59
        , feMALE_POPLTN_CO_60_69    , feMALE_POPLTN_CO_70_79    , feMALE_POPLTN_CO_80_89,   feMALE_POPLTN_CO_90_99, feMALE_POPLTN_CO_100
        , POPLTN_CO_0_9             , POPLTN_CO_10_19             , POPLTN_CO_20_29 
        , POPLTN_CO_30_39             , POPLTN_CO_40_49             , POPLTN_CO_50_59
        , POPLTN_CO_60_69             , POPLTN_CO_70_79             , POPLTN_CO_80_89,      POPLTN_CO_90_99,        POPLTN_CO_100
        , lvl1, lvl2
from tb_popltn_data, (SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3), (SELECT LEVEL AS lvl2 FROM dual CONNECT BY LEVEL <= 11);







select    substr(ADMINIST_ZONE, instr(ADMINIST_ZONE, '(')+1, 10) as administ_zone_no
        , substr(ADMINIST_ZONE, 1, instr(ADMINIST_ZONE, '(')-1) as administ_zone_no
        , '202104' as std_mt
        , MALE_POPLTN_CO_0_9        , MALE_POPLTN_CO_10_19      , MALE_POPLTN_CO_20_29
        , MALE_POPLTN_CO_30_39      , MALE_POPLTN_CO_40_49      , MALE_POPLTN_CO_50_59
        , MALE_POPLTN_CO_60_69      , MALE_POPLTN_CO_70_79      , MALE_POPLTN_CO_80_89,     MALE_POPLTN_CO_90_99,   MALE_POPLTN_CO_100
        , feMALE_POPLTN_CO_0_9      , feMALE_POPLTN_CO_10_19    , feMALE_POPLTN_CO_20_29
        , feMALE_POPLTN_CO_30_39    , feMALE_POPLTN_CO_40_49    , feMALE_POPLTN_CO_50_59
        , feMALE_POPLTN_CO_60_69    , feMALE_POPLTN_CO_70_79    , feMALE_POPLTN_CO_80_89,   feMALE_POPLTN_CO_90_99, feMALE_POPLTN_CO_100
        , POPLTN_CO_0_9             , POPLTN_CO_10_19             , POPLTN_CO_20_29 
        , POPLTN_CO_30_39             , POPLTN_CO_40_49             , POPLTN_CO_50_59
        , POPLTN_CO_60_69             , POPLTN_CO_70_79             , POPLTN_CO_80_89,      POPLTN_CO_90_99,        POPLTN_CO_100
        , lvl1, lvl2
from tb_popltn_data, (SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3), (SELECT LEVEL AS lvl2 FROM dual CONNECT BY LEVEL <= 11);





select  A.administ_zone_no, A.administ_zone_nm, A.std_mt

from
    (
select    substr(ADMINIST_ZONE, instr(ADMINIST_ZONE, '(')+1, 10) as administ_zone_no
        , substr(ADMINIST_ZONE, 1, instr(ADMINIST_ZONE, '(')-1) as administ_zone_nm
        , '202104' as std_mt
        , MALE_POPLTN_CO_0_9        , MALE_POPLTN_CO_10_19      , MALE_POPLTN_CO_20_29
        , MALE_POPLTN_CO_30_39      , MALE_POPLTN_CO_40_49      , MALE_POPLTN_CO_50_59
        , MALE_POPLTN_CO_60_69      , MALE_POPLTN_CO_70_79      , MALE_POPLTN_CO_80_89,     MALE_POPLTN_CO_90_99,   MALE_POPLTN_CO_100
        , feMALE_POPLTN_CO_0_9      , feMALE_POPLTN_CO_10_19    , feMALE_POPLTN_CO_20_29
        , feMALE_POPLTN_CO_30_39    , feMALE_POPLTN_CO_40_49    , feMALE_POPLTN_CO_50_59
        , feMALE_POPLTN_CO_60_69    , feMALE_POPLTN_CO_70_79    , feMALE_POPLTN_CO_80_89,   feMALE_POPLTN_CO_90_99, feMALE_POPLTN_CO_100
        , POPLTN_CO_0_9             , POPLTN_CO_10_19             , POPLTN_CO_20_29 
        , POPLTN_CO_30_39             , POPLTN_CO_40_49             , POPLTN_CO_50_59
        , POPLTN_CO_60_69             , POPLTN_CO_70_79             , POPLTN_CO_80_89,      POPLTN_CO_90_99,        POPLTN_CO_100
        , lvl1, lvl2
from tb_popltn_data, (SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3), (SELECT LEVEL AS lvl2 FROM dual CONNECT BY LEVEL <= 11)
    ) A;
    
    
    
    







select    A.administ_zone_no, A.administ_zone_nm, A.std_mt
        , case when lvl1 = 1 then 'M' when lvl1 = 2 then 'F' when lvl1 = 3 then 'T' end as popltn_se_cd    -- ������ �α�����
from
    (
select    substr(ADMINIST_ZONE, instr(ADMINIST_ZONE, '(')+1, 10) as administ_zone_no
        , substr(ADMINIST_ZONE, 1, instr(ADMINIST_ZONE, '(')-1) as administ_zone_nm
        , '202104' as std_mt
        , MALE_POPLTN_CO_0_9        , MALE_POPLTN_CO_10_19      , MALE_POPLTN_CO_20_29
        , MALE_POPLTN_CO_30_39      , MALE_POPLTN_CO_40_49      , MALE_POPLTN_CO_50_59
        , MALE_POPLTN_CO_60_69      , MALE_POPLTN_CO_70_79      , MALE_POPLTN_CO_80_89,     MALE_POPLTN_CO_90_99,   MALE_POPLTN_CO_100
        , feMALE_POPLTN_CO_0_9      , feMALE_POPLTN_CO_10_19    , feMALE_POPLTN_CO_20_29
        , feMALE_POPLTN_CO_30_39    , feMALE_POPLTN_CO_40_49    , feMALE_POPLTN_CO_50_59
        , feMALE_POPLTN_CO_60_69    , feMALE_POPLTN_CO_70_79    , feMALE_POPLTN_CO_80_89,   feMALE_POPLTN_CO_90_99, feMALE_POPLTN_CO_100
        , POPLTN_CO_0_9             , POPLTN_CO_10_19             , POPLTN_CO_20_29 
        , POPLTN_CO_30_39             , POPLTN_CO_40_49             , POPLTN_CO_50_59
        , POPLTN_CO_60_69             , POPLTN_CO_70_79             , POPLTN_CO_80_89,      POPLTN_CO_90_99,        POPLTN_CO_100
        , lvl1, lvl2
from tb_popltn_data, (SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3), (SELECT LEVEL AS lvl2 FROM dual CONNECT BY LEVEL <= 11)
    ) A;





select    A.administ_zone_no, A.administ_zone_nm, A.std_mt
        , case when lvl1 = 1 then 'M' when lvl1 = 2 then 'F' when lvl1 = 3 then 'T' end as popltn_se_cd    -- ������ �α�����
        , case when lvl2 = 1 then '000' when lvl2 = 2 then '010' when lvl2 = 3 then '020' end as agred_se_cd  -- ���ɴ뺰 �α�����
from
    (
select    substr(ADMINIST_ZONE, instr(ADMINIST_ZONE, '(')+1, 10) as administ_zone_no
        , substr(ADMINIST_ZONE, 1, instr(ADMINIST_ZONE, '(')-1) as administ_zone_nm
        , '202104' as std_mt
        , MALE_POPLTN_CO_0_9        , MALE_POPLTN_CO_10_19      , MALE_POPLTN_CO_20_29
        , MALE_POPLTN_CO_30_39      , MALE_POPLTN_CO_40_49      , MALE_POPLTN_CO_50_59
        , MALE_POPLTN_CO_60_69      , MALE_POPLTN_CO_70_79      , MALE_POPLTN_CO_80_89,     MALE_POPLTN_CO_90_99,   MALE_POPLTN_CO_100
        , feMALE_POPLTN_CO_0_9      , feMALE_POPLTN_CO_10_19    , feMALE_POPLTN_CO_20_29
        , feMALE_POPLTN_CO_30_39    , feMALE_POPLTN_CO_40_49    , feMALE_POPLTN_CO_50_59
        , feMALE_POPLTN_CO_60_69    , feMALE_POPLTN_CO_70_79    , feMALE_POPLTN_CO_80_89,   feMALE_POPLTN_CO_90_99, feMALE_POPLTN_CO_100
        , POPLTN_CO_0_9             , POPLTN_CO_10_19             , POPLTN_CO_20_29 
        , POPLTN_CO_30_39             , POPLTN_CO_40_49             , POPLTN_CO_50_59
        , POPLTN_CO_60_69             , POPLTN_CO_70_79             , POPLTN_CO_80_89,      POPLTN_CO_90_99,        POPLTN_CO_100
        , lvl1, lvl2
from tb_popltn_data, (SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3), (SELECT LEVEL AS lvl2 FROM dual CONNECT BY LEVEL <= 11)
    ) A;























--인구 데이터 테이블 생성 및 데이터 입력
CREATE TABLE tb_popltn_data
(
	  administ_zone			varchar2(150)									-- "행정구역"
	, tot_popltn_co			number(10)										-- "2021년04월_계_총인구수"
	, age_sctn_popltn_co	number(10)										-- "2021년04월_계_연령구간인구수"
	, popltn_co_0_9			number(10)										-- "2021년04월_계_0~9세"
	, popltn_co_10_19			number(10)										-- "2021년04월_계_10~19세"
	, popltn_co_20_29			number(10)										-- "2021년04월_계_20~29세"
	, popltn_co_30_39			number(10)										-- "2021년04월_계_30~39세"
	, popltn_co_40_49			number(10)										-- "2021년04월_계_40~49세"
	, popltn_co_50_59			number(10)										-- "2021년04월_계_50~59세"
	, popltn_co_60_69			number(10)										-- "2021년04월_계_60~69세"
	, popltn_co_70_79			number(10)										-- "2021년04월_계_70~79세"
	, popltn_co_80_89			number(10)										-- "2021년04월_계_80~89세"
	, popltn_co_90_99			number(10)										-- "2021년04월_계_90~99세"
	, popltn_co_100				number(10)										-- "2021년04월_계_100세 이상"
	, male_tot_popltn_co		number(10)										-- "2021년04월_남_총인구수"
	, male_age_sctn_popltn_co	number(10)										-- "2021년04월_남_연령구간인구수"
	, male_popltn_co_0_9		number(10)										-- "2021년04월_남_0~9세"
	, male_popltn_co_10_19			number(10)										-- "2021년04월_남_10~19세"
	, male_popltn_co_20_29			number(10)										-- "2021년04월_남_20~29세"
	, male_popltn_co_30_39			number(10)										-- "2021년04월_남_30~39세"
	, male_popltn_co_40_49			number(10)										-- "2021년04월_남_40~49세"
	, male_popltn_co_50_59			number(10)										-- "2021년04월_남_50~59세"
	, male_popltn_co_60_69			number(10)										-- "2021년04월_남_60~69세"
	, male_popltn_co_70_79			number(10)										-- "2021년04월_남_70~79세"
	, male_popltn_co_80_89			number(10)										-- "2021년04월_남_80~89세"
	, male_popltn_co_90_99			number(10)										-- "2021년04월_남_90~99세"
	, male_popltn_co_100				number(10)									-- "2021년04월_남_100세 이상"	
	, female_tot_popltn_co		number(10)										-- "2021년04월_여_총인구수"
	, female_age_sctn_popltn_co	number(10)										-- "2021년04월_여_연령구간인구수"
	, female_popltn_co_0_9		number(10)										-- "2021년04월_여_0~9세"
	, female_popltn_co_10_19			number(10)										-- "2021년04월_여_10~19세"
	, female_popltn_co_20_29			number(10)										-- "2021년04월_여_20~29세"
	, female_popltn_co_30_39			number(10)										-- "2021년04월_여_30~39세"
	, female_popltn_co_40_49			number(10)										-- "2021년04월_여_40~49세"
	, female_popltn_co_50_59			number(10)										-- "2021년04월_여_50~59세"
	, female_popltn_co_60_69			number(10)										-- "2021년04월_여_60~69세"
	, female_popltn_co_70_79			number(10)										-- "2021년04월_여_70~79세"
	, female_popltn_co_80_89			number(10)										-- "2021년04월_여_80~89세"
	, female_popltn_co_90_99			number(10)										-- "2021년04월_여_90~99세"
	, female_popltn_co_100				number(10)									-- "2021년04월_여_100세 이상"		
);

SELECT count(*) FROM TB_POPLTN_DATA;

SELECT *
FROM TB_POPLTN_DATA;

SELECT *
FROM TB_POPLTN_DATA
WHERE ADMINIST_ZONE LIKE '%강원도%';

SELECT *
FROM TB_POPLTN_DATA
WHERE ADMINIST_ZONE LIKE '%대구%';

SELECT *
FROM TB_POPLTN_DATA
WHERE ADMINIST_ZONE LIKE '%경산%';

SELECT *
FROM TB_POPLTN_DATA
WHERE ADMINIST_ZONE LIKE '%하양읍%';

SELECT *
FROM TB_POPLTN_DATA
WHERE ADMINIST_ZONE LIKE '%울릉%';

SELECT *
FROM TB_POPLTN_DATA
WHERE ADMINIST_ZONE LIKE '%서울%';

-- 기본 키 지정
/*
 * 1) 컬럼 제약은 컬럼 선언 뒤에 위치하며 테이블 제약은 모든 컬럼 선언이 끝난 후에 마지막 위치에 지정한다.
 * 
 * 2) 기본키(PK)는 컬럼 제약으로 선언할 수도 있고, 테이블 제약으로 선언할 수도 있다.
 *     - 컬럼 기본키 제약 : [constraint 이름] PRIMARY KEY
 * 	   - 테이블 기본키 제약 : [constraint 이름] PRIMARY KEY(대상 필드)
 * 3) PRIMARY KEY 제약은 NOT NULL 속성을 겸한다.
 * 4) 이름을 생략하면 서버가 자동으로 이름을 붙인다.
 * 5) 여러 필드(컬럼)를 묶어 복합키(Composite Key)로 지정할수 있다.
 * 6) 복합키는 두 개의 필드를 묶어 기본키로 지정하는 것이지 기본키가 두 개인 것은 아니다.
 * 7) 실무에서는 단일키보다 복합키가 더 흔하다.
 * */

CREATE TABLE tb_popltn 
(
	  administ_zone_no	varchar2(10)				-- 행정구역번호
	, administ_zone_nm	varchar2(150)
	, std_mt			varchar2(6) 				-- 기준년월
	, popltn_se_cd 		char(1)						-- M: 남성, F: 여성, T: 전체 (인구구분코드)
	, agred_se_cd		char(3)		-- '000':0대,'010':10대,'020':20대,'030':30대,'040':40대,'050':50대,'060':60대,'070':70대,'080':80대,'090':90대,'100':100대 (연령구분코드)
	, popltn_cnt		number(10)
	, CONSTRAINT tb_popltn_pk PRIMARY KEY(administ_zone_no, std_mt, popltn_se_cd, agred_se_cd)
);

-- 하나의 행정구역번호는 여러개의 기준월을 가질수 있고, 여러개의 인구구분코드 및 연령구분코드를 가질수도 있다.

SELECT * FROM TB_POPLTN_DATA;

/*
    1)남녀의 인구분포와 연령대별 인구분포를 구함
    2)정규화된 틀에 맞게 데이터들이 들어가게 함
    3)집합적개념에 맞게 sql을 만들어줄것임.
    4)데이터분석을 할수 있게 해줌.
    5)데이터 전처리 기법임.
    
*/


SELECT * FROM dual;					-- 한껀만 출력됨.

SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3; 	-- 3껀 출력됨.  	-- CONNECT BY 연결관계를 설정하는 구문,  level이라는 컬럼.

-- 3847 * 3 = 11541 데이터를 3배로 복제함(뻥튀기함), 한권의 책을 제본떠서 총 3권으로 만들었다고 생각하자.
-- 3847 * 3 * 11 = 126951  데이터를 33배로 복제함(뻥튀기함). 한권의 책을 제본떠서 총 33권으로 만들었다고 생각하자.
SELECT COUNT(*) FROM    TB_POPLTN_DATA
                     , (SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3)
                     , (SELECT LEVEL AS lvl2 FROM dual CONNECT BY LEVEL <= 11);


select ADMINIST_ZONE, lvl1, lvl2 from tb_popltn_data
                                    , (SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3)
                                    , (SELECT LEVEL AS lvl2 FROM dual CONNECT BY LEVEL <= 11);

-- 서울특별시 중랑구 면목제4동(1126054000)

select substr(ADMINIST_ZONE, instr(ADMINIST_ZONE, '(')+1, 10) as administ_zone_no              --행정구역번호
from tb_popltn_data, (SELECT LEVEL AS lvl1 FROM dual CONNECT BY LEVEL <= 3), (SELECT LEVEL AS lvl2 FROM dual CONNECT BY LEVEL <= 11);



select substr(ADMINIST_ZONE, 1, instr(ADMINIST_ZONE, '(')-1) as administ_zone_no              --행정구역명
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
        , case when lvl1 = 1 then 'M' when lvl1 = 2 then 'F' when lvl1 = 3 then 'T' end as popltn_se_cd    -- 남녀의 인구분포
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
        , case when lvl1 = 1 then 'M' when lvl1 = 2 then 'F' when lvl1 = 3 then 'T' end as popltn_se_cd    -- 남녀의 인구분포
        , case when lvl2 = 1 then '000' when lvl2 = 2 then '010' when lvl2 = 3 then '020' end as agred_se_cd  -- 연령대별 인구분포
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























--03. 특정날짜(MMDD)를 기준으로 역사상 서울시의 최고 기온과 최저 기온 및 이에 해당하는 일자를 구하시오.


/*
       1. LIKE 연산자
        - 특정 집합에서 어떠한 컬럼의 값이 특정 값과 유사한 패턴을 갖는 집합을 출력하는 연산자이다.
        - 정확한 키워드를 모를 경우 일부만으로 검색하는 방법.
        
       2. LIKE 연산자 문법
                 SELECT *
                  FROM TABLE_NAME
                 WHERE COLUMN_NAME              
                  LIKE 특정패턴             --COLUMN_NAME 컬럼의 값이 특정패턴과 유사한 집합을 출력한다.
                  
                  
                 SELECT *
                  FROM TABLE_NAME
                 WHERE COLUMN_NAME              
                 NOT LIKE 특정패턴             --COLUMN_NAME 컬럼의 값이 특정패턴과 유사하지 않은 집합을 출력한다.   
                 
        3. 특정 패턴(와일드카드를 사용하여 패턴 매칭)
            - '%'  :  어떤 문자 혹은 문자열이든지 매칭되었다고 판단한다.  => 0~n글자
            - '_'  :  한 개의 문자가 어떤 문자이든지 매칭 되었다고 판단한다. => 1글자            __ => 2글자...
            - ex) select * from city where CountryCode like 'K%';
                  select * from city where CountryCode like '%K';
                  select * from city where CountryCode like '%K%';
                  select * from city where CountryCode like 'K__';
*/

SELECT *
FROM   tb_temper A
WHERE  a.area_cd = '108'                --지역코드 : 서울특별시
AND    a.std_de LIKE '____0710';


SELECT 
       SUBSTR(a.std_de, 5,4) AS MMDD
      ,MIN(a.min_temper) AS min_temper
      ,MAX(a.max_temper) AS MAX_TEMPER
FROM   tb_temper A
WHERE  a.area_cd = '108'                --지역코드 : 서울특별시
AND    a.std_de LIKE '____0710'
GROUP BY SUBSTR(a.std_de, 5,4) ;


select 
        b.area_cd                                   -- 7) B테이블의 지역코드를 구한다.
       ,b.std_de                                    -- 7) B테이블의 기준일자를 구한다.
       ,b.min_temper                                -- 7) B테이블의 최저기온을 구한다.
       ,b.max_temper                                -- 7) B테이블의 최고기온을 구한다.                     
from
    (
        SELECT 
               SUBSTR(a.std_de, 5,4) AS MMDD       -- 4)그룹화한 MMDD를 조회한다.
              ,MIN(a.min_temper) AS min_temper     -- 4)MIN()함수를 이용하여 MMDD별 최저기온 값중에서 최저기온을 구한다.
              ,MAX(a.max_temper) AS MAX_TEMPER     -- 4)MAX()함수를 이용하여 MMDD별 최고기온 값중에서 최고기온을 구한다.
        FROM   tb_temper A                                                 -- 1) tb_temper테이블을 조회한다.    
        WHERE  a.area_cd = '108'                --지역코드 : 서울특별시       -- 2) 지역코드 "서울특별시"인 데이터를 기준으로 한다.  
        AND    a.std_de LIKE '____0710'            -- 2) std_de가 앞4자리가 어떤 것이든 존재하고 "0710"로 끝나는 행만을 조회한다.             
        GROUP BY SUBSTR(a.std_de, 5,4)             -- 3) std_de에서 5번째 자리부터 4자리 문자열을 기준으로 즉MMDD을 기준으로 그룹화한다.
    ) A
    , tb_temper B                                  -- 5) 동일한 테이블인 tb_temper 테이블을 조회한다.
where  ( substr(b.std_de, 5, 4) = a.MMDD and b.min_temper = a.min_temper )   -- 6) A집합의 MMDD와 min_temper를 기준으로 b테이블에서 찾는다.
   or  ( substr(b.std_de, 5, 4) = a.MMDD and b.max_temper = a.max_temper );  -- 6) A집합의 MMDD와 max_temper 기준으로 b테이블에서 찾는다.

-- 7월 10일 기준으로 기온이 가장 낮았던 연도는 1913년이다.
-- 7월 10일 기준으로 기온이 가장 높았던 연도는 1943년이다.


















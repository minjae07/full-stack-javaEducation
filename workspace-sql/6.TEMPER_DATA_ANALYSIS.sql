--04. 1년 중 평균 일교차가 가장 큰 달 구하시오.
-- 역사상 서울시를 기준으로 월별 일교차 값을 구한 후 일교차가 가장 큰 달을 구한다.

/*
    * order by 문
        1)select문에서 가져온 데이터를 정렬하는데 사용한다.
        2)업무 처리상 매우 중요한 기능이다.
    * order by 문법
        select
              column_1                  --추출대상 컬럼
             ,column_2
        from
             tbl_name                   --추출 대상 테이블명 입력
        order by  column_1 ASC          --column_1은 오름차순 정렬(default는 ASC)
                , column_2 DESC         --column_2은 내림차순 정렬(default는 ASC)
*/
/*
    * 오라클 내장 컬럼 : ROWNUM을 사용하여 몇 건만 출력가능.
*/

-- 서울시 기준으로 월별 평균 일교차 값을 구하시오.
SELECT
      SUBSTR(a.std_de,5,2) AS MM
     ,ROUND(AVG(a.max_temper-a.min_temper),2) AS DAILY_CROSS
FROM TB_TEMPER A
WHERE A.AREA_CD = '108'
GROUP BY SUBSTR(A.STD_DE, 5, 2)
ORDER BY DAILY_CROSS DESC;


SELECT A.MM                                                 -- 7)MM의 값을 조회한다.   
      ,a.daily_cross                                        -- 7)일교차 값을 조회한다.
    FROM (
            SELECT
                   SUBSTR(a.std_de,5,2) AS MM             --4)그룹핑한 MM을 조회한다.  
                  ,ROUND(AVG(a.max_temper-a.min_temper),2) AS DAILY_CROSS   --4)AVG함수를 이용하여 MM별 일교차 값의 평균을 구한다. 그후  ROUND함수로 소수점 2째자리에서 반올림한다.
            FROM  TB_TEMPER A                                               --1)TB_TEMPER 테이블을 조회한다.
            WHERE A.AREA_CD = '108'                                         --2)지역코드가 "서울특별시"인 데이터를 기준으로 한다.
            GROUP BY SUBSTR(A.STD_DE, 5, 2)                --3)STD_DE에서 5번째자리부터 2자리 문자열을 기준으로 즉 MM을 기준으로 그룹화 한다.
            ORDER BY DAILY_CROSS DESC                      --5)SELECT절에서 구한 일교차 값을 기준으로 역순 정렬한다.     
         ) A
     WHERE ROWNUM <= 1;        --6)A집합은 일교차 값을 기준으로 역순 정렬한 집합이다. 그중 가장 위에 있는 단 한건을 조회한다.              
     
-- 1년중 일교차가 가장 큰 달은 10월 달인것을 알수 있다.












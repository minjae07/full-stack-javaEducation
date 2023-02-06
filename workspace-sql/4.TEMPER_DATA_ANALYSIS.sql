/*
    *서브쿼리 (SubQuery)
        1)SQL문 내에서 메인 쿼리가 아닌 하위에 존재하는 쿼리를 말한다.
        2)쿼리문 내에서 또다른 쿼리문이 있는 형태
        3)서브쿼리는 메인쿼리에 포함되는 관계--()를 사용해 감싸는 형태.
        4)종류 -중첩 서브쿼리
               -인라인 뷰 : From 쪽에서 인라인뷰의 시작과 종료.  
*/

--02. 서울시의 역사상 최저 및 최고 온도를 구하고 해당 일자를 구하시오.

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
    
 
 
SELECT 
      b.area_cd                                           -- 7)B테이블의 지역코드를 구한다.  
    , B.STD_DE                                            -- 7)B테이블의 기준일자를 구한다.     
    , b.min_temper                                        -- 7)B테이블의 최저온도를 구한다.         
    , b.max_temper                                        -- 7)B테이블의 최고온도를 구한다.   
FROM (
        SELECT 
             A.AREA_CD                                     -- 4)그룹화한 지역코드를 출력하라. 
            ,MIN(A.MIN_TEMPER) AS MIN_TEMPER               -- 4)MIN함수를 이용하여 일자별 최저온도 값중에서 최저온도를 구한다 
            ,MAX(A.MAX_TEMPER) AS MAX_TEMPER               -- 4)MAX함수를 이용하여 일자별 최고온도 값중에서 최고온도를 구한다     
        FROM 
            TB_TEMPER A                                    -- 1) TB_TEMPER 조회한다.
        WHERE 
            A.AREA_CD = '108'                              -- 2) 지역코드가 "서울특별시"인 데이터를 기준으로 한다.
        GROUP BY 
            A.AREA_CD                                      -- 3) 지역코드를 기준으로 그룹화한다. 
     ) A
     , tb_temper B                                         -- 5) 동일한 테이블인 TB_TEMP테이블을 조회한다. 
where (B.AREA_CD = a.area_cd AND B.MIN_TEMPER = a.min_temper)   -- 6) 지역코드 및 최저온도가 일치하는 행을 구한다.
OR (B.AREA_CD = a.area_cd AND b.max_temper = A.MAX_TEMPER);     -- 6) 지역코드 및 최고온도가 일치하는 행을 구한다.

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
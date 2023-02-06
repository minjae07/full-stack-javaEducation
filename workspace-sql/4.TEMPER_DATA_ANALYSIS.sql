/*
    *�������� (SubQuery)
        1)SQL�� ������ ���� ������ �ƴ� ������ �����ϴ� ������ ���Ѵ�.
        2)������ ������ �Ǵٸ� �������� �ִ� ����
        3)���������� ���������� ���ԵǴ� ����--()�� ����� ���δ� ����.
        4)���� -��ø ��������
               -�ζ��� �� : From �ʿ��� �ζ��κ��� ���۰� ����.  
*/

--02. ������� ����� ���� �� �ְ� �µ��� ���ϰ� �ش� ���ڸ� ���Ͻÿ�.

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
      b.area_cd                                           -- 7)B���̺��� �����ڵ带 ���Ѵ�.  
    , B.STD_DE                                            -- 7)B���̺��� �������ڸ� ���Ѵ�.     
    , b.min_temper                                        -- 7)B���̺��� �����µ��� ���Ѵ�.         
    , b.max_temper                                        -- 7)B���̺��� �ְ�µ��� ���Ѵ�.   
FROM (
        SELECT 
             A.AREA_CD                                     -- 4)�׷�ȭ�� �����ڵ带 ����϶�. 
            ,MIN(A.MIN_TEMPER) AS MIN_TEMPER               -- 4)MIN�Լ��� �̿��Ͽ� ���ں� �����µ� ���߿��� �����µ��� ���Ѵ� 
            ,MAX(A.MAX_TEMPER) AS MAX_TEMPER               -- 4)MAX�Լ��� �̿��Ͽ� ���ں� �ְ�µ� ���߿��� �ְ�µ��� ���Ѵ�     
        FROM 
            TB_TEMPER A                                    -- 1) TB_TEMPER ��ȸ�Ѵ�.
        WHERE 
            A.AREA_CD = '108'                              -- 2) �����ڵ尡 "����Ư����"�� �����͸� �������� �Ѵ�.
        GROUP BY 
            A.AREA_CD                                      -- 3) �����ڵ带 �������� �׷�ȭ�Ѵ�. 
     ) A
     , tb_temper B                                         -- 5) ������ ���̺��� TB_TEMP���̺��� ��ȸ�Ѵ�. 
where (B.AREA_CD = a.area_cd AND B.MIN_TEMPER = a.min_temper)   -- 6) �����ڵ� �� �����µ��� ��ġ�ϴ� ���� ���Ѵ�.
OR (B.AREA_CD = a.area_cd AND b.max_temper = A.MAX_TEMPER);     -- 6) �����ڵ� �� �ְ�µ��� ��ġ�ϴ� ���� ���Ѵ�.

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
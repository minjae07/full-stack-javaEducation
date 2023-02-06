--03. Ư����¥(MMDD)�� �������� ����� ������� �ְ� ��°� ���� ��� �� �̿� �ش��ϴ� ���ڸ� ���Ͻÿ�.


/*
       1. LIKE ������
        - Ư�� ���տ��� ��� �÷��� ���� Ư�� ���� ������ ������ ���� ������ ����ϴ� �������̴�.
        - ��Ȯ�� Ű���带 �� ��� �Ϻθ����� �˻��ϴ� ���.
        
       2. LIKE ������ ����
                 SELECT *
                  FROM TABLE_NAME
                 WHERE COLUMN_NAME              
                  LIKE Ư������             --COLUMN_NAME �÷��� ���� Ư�����ϰ� ������ ������ ����Ѵ�.
                  
                  
                 SELECT *
                  FROM TABLE_NAME
                 WHERE COLUMN_NAME              
                 NOT LIKE Ư������             --COLUMN_NAME �÷��� ���� Ư�����ϰ� �������� ���� ������ ����Ѵ�.   
                 
        3. Ư�� ����(���ϵ�ī�带 ����Ͽ� ���� ��Ī)
            - '%'  :  � ���� Ȥ�� ���ڿ��̵��� ��Ī�Ǿ��ٰ� �Ǵ��Ѵ�.  => 0~n����
            - '_'  :  �� ���� ���ڰ� � �����̵��� ��Ī �Ǿ��ٰ� �Ǵ��Ѵ�. => 1����            __ => 2����...
            - ex) select * from city where CountryCode like 'K%';
                  select * from city where CountryCode like '%K';
                  select * from city where CountryCode like '%K%';
                  select * from city where CountryCode like 'K__';
*/

SELECT *
FROM   tb_temper A
WHERE  a.area_cd = '108'                --�����ڵ� : ����Ư����
AND    a.std_de LIKE '____0710';


SELECT 
       SUBSTR(a.std_de, 5,4) AS MMDD
      ,MIN(a.min_temper) AS min_temper
      ,MAX(a.max_temper) AS MAX_TEMPER
FROM   tb_temper A
WHERE  a.area_cd = '108'                --�����ڵ� : ����Ư����
AND    a.std_de LIKE '____0710'
GROUP BY SUBSTR(a.std_de, 5,4) ;


select 
        b.area_cd                                   -- 7) B���̺��� �����ڵ带 ���Ѵ�.
       ,b.std_de                                    -- 7) B���̺��� �������ڸ� ���Ѵ�.
       ,b.min_temper                                -- 7) B���̺��� ��������� ���Ѵ�.
       ,b.max_temper                                -- 7) B���̺��� �ְ����� ���Ѵ�.                     
from
    (
        SELECT 
               SUBSTR(a.std_de, 5,4) AS MMDD       -- 4)�׷�ȭ�� MMDD�� ��ȸ�Ѵ�.
              ,MIN(a.min_temper) AS min_temper     -- 4)MIN()�Լ��� �̿��Ͽ� MMDD�� ������� ���߿��� ��������� ���Ѵ�.
              ,MAX(a.max_temper) AS MAX_TEMPER     -- 4)MAX()�Լ��� �̿��Ͽ� MMDD�� �ְ��� ���߿��� �ְ����� ���Ѵ�.
        FROM   tb_temper A                                                 -- 1) tb_temper���̺��� ��ȸ�Ѵ�.    
        WHERE  a.area_cd = '108'                --�����ڵ� : ����Ư����       -- 2) �����ڵ� "����Ư����"�� �����͸� �������� �Ѵ�.  
        AND    a.std_de LIKE '____0710'            -- 2) std_de�� ��4�ڸ��� � ���̵� �����ϰ� "0710"�� ������ �ุ�� ��ȸ�Ѵ�.             
        GROUP BY SUBSTR(a.std_de, 5,4)             -- 3) std_de���� 5��° �ڸ����� 4�ڸ� ���ڿ��� �������� ��MMDD�� �������� �׷�ȭ�Ѵ�.
    ) A
    , tb_temper B                                  -- 5) ������ ���̺��� tb_temper ���̺��� ��ȸ�Ѵ�.
where  ( substr(b.std_de, 5, 4) = a.MMDD and b.min_temper = a.min_temper )   -- 6) A������ MMDD�� min_temper�� �������� b���̺��� ã�´�.
   or  ( substr(b.std_de, 5, 4) = a.MMDD and b.max_temper = a.max_temper );  -- 6) A������ MMDD�� max_temper �������� b���̺��� ã�´�.

-- 7�� 10�� �������� ����� ���� ���Ҵ� ������ 1913���̴�.
-- 7�� 10�� �������� ����� ���� ���Ҵ� ������ 1943���̴�.


















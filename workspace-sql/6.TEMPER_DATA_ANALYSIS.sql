--04. 1�� �� ��� �ϱ����� ���� ū �� ���Ͻÿ�.
-- ����� ����ø� �������� ���� �ϱ��� ���� ���� �� �ϱ����� ���� ū ���� ���Ѵ�.

/*
    * order by ��
        1)select������ ������ �����͸� �����ϴµ� ����Ѵ�.
        2)���� ó���� �ſ� �߿��� ����̴�.
    * order by ����
        select
              column_1                  --������ �÷�
             ,column_2
        from
             tbl_name                   --���� ��� ���̺�� �Է�
        order by  column_1 ASC          --column_1�� �������� ����(default�� ASC)
                , column_2 DESC         --column_2�� �������� ����(default�� ASC)
*/
/*
    * ����Ŭ ���� �÷� : ROWNUM�� ����Ͽ� �� �Ǹ� ��°���.
*/

-- ����� �������� ���� ��� �ϱ��� ���� ���Ͻÿ�.
SELECT
      SUBSTR(a.std_de,5,2) AS MM
     ,ROUND(AVG(a.max_temper-a.min_temper),2) AS DAILY_CROSS
FROM TB_TEMPER A
WHERE A.AREA_CD = '108'
GROUP BY SUBSTR(A.STD_DE, 5, 2)
ORDER BY DAILY_CROSS DESC;


SELECT A.MM                                                 -- 7)MM�� ���� ��ȸ�Ѵ�.   
      ,a.daily_cross                                        -- 7)�ϱ��� ���� ��ȸ�Ѵ�.
    FROM (
            SELECT
                   SUBSTR(a.std_de,5,2) AS MM             --4)�׷����� MM�� ��ȸ�Ѵ�.  
                  ,ROUND(AVG(a.max_temper-a.min_temper),2) AS DAILY_CROSS   --4)AVG�Լ��� �̿��Ͽ� MM�� �ϱ��� ���� ����� ���Ѵ�. ����  ROUND�Լ��� �Ҽ��� 2°�ڸ����� �ݿø��Ѵ�.
            FROM  TB_TEMPER A                                               --1)TB_TEMPER ���̺��� ��ȸ�Ѵ�.
            WHERE A.AREA_CD = '108'                                         --2)�����ڵ尡 "����Ư����"�� �����͸� �������� �Ѵ�.
            GROUP BY SUBSTR(A.STD_DE, 5, 2)                --3)STD_DE���� 5��°�ڸ����� 2�ڸ� ���ڿ��� �������� �� MM�� �������� �׷�ȭ �Ѵ�.
            ORDER BY DAILY_CROSS DESC                      --5)SELECT������ ���� �ϱ��� ���� �������� ���� �����Ѵ�.     
         ) A
     WHERE ROWNUM <= 1;        --6)A������ �ϱ��� ���� �������� ���� ������ �����̴�. ���� ���� ���� �ִ� �� �Ѱ��� ��ȸ�Ѵ�.              
     
-- 1���� �ϱ����� ���� ū ���� 10�� ���ΰ��� �˼� �ִ�.












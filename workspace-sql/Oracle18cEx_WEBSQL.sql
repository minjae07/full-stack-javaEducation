--ȸ�� ���̺� ����

drop table t_member CASCADE CONSTRAINTS;
create table t_member
(
      id        varchar2(10)        PRIMARY KEY
    , pwd       varchar2(10)
    , name      varchar2(50)
    , email     varchar2(50)
    , joinDate  date                DEFAULT sysdate
);

-- ȸ�� ���� �߰�
insert INTO t_member
values('lee', '0805', '�̵�', 'lee@gmail.com', sysdate);

insert INTO t_member
values('lee2', '0805', '�̼���', 'lee2@gmail.com', sysdate);

insert INTO t_member
values('you', '0805', '������', 'you@gmail.com', sysdate);

commit;

select * from t_member;


-- �Խ��� ���̺� ����
drop table t_board CASCADE CONSTRAINTS;

create table t_board
(
      articleNo     number(10)      primary key
    , parentNo      number(10)      default 0
    , title         varchar2(500)   not null
    , content       varchar2(4000)  
    , imageFileName varchar2(30)
    , writeDate     date            default sysdate not null
    , id            varchar2(10)
    , constraint FK_ID foreign key(id) 
      REFERENCES t_member(id)
);

--�׽�Ʈ �� �߰�
insert into t_board (articleNo, parentno, title, content, imageFileName, writeDate, id)
values(1, 0, '�׽�Ʈ���Դϴ�', '�׽�Ʈ���Դϴ�', null, sysdate, 'you');

insert into t_board (articleNo, parentno, title, content, imageFileName, writeDate, id)
values(2, 0, '�ȳ��ϼ���.', '��ǰ �ı��Դϴ�.', null, sysdate, 'lee');

insert into t_board (articleNo, parentno, title, content, imageFileName, writeDate, id)
values(3, 2, '�亯�Դϴ�.', '��ǰ �ı⿡ ���� �亯�Դϴ�.', null, sysdate, 'you');

insert into t_board (articleNo, parentno, title, content, imageFileName, writeDate, id)
values(4, 3, '�亯�Դϴ�.', '��ǰ �����ϴ�.', null, sysdate, 'lee');

insert into t_board (articleNo, parentno, title, content, imageFileName, writeDate, id)
values(5, 3, '�̵��Դϴ�.', '�̵� �׽�Ʈ���Դϴ�', null, sysdate, 'lee');

insert into t_board (articleNo, parentno, title, content, imageFileName, writeDate, id)
values(6, 2, '��ǰ �ı��Դϴ�.', '�̼��� ��ǰ ��� �ı⸦ �ø��ϴ�.', null, sysdate, 'lee2');
commit;

select * from t_board;

select level,
    articleno,
    parentno,
    lpad(' ',4*(level-1)) || title title,
    content,
    writeDate,
    id
from t_board
start WITH parentno=0               -- parentno�� ���� 0�� ���� �ֻ��� �����̴ٶ�� �ǹ���.
CONNECT by PRIOR articleno=parentno -- �� ���� � �θ�۰� ����Ǵ� ���� ��Ÿ��.
order SIBLINGS by articleno desc;   -- ���� ������ ��ȸ�� ���� articleno �� ������������ ����.

SELECT max(articleNo) from t_board;



/*
    1)�ǻ��÷� : ���� ���̺��� ������ ���������� �߰��� ��¥ �÷���.  
    2)rownum : ������� ���̴� ���ȣ��.  �Ϻ� ���ڵ常 ����� �� ���.
*/
select * from t_board;
select articleNo, parentNo, ROWNUM
from t_board;

select * from t_board
where ROWNUM <= 5;

select level as lvl
      ,articleNo
      ,parentNo
      ,title
      ,id
      ,writeDate
from t_board
start WITH parentno=0               -- parentno�� ���� 0�� ���� �ֻ��� �����̴ٶ�� �ǹ���.
CONNECT by PRIOR articleno=parentno -- �� ���� � �θ�۰� ����Ǵ� ���� ��Ÿ��.
order SIBLINGS by articleno desc;   -- ���� ������ ��ȸ�� ���� articleno �� ������������ ����.

select * from (
                select rownum as recNum, lvl
                      ,articleNo
                      ,parentNo
                      ,title
                      ,id
                      ,writeDate
                from (select level as lvl
                              ,articleNo
                              ,parentNo
                              ,title
                              ,id
                              ,writeDate
                        from t_board
                        start WITH parentno=0              
                        CONNECT by PRIOR articleno=parentno 
                        order SIBLINGS by articleno desc
                      )  
            )
where recNum BETWEEN (1-1)*100+(1-1)*10+1 and (1-1)*100+1*10;     -- 1 and 10
--where recNum BETWEEN (1-1)*100+(2-1)*10+1 and (1-1)*100+2*10;     -- 11 and 20
--where recNum BETWEEN (1-1)*100+(3-1)*10+1 and (1-1)*100+3*10;     -- 21 and 30  
--                      ?         ?              ?        ? 
--                     section    pageNum       section   pageNum 

select count(articleNo) from t_board;












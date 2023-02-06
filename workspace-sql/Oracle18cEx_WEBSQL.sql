--회원 테이블 생성

drop table t_member CASCADE CONSTRAINTS;
create table t_member
(
      id        varchar2(10)        PRIMARY KEY
    , pwd       varchar2(10)
    , name      varchar2(50)
    , email     varchar2(50)
    , joinDate  date                DEFAULT sysdate
);

-- 회원 정보 추가
insert INTO t_member
values('lee', '0805', '이도', 'lee@gmail.com', sysdate);

insert INTO t_member
values('lee2', '0805', '이순신', 'lee2@gmail.com', sysdate);

insert INTO t_member
values('you', '0805', '유성룡', 'you@gmail.com', sysdate);

commit;

select * from t_member;


-- 게시판 테이블 생성
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

--테스트 글 추가
insert into t_board (articleNo, parentno, title, content, imageFileName, writeDate, id)
values(1, 0, '테스트글입니다', '테스트글입니다', null, sysdate, 'you');

insert into t_board (articleNo, parentno, title, content, imageFileName, writeDate, id)
values(2, 0, '안녕하세요.', '상품 후기입니다.', null, sysdate, 'lee');

insert into t_board (articleNo, parentno, title, content, imageFileName, writeDate, id)
values(3, 2, '답변입니다.', '상품 후기에 대한 답변입니다.', null, sysdate, 'you');

insert into t_board (articleNo, parentno, title, content, imageFileName, writeDate, id)
values(4, 3, '답변입니다.', '상품 좋습니다.', null, sysdate, 'lee');

insert into t_board (articleNo, parentno, title, content, imageFileName, writeDate, id)
values(5, 3, '이도입니다.', '이도 테스트글입니다', null, sysdate, 'lee');

insert into t_board (articleNo, parentno, title, content, imageFileName, writeDate, id)
values(6, 2, '상품 후기입니다.', '이순신 상품 사용 후기를 올립니다.', null, sysdate, 'lee2');
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
start WITH parentno=0               -- parentno의 값이 0인 글이 최상위 계층이다라는 의미임.
CONNECT by PRIOR articleno=parentno -- 각 글이 어떤 부모글과 연결되는 지를 나타냄.
order SIBLINGS by articleno desc;   -- 계층 구조로 조회된 글을 articleno 순 내림차순으로 정렬.

SELECT max(articleNo) from t_board;



/*
    1)의사컬럼 : 실제 테이블에는 없지만 인위적으로 추가한 가짜 컬럼임.  
    2)rownum : 순서대로 붙이는 행번호임.  일부 레코드만 출력할 때 사용.
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
start WITH parentno=0               -- parentno의 값이 0인 글이 최상위 계층이다라는 의미임.
CONNECT by PRIOR articleno=parentno -- 각 글이 어떤 부모글과 연결되는 지를 나타냄.
order SIBLINGS by articleno desc;   -- 계층 구조로 조회된 글을 articleno 순 내림차순으로 정렬.

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












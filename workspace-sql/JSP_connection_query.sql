DROP TABLE MEMBER CASCADE CONSTRAINTS;

-- member테이블 생성하는 쿼리문
CREATE TABLE MEMBER 
(
	  id			varchar2(20)
	, pw			varchar2(150)	NOT NULL
	, username		varchar2(20)	NOT NULL 
	, phone			varchar2(20)
	, CONSTRAINT member_pk PRIMARY key(id)
);

select * from member;

-- 테이블에 데이트를 입력하는 쿼리문
insert into member values('hong', '1234', '홍길동', null);
insert into member values('lee', '1234', '이순신', '01077777725');
insert into member values('leebang', '1234', '이방원', '01055588746');
insert into member values('leedo', '1234', '이도', null);

-- 테이블 데이터를 수정하는 쿼리문
-- 아래는 전체 데이트를 대상으로 다 수정함.
update member
set pw = '7890';

update member
set pw = '1234';

-- 조건에 맞는 데이터를 대상으로 수정함.
update member
    set pw = '7890'
where id ='lee';

-- id가 hong인 데이터만 삭제하는 쿼리.
delete from member
where id = 'hong';

--테이블 정보를 보는 쿼리문
desc member;
DESCRIBE member;

--테이블 수정하는 쿼리문
--addr이라는 컬럼 추가하는 쿼리문
alter table member
    add (addr varchar2(50));
    
--테이블을 삭제하는 쿼리문
drop table member;
    

alter table member
    drop column phone;

select * from member;
delete from member;








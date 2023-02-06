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

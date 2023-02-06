--사용자 DB
create table pets_user(
user_ID varchar2(20) primary key,
user_NAME varchar2(20) not null,
user_PW varchar2(20) not null,
user_Email varchar2(50) not null,
user_EmailHash varchar2(2048),
user_Address varchar2(2048) not null,
user_PhoneNumber number(20) not null,
user_Individual varchar2(64) not null,
user_Corporation varchar2(64) not null
);
insert INTO pets_user
values('lee', '이도', '0805', 'lee@gmail.com','', '대구', 01012345678, '개인', '기업');

insert INTO pets_user
values('kim', '김도', '0805', 'kim@gmail.com','', '대구', 01044445678, 'yes', 'no');

insert INTO pets_user
values('you', '유도', '0805', 'you@gmail.com','', '서울', 01033335678, 'yes', 'no');

commit;
select * from pets_user;

drop table q_board;
--문의하기 DB
create table Q_board
(
      qa_No         number(10)
    , qa_parentNo   number(10)       default 0
    , qa_title      varchar2(20)     primary key
    , qa_category   varchar2(40)
    , qa_content    varchar2(4000)   not null
    , qa_date       DATE            default sysdate
    , user_Id            varchar2(20)     not null
    , constraint    FK_ID foreign key(user_Id) --제약조건
    references  pets_user(user_Id)  --회원 테이블의 id요소 참조
);

insert into q_board
values('1', '0', 'Test입니다1', '기타', 'test입니다.', sysdate, 'lee');

insert into q_board
values('2', '0', 'Test입니다2', '결제', 'test입니다.', sysdate, 'kim');

insert into q_board
values('3', '0', 'Test입니다3', '서비스', 'test입니다.', sysdate, 'you');


insert into q_board
values('4', '0', 'Test입니다4', '건의사항', 'test입니다.', sysdate, 'lee');

commit;
select * from Q_board;

--공지사항 DB
create table notice_page
(
     no_number   number(20)   not null      PRIMARY KEY
   , no_title   varchar2(20)   not null
   , no_content   varchar2(4000)   not null
   , no_writer   varchar2(20)   not null
   , no_date   date      not null
   , no_hits   number(20)   not null
   , no_image   varchar2(30)   not null
);
select * from notice_page;

--게시판(3) DB
DROP TABLE pro_board CASCADE CONSTRAINTS;
-- 보호동물
CREATE TABLE pro_board
(
      pro_noticeNum     VARCHAR2(50)       PRIMARY KEY
     ,pro_kind          VARCHAR2(50)
     ,pro_gender        VARCHAR2(10)
     ,pro_age           NUMBER(10)
     ,pro_place         VARCHAR2(500)
     ,pro_findDate      DATE
     ,pro_character     VARCHAR2(4000)
     ,pro_neutering     VARCHAR2(20)
     ,pro_registNum     NUMBER(20)
     ,pro_state         VARCHAR2(50)
     ,pro_shelter       VARCHAR2(100)
     ,pro_img           VARCHAR2(30)
     ,pro_date          TIMESTAMP
     ,user_id           VARCHAR2(50)
     ,constraint    FK_ID_pro foreign key(user_Id)
    references  pets_user(user_Id)
);
select * from pro_board;

-- 실종동물
CREATE TABLE miss_board
(
      miss_boardNum     VARCHAR2(50)       PRIMARY KEY
     ,miss_name         VARCHAR2(50)
     ,user_id           VARCHAR2(50)
     ,user_email        VARCHAR2(50)
     ,user_address      VARCHAR2(50)
     ,user_phoneNumber     VARCHAR2(50)
     ,miss_kind         VARCHAR2(50)
     ,miss_gender       VARCHAR2(10)
     ,miss_age          NUMBER(10)
     ,miss_place        VARCHAR2(500)
     ,miss_missdate         DATE
     ,miss_character    VARCHAR2(4000)
     ,miss_neutering    VARCHAR2(20)
     ,miss_registNum    NUMBER(20)
     ,miss_img          VARCHAR2(30)
     ,miss_date         TIMESTAMP
     ,constraint FK_ID_miss foreign key(user_id)
      REFERENCES  pets_user(user_id)
);

select * from miss_board;

--반려동물 게시판
CREATE TABLE pet_board
(
      pet_boardNum      VARCHAR2(50)       PRIMARY KEY
     ,pet_name          VARCHAR2(50)
     ,user_id            VARCHAR2(50)
     ,user_address       VARCHAR2(50)
     ,pet_kind          VARCHAR2(50)
     ,pet_gender        VARCHAR2(10)
     ,pet_age           NUMBER(10)
     ,pet_content       VARCHAR2(4000)
     ,pet_img           VARCHAR2(30)
     ,pet_date          TIMESTAMP
     ,constraint FK_ID_pet foreign key(user_id)
      REFERENCES pets_user (user_id)
);


CREATE TABLE temp_board --임시보호요청 게시판
(
      temp_boardNum      VARCHAR2(50)       PRIMARY KEY
     ,temp_name          VARCHAR2(50)
     ,user_id            VARCHAR2(50)
     ,user_email         VARCHAR2(50)
     ,user_address       VARCHAR2(50)
     ,user_phoneNumber   VARCHAR2(50)
     ,temp_kind          VARCHAR2(50)
     ,temp_gender        VARCHAR2(10)
     ,temp_neutering     VARCHAR2(20)
     ,temp_age           NUMBER(10)
     ,temp_content       VARCHAR2(4000)
     ,temp_img           VARCHAR2(30)
     ,temp_term          DATE --임시보호 기간
     ,temp_date          TIMESTAMP
     ,constraint FK_ID_temp foreign key(user_id)
      REFERENCES pets_user (user_id)
);

select * from temp_board;

--애완용품 게시판
CREATE TABLE item_board
(

      item_number       number(10)     primary key
    , item_name         varchar2(50)
    , item_company      varchar2(50)
    , item_stock        number(20)
    , item_image        varchar2(30)
    , item_content      varchar2(4000)
    , item_price        number(20)
    , item_date         date
    , item_sort         varchar2(20)
    , item_petKind      varchar2(20)
    , item_writer       varchar2(20)
);

DROP TABLE dog_item CASCADE CONSTRAINTS;

commit;

select * from item_board;

select * from q_board order by qa_date desc;
create table pets_user (
    user_ID varchar2(20) primary key,
    user_NAME varchar2(20) not null,
    user_PW varchar2(20) not null,
    user_Email varchar2(50) not null,
    user_EmailHash varchar2(2048),
    user_Address varchar2(2048) not null,
    user_PhoneNumber number(20) not null,
    user_IC varchar2(64) not null
);

select * from pets_user;

insert into pets_user values('dcu','pet','0805','pets@gmail.com','','seoul','01012341234','Individual');

SELECT user_PW FROM pets_user Where user_ID = 'asdf';
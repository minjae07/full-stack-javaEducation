drop table memberDTO cascade constraints;
create table memberDTO
(
      username      varchar2(10)
    , id            varchar2(15)    PRIMARY key
    , pw            VARCHAR2(15)    
    , phone1        VARCHAR2(15)
    , phone2        VARCHAR2(15)
    , phone3        VARCHAR2(15)
    , gender        VARCHAR2(10)
);

select * from memberDTO;
insert into memberDTO values('이순신', 'Lee', '0805', '010', '5678', '7890', '남자');

insert into memberDTO values('이도', 'Lee2', '0805', '010', '5678', '7890', '남자');
insert into memberDTO values('이제', 'Lee3', '0805', '010', '5678', '7890', '남자');
insert into memberDTO values('하륜', 'Ha', '0805', '010', '5678', '7890', '남자');
insert into memberDTO values('이숙번', 'Lee4', '0805', '010', '5678', '7890', '남자');
commit;








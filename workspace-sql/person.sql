DROP TABLE person CASCADE CONSTRAINTS;

/*
	private String id;
	private String pw;
	private String name;
	private String email;
	private String address; * 
 */
CREATE TABLE person
(
	  id		varchar2(10)	PRIMARY KEY 
	, pw		varchar2(20)	
	, name		varchar2(20)
	, email		varchar2(20)
	, address	varchar2(50)
);

select * from person;

insert into person VALUES('1','0805','이성계','lee@gmail.com','서울시 영등포구');
insert into person VALUES('2','0805','정도전','jung@gmail.com','부산시 서면');
insert into person VALUES('3','0805','이방원','lee2@gmail.com','대구시 중구');
insert into person VALUES('4','0805','하륜','ha@gmail.com','대구시 달서구');
insert into person VALUES('5','0805','이도','lee3@gmail.com','서울시 마포구');
commit;









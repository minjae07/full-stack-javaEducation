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

insert into person VALUES('1','0805','�̼���','lee@gmail.com','����� ��������');
insert into person VALUES('2','0805','������','jung@gmail.com','�λ�� ����');
insert into person VALUES('3','0805','�̹��','lee2@gmail.com','�뱸�� �߱�');
insert into person VALUES('4','0805','�Ϸ�','ha@gmail.com','�뱸�� �޼���');
insert into person VALUES('5','0805','�̵�','lee3@gmail.com','����� ������');
commit;









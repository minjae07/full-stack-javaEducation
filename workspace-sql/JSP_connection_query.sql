DROP TABLE MEMBER CASCADE CONSTRAINTS;

-- member���̺� �����ϴ� ������
CREATE TABLE MEMBER 
(
	  id			varchar2(20)
	, pw			varchar2(150)	NOT NULL
	, username		varchar2(20)	NOT NULL 
	, phone			varchar2(20)
	, CONSTRAINT member_pk PRIMARY key(id)
);

select * from member;

-- ���̺� ����Ʈ�� �Է��ϴ� ������
insert into member values('hong', '1234', 'ȫ�浿', null);
insert into member values('lee', '1234', '�̼���', '01077777725');
insert into member values('leebang', '1234', '�̹��', '01055588746');
insert into member values('leedo', '1234', '�̵�', null);

-- ���̺� �����͸� �����ϴ� ������
-- �Ʒ��� ��ü ����Ʈ�� ������� �� ������.
update member
set pw = '7890';

update member
set pw = '1234';

-- ���ǿ� �´� �����͸� ������� ������.
update member
    set pw = '7890'
where id ='lee';

-- id�� hong�� �����͸� �����ϴ� ����.
delete from member
where id = 'hong';

--���̺� ������ ���� ������
desc member;
DESCRIBE member;

--���̺� �����ϴ� ������
--addr�̶�� �÷� �߰��ϴ� ������
alter table member
    add (addr varchar2(50));
    
--���̺��� �����ϴ� ������
drop table member;
    

alter table member
    drop column phone;

select * from member;
delete from member;








select * from dual;

--����Ŭ �� ���� ������� ���� ���������ϵ��� �������ִ� ������
alter session set "_ORACLE_SCRIPT"=true;

-- DASQL ������ ���� (������, ���Ѻο�)
CREATE USER DASQL identified by 0805;
alter user DASQL account unlock;
grant resource, dba, connect to DASQL;

create tablespace DASQL_DATA
datafile 'C:\app\DCU\product\18.0.0\oradata\XE\DASQL_DATA.dbf' size 2G
autoextend on next 512M maxsize unlimited
logging
online
permanent
extent management local autoallocate
blocksize 8K
segment space management auto
flashback on;


create temporary tablespace DASQL_TEMP
tempfile 'C:\app\DCU\product\18.0.0\oradata\XE\DASQL_TEMP.dbf' size 500M
autoextend on next 100M maxsize unlimited;

alter user DASQL default tablespace DASQL_DATA;
alter user DASQL temporary tablespace DASQL_TEMP;


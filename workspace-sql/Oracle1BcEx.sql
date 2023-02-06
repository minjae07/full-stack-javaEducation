select * from dual;

--오라클 구 버전 방식으로 계정 생성가능하도록 설정해주는 쿼리문
alter session set "_ORACLE_SCRIPT"=true;

-- DASQL 계정을 생성 (락해제, 권한부여)
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


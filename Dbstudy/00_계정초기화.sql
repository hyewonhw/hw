-- SCOTT 계정 초기화


DROP USER SCOTT CASCADE;

CREATE USER SCOTT IDENTIFIED BY TIGER;

GRANT CONNECT, RESOURCE TO SCOTT;
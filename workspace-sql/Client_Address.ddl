-- 생성자 Oracle SQL Developer Data Modeler 21.1.0.092.1221
--   위치:        2021-06-09 21:17:19 KST
--   사이트:      Oracle Database 11g
--   유형:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE address (
    city              VARCHAR2(100) NOT NULL,
    street            VARCHAR2(100),
    zip               NUMBER,
    client_client_id  NUMBER(6) NOT NULL
);

ALTER TABLE address ADD CONSTRAINT address_pk PRIMARY KEY ( client_client_id );

CREATE TABLE client (
    client_id    NUMBER(6) NOT NULL,
    client_name  VARCHAR2(50)
);

ALTER TABLE client ADD CONSTRAINT client_pk PRIMARY KEY ( client_id );

ALTER TABLE address
    ADD CONSTRAINT address_client_fk FOREIGN KEY ( client_client_id )
        REFERENCES client ( client_id )
            ON DELETE CASCADE;



-- Oracle SQL Developer Data Modeler 요약 보고서: 
-- 
-- CREATE TABLE                             2
-- CREATE INDEX                             0
-- ALTER TABLE                              3
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0

DROP TABLE ORDERS;
DROP TABLE CUSTOMERS;
DROP TABLE PRODUCTS;

CREATE TABLE PRODUCTS(
    PRODUCT_NO    NUMBER             NOT NULL,
    PRODUCT_NAME  VARCHAR2(100 BYTE) NOT NULL,
    PRODUCT_PRICE NUMBER             NULL,
    PRODUCT_IMAGE VARCHAR2(300 BYTE) NULL
);

CREATE TABLE CUSTOMERS(
    CUSTOMER_NO    NUMBER            NOT NULL,
    CUSTOMER_ID    VARCHAR2(30 BYTE) NOT NULL,
    CUSTOMER_NAME  VARCHAR2(30 BYTE) NULL,
    CUSROMER_PHONE VARCHAR2(15 BYTE) NULL
);

CREATE TABLE ORDERS(
    ORDER_NO     NUMBER NOT NULL,
    CUSTOMER_NO  NUMBER NOT NULL,
    PRODUCT_NO   NUMBER NOT NULL,
    ORDER_AMOUNT NUMBER NULL
);

ALTER TABLE PRODUCTS 
    ADD CONSTRAINT PRODUCT_PK PRIMARY KEY(PRODUCT_NO);
    
ALTER TABLE CUSTOMERS 
    ADD CONSTRAINT CUSTOMER_PK PRIMARY KEY(CUSTOMER_NO);
    
ALTER TABLE CUSTOMERS 
    ADD CONSTRAINT CUSTOMER_ID_UQ UNIQUE(CUSTOMER_ID);
    
ALTER TABLE ORDERS 
    ADD CONSTRAINT ORDER_PK PRIMARY KEY(ORDER_NO);
    
ALTER TABLE ORDERS 
    ADD CONSTRAINT ORDER_CUSTOMER_FK FOREIGN KEY(CUSTOMER_NO) REFERENCES CUSTOMERS(CUSTOMER_NO);

ALTER TABLE ORDERS 
    ADD CONSTRAINT ORDER_PRODUCT_FK FOREIGN KEY(PRODUCT_NO) REFERENCES PRODUCTS(PRODUCT_NO);


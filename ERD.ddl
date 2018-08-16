CREATE TABLE OE.CUSTOMERS (CUSTOMER_ID number(6, 0) NOT NULL, CUSTOMER_NAME varchar2(250) NOT NULL, CUSTOMER_ADDRESS varchar2(1000), CUSTOMER_PHONE varchar2(50), CUSTOMER_CONTACT varchar2(250), CUSTOMER_DISCOUNT number(3, 0), LIC_NUMBER varchar2(50), CUSTOMER_TYPE_ID number(1, 0) DEFAULT 0 NOT NULL, PRIMARY KEY (CUSTOMER_ID));
COMMENT ON TABLE OE.CUSTOMERS IS 'جدول العملاء';
COMMENT ON COLUMN OE.CUSTOMERS.CUSTOMER_CONTACT IS 'CONTACT PERSON IN COMPANY CASE';
COMMENT ON COLUMN OE.CUSTOMERS.CUSTOMER_DISCOUNT IS 'CUSTOMER DISCOUNT IN CASE COMPANY';
COMMENT ON COLUMN OE.CUSTOMERS.LIC_NUMBER IS 'CUSTOMER LICENCE IN CASE OF INDIVIDUALS';
COMMENT ON COLUMN OE.CUSTOMERS.CUSTOMER_TYPE_ID IS '0 > UN KNOWN
1 > INDIVIDUAL
2 > cOMPANY';
CREATE TABLE OE.ORDERS (ORDER_ID number(6, 0) NOT NULL, ORDER_DATE date NOT NULL, ORDER_TOTAL number(8, 2), CUSTOMER_ID number(6, 0) NOT NULL, PRIMARY KEY (ORDER_ID));
CREATE TABLE OE.ORDER_ITEMS (ORDER_ITEM_ID number(6, 0) NOT NULL, ORDER_ITEM_QTY number(6, 0) NOT NULL, ORDER_ID number(6, 0) NOT NULL, PRODUCT_ID number(6, 0) NOT NULL, PRIMARY KEY (ORDER_ITEM_ID));
CREATE TABLE OE.PRODUCTS (PRODUCT_ID number(6, 0) NOT NULL, PRODUCT_NAME varchar2(250) NOT NULL, PRODUCT_RETAIL_PRICE number(8, 2), PRODUCT_DESC varchar2(1000), PRIMARY KEY (PRODUCT_ID));
CREATE TABLE OE.MANUAL (MANUAL_ID number(6, 0) NOT NULL, MANUAL_PUBLISHER varchar2(250), PRODUCT_ID number(6, 0) NOT NULL, PRIMARY KEY (MANUAL_ID));
CREATE TABLE OE.SOFTWARE (SOFTWARE_ID number(6, 0) NOT NULL, SOFTWARE_LICENCE varchar2(250), PRODUCT_ID number(6, 0) NOT NULL, PRIMARY KEY (SOFTWARE_ID));
CREATE TABLE OE.HARDWARE (HARDWARE_ID number(6, 0) NOT NULL, HARDWARE_WARRANTY_PRD number(2, 0), PRODUCT_ID number(6, 0) NOT NULL, PRIMARY KEY (HARDWARE_ID));
CREATE TABLE OE.PARAMETERS (PARAM_ID number(6, 0) NOT NULL, PARAM_NAME varchar2(250) NOT NULL, PARAM_VALUE number(8, 2), PRIMARY KEY (PARAM_ID));
ALTER TABLE OE.ORDERS ADD CONSTRAINT ORDER_CUSTOMER FOREIGN KEY (CUSTOMER_ID) REFERENCES OE.CUSTOMERS (CUSTOMER_ID);
ALTER TABLE OE.ORDER_ITEMS ADD CONSTRAINT ORD_ORD_ITMS FOREIGN KEY (ORDER_ID) REFERENCES OE.ORDERS (ORDER_ID);
ALTER TABLE OE.MANUAL ADD CONSTRAINT PROD_MANUAL FOREIGN KEY (PRODUCT_ID) REFERENCES OE.PRODUCTS (PRODUCT_ID);
ALTER TABLE OE.SOFTWARE ADD CONSTRAINT PROD_SW FOREIGN KEY (PRODUCT_ID) REFERENCES OE.PRODUCTS (PRODUCT_ID);
ALTER TABLE OE.HARDWARE ADD CONSTRAINT PROD_HW FOREIGN KEY (PRODUCT_ID) REFERENCES OE.PRODUCTS (PRODUCT_ID);
ALTER TABLE OE.ORDER_ITEMS ADD CONSTRAINT ORD_ITM_PROD FOREIGN KEY (PRODUCT_ID) REFERENCES OE.PRODUCTS (PRODUCT_ID);
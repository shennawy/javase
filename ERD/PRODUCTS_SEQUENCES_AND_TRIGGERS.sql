-- Sequence
CREATE SEQUENCE OE.PRODUCTS_SEQ
START WITH 1
  MAXVALUE 999999999999999999999999999
  MINVALUE 1
  NOCYCLE
  CACHE 20
  NOORDER;
-- Trigger
CREATE TRIGGER OE.PRODUCTS_TRG
BEFORE INSERT
ON OE.PRODUCTS
REFERENCING NEW AS New OLD AS Old
FOR EACH ROW
BEGIN
-- For Toad:  Highlight column PRODUCT_ID
IF :new.PRODUCT_ID IS NULL THEN
  :new.PRODUCT_ID := PRODUCTS_SEQ.nextval;
  END IF;
END PRODUCTS_TRG;
/
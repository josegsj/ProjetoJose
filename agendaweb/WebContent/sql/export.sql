--------------------------------------------------------
--  File created - Segunda-feira-Abril-27-2009   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Sequence PESSOA_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "PESSOA_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence USUARIO_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "USUARIO_SEQ"  MINVALUE 1 MAXVALUE 999999999999999999999999999 INCREMENT BY 1 START WITH 21 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Table PESSOA
--------------------------------------------------------

  CREATE TABLE "PESSOA" 
   (	"ID" NUMBER(*,0), 
	"NOME" VARCHAR2(100), 
	"TELEFONE" VARCHAR2(50), 
	"ENDERECO" VARCHAR2(80), 
	"EMAIL" VARCHAR2(50), 
	"HP" VARCHAR2(50), 
	"CELULAR" VARCHAR2(20), 
	"DESCRICAO" VARCHAR2(80)
   ) ;
--------------------------------------------------------
--  DDL for Table USUARIO
--------------------------------------------------------

  CREATE TABLE "USUARIO" 
   (	"ID" NUMBER, 
	"LOGIN" VARCHAR2(20), 
	"SENHA" VARCHAR2(20)
   ) ;

---------------------------------------------------
--   DATA FOR TABLE PESSOA
--   FILTER = none used
---------------------------------------------------
REM INSERTING into PESSOA
Insert into PESSOA (ID,NOME,TELEFONE,ENDERECO,EMAIL,HP,CELULAR,DESCRICAO) values (1,'Gisele Bundchen','88889999','Rua dos Andradas','gisele@bundchen.com.br',null,null,null);
Insert into PESSOA (ID,NOME,TELEFONE,ENDERECO,EMAIL,HP,CELULAR,DESCRICAO) values (2,'Roberto Lopes','12345678','Rua das Laranjeiras','roberto@lopes.com.br','http://www.lopes.com.br','12345678',null);

---------------------------------------------------
--   END DATA FOR TABLE PESSOA
---------------------------------------------------

---------------------------------------------------
--   DATA FOR TABLE USUARIO
--   FILTER = none used
---------------------------------------------------
REM INSERTING into USUARIO
Insert into USUARIO (ID,LOGIN,SENHA) values (1,'gisele','1234');
Insert into USUARIO (ID,LOGIN,SENHA) values (2,'lopes','4567');

---------------------------------------------------
--   END DATA FOR TABLE USUARIO
---------------------------------------------------
--------------------------------------------------------
--  Constraints for Table PESSOA
--------------------------------------------------------

  ALTER TABLE "PESSOA" ADD CONSTRAINT "PESSOA_PK" PRIMARY KEY ("ID") ENABLE;
 
  ALTER TABLE "PESSOA" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table USUARIO
--------------------------------------------------------

  ALTER TABLE "USUARIO" MODIFY ("ID" NOT NULL ENABLE);
 
  ALTER TABLE "USUARIO" ADD CONSTRAINT "USUARIO_PK" PRIMARY KEY ("ID") ENABLE;
--------------------------------------------------------
--  DDL for Index PESSOA_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "PESSOA_PK" ON "PESSOA" ("ID") 
  ;
--------------------------------------------------------
--  DDL for Index USUARIO_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "USUARIO_PK" ON "USUARIO" ("ID") 
  ;

--------------------------------------------------------
--  Ref Constraints for Table USUARIO
--------------------------------------------------------

  ALTER TABLE "USUARIO" ADD CONSTRAINT "USUARIO_PESSOA_FK1" FOREIGN KEY ("ID")
	  REFERENCES "PESSOA" ("ID") ENABLE;
--------------------------------------------------------
--  DDL for Trigger PESSOA_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "PESSOA_TRG" 
 BEFORE INSERT ON PESSOA 
FOR EACH ROW 
BEGIN
  SELECT PESSOA_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
END;
/
ALTER TRIGGER "PESSOA_TRG" ENABLE;
--------------------------------------------------------
--  DDL for Trigger USUARIO_TRG
--------------------------------------------------------

  CREATE OR REPLACE TRIGGER "USUARIO_TRG" 
 BEFORE INSERT ON USUARIO 
FOR EACH ROW 
BEGIN
  SELECT USUARIO_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
END;
/
ALTER TRIGGER "USUARIO_TRG" ENABLE;

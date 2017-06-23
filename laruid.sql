--------------------------------------------------------
--  File created - Friday-August-07-2015   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table LARS_UID
--------------------------------------------------------

  CREATE TABLE "ATOMIC_ADM"."LARS_UID" 
   (	"UNQU_ID" NUMBER(14,0), 
	"RECORD_TYPE" NUMBER(4,0), 
	"SVC_NUM" VARCHAR2(32 BYTE), 
	"SVC_NUM_NEW" VARCHAR2(32 BYTE), 
	"REL_FLAG" VARCHAR2(1 BYTE), 
	"EFF_DT" DATE, 
	"EXTRACT_DT" DATE, 
	"PARTY_ID" NUMBER(4,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "ATOMIC_ADM_DATA_SMALL" ;
--------------------------------------------------------
--  DDL for Index LARS_UID_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "ATOMIC_ADM"."LARS_UID_PK" ON "ATOMIC_ADM"."LARS_UID" ("SVC_NUM") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "ATOMIC_ADM_DATA_SMALL" ;
--------------------------------------------------------
--  Constraints for Table LARS_UID
--------------------------------------------------------

  ALTER TABLE "ATOMIC_ADM"."LARS_UID" ADD CONSTRAINT "LARS_UID_PK" PRIMARY KEY ("SVC_NUM")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "ATOMIC_ADM_DATA_SMALL"  ENABLE;
  ALTER TABLE "ATOMIC_ADM"."LARS_UID" MODIFY ("SVC_NUM" NOT NULL ENABLE);


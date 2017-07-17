
--DDL

[���̺� ����]
-30������, ���� ��/�ҹ��� ���� Ư������ �ѱ۸� ���԰���
-�ߺ��Ǵ� �̸��� X

CREATE TABLE USER_TBL(
		ID		VARCHAR2(50) PRIMARY KEY,		--�⺻Ű�ΰɾ�ּ� �ߺ��ȵȴ�
		PWD		VARCHAR2(50) NOT NULL,			--NOT NULL�� �÷����������������ؾ��Ѵ�
		EMAIL	VARCHAR2(100) , 
		PHONE	VARCHAR2(20) ,
		REGDATE	DATE DEFAULT SYSDATE ,
		POINT	NUMBER	DEFAULT 0  				--NUMBER �� ������ ���������� ���Ѵ�.
		);
		
DROP TABLE USER_TBL


--DML	

INSERT INTO ���̺���(�÷�����Ʈ)  <-- �÷�����Ʈ�� ���� / �÷�����Ʈ�� ������ �÷��� ������ ���ƾ���
VALUES(VALUE,VALUE,VALUE,VALUE)

INSERT INTO USER_TBL
VALUES('jslim3','jslim','jslim@naver.com','010-0000-0000',SYSDATE,1000);

INSERT INTO USER_TBL(ID,PWD)
VALUES('jslim4','jslim');

INSERT INTO USER_TBL(ID,PWD,REGDATE,POINT)
VALUES('jslim5','jslim',DEFAULT,DEFAULT);


SELECT *
FROM USER_TBL		<-- ���̺��� ������ ��Ű������Ѵ�.

-------------------------------------------------------------------
-- SEQUENCE ��ü (NEXTVAL,CURRVAL) 1���� ���ѱ��� �ֱ⶧���� �ߺ����� �ʴ´�.
-- �׷��� �⺻Ű�� �����ϱ� ������ �������� ���� �⺻Ű�� �Ҵ��ϴ� ��찡 ����.


CREATE SEQUENCE BOARDSEQ ;
DROP SEQUENCE BOARDSEQ;

SELECT BOARDSEQ.NEXTVAL FROM DUAL ;
SELECT BOARDSEQ.CURRVAL FROM DUAL ;


--�������� �ܷ�Ű���� ���̺�

SELECT * FROM BOARD_TBL ; 
DROP TABLE BOARD_TBL ;


CREATE TABLE BOARD_TBL(
	SEQ		NUMBER,
	TITLE	VARCHAR2(100),
	CONTENT	VARCHAR2(2000),
	WRITER	VARCHAR2(50)	NOT NULL REFERENCES USER_TBL(ID),
	REGDATE	DATE,
	VIEWCNT	NUMBER,
	PRIMARY KEY(SEQ)
);

INSERT INTO	BOARD_TBL
VALUES(	BOARDSEQ.NEXTVAL,'����','�����ް�','jslim',SYSDATE,0);



--[composit primary key]

-- �̷��� �ΰ��� PRIMARYŰ�� ������� �÷��������� �ϸ�ȴ�� ���̺��������� ��� ���ش�
-- ���������� ���۷����� �ΰ��ϰ�� ���̺���������


CREATE TABLE CPK_TBL(
	ORDERNUM	NUMBER, --[PRIMARY KEY]
	ITEMNUM		NUMBER,	--[PRIMARY KEY]
	QTY			NUMBER,
	PRIMARY KEY(ORDERNUM,ITEMNUM)				
);

INSERT INTO CPK_TBL VALUES (1,1,10);
INSERT INTO CPK_TBL VALUES (1,2,5);

SELECT *
FROM	CPK_TBL

--[composit foreign key]


CREATE TABLE CFK_TBL(

	ORDERNUM	NUMBER NOT NULL,
	ITEMNUM		NUMBER NOT NULL,
	FOREIGN KEY (ORDERNUM,ITEMNUM) REFERENCES CPK_TBL(ORDERNUM,ITEMNUM),	
	PRIMARY KEY(ORDERNUM,ITEMNUM)
);

DROP TABLE CFK_TBL

--NOT NULL �� �÷����������� �������ִ�. 

INSERT INTO CFK_TBL VALUES (1,NULL,NULL);

SELECT *
FROM	CFK_TBL




--[�����ϱ�]

UPDATE ���̺��� 
SET �÷��� = VALUE[,�÷��� = VALUE]
WHERE	�⺻Ű = VALUE ;

UPDATE BOARD_TBL 
SET CONTENT = '���̾�'
WHERE	SEQ = 3 ;


SELECT *
FROM BOARD_TBL

CREATE TABLE BOARD_TBL(
	SEQ		NUMBER,
	TITLE	VARCHAR2(100),
	CONTENT	VARCHAR2(2000),
	WRITER	VARCHAR2(50)	NOT NULL REFERENCES USER_TBL(ID),
	REGDATE	DATE,
	VIEWCNT	NUMBER,
	PRIMARY KEY(SEQ)
);

--[�����ϱ�]

DELETE FROM ���̺���
WHERE	�⺻Ű�÷� = VALUE;

DELETE FROM BOARD_TBL
WHERE SEQ = 3;

--[CHECK ��������]

CREATE TABLE CHK_TBL(
		ID VARCHAR(20) PRIMARY KEY,
		SALARY	NUMBER CHECK(SALARY >120)
);



---------------------------------------------------------

[������]

CREATE SEQUENCE SEQ_EMPID
START WITH 300      --�ʱⰪ
INCREMENT BY 5		--������
MAXVALUE 310		
NOCYCLE				--���Ͼ���
NOCACHE;			--�̸��޸𸮿� ������������

---------------------------------------------------------

[�� VIEW]

CREATE OR REPLACE VIEW V_EMP
AS  SELECT 	EMP_NAME,DEPT_ID
	FROM	EMPLOYEE
	WHERE	DEPT_ID ='90';
	
SELECT *
FROM	V_EMP;

---------------------------------------------------------
����� ALIAS �� ���


CREATE OR REPLACE VIEW V_EMP AS
SELECT 	EMP_NAME,
		DECODE(SUBSTR(EMP_NO,8,1),'1','����','3','����','����'),
		ROUND(MONTHS_BETWEEN(SYSDATE,HIRE_DATE)/12,0)
FROM	EMPLOYEE;

�̷��� �ϸ� ������ ���� -> �׷��� ��Ī�� �ٿ��ִ°�



CREATE OR REPLACE VIEW V_EMP ("Enm","Gender","Years") AS
SELECT 	EMP_NAME,
		DECODE(SUBSTR(EMP_NO,8,1),'1','����','3','����','����'),
		ROUND(MONTHS_BETWEEN(SYSDATE,HIRE_DATE)/12,0)
FROM	EMPLOYEE;

SELECT * 
FROM V_EMP

DROP VIEW view_name ;

----------------------------------------------------------


SELECT 	ROWNUM , EMP_NAME , SALARY
FROM	( SELECT EMP_NAME, SALARY
		  FROM (SELECT NVL(DEPT_ID,'N/A') AS "Did",
				ROUND(AVG(SALARY),-3) AS "Davg"
				FROM	 EMPLOYEE
				GROUP BY DEPT_ID) INLV
		  JOIN	EMPLOYEE ON (NVL(DEPT_ID,'N/A')= INLV."Did")
		  WHERE	SALARY > INLV."Davg"
		ORDER BY 2 DESC)
WHERE	ROWNUM <=1;



SELECT ROWNUM , STUDENT_NO , STUDENT_NAME
FROM  ( SELECT STUDENT_NO , STUDENT_NAME
		  FROM (SELECT NVL(DEPT_ID,'N/A') AS "Did",
				ROUND(AVG(SALARY),-3) AS "Davg"
				FROM	 EMPLOYEE
				GROUP BY DEPT_ID) INLV
		  JOIN	EMPLOYEE ON (NVL(DEPT_ID,'N/A')= INLV."Did")
		  WHERE	SALARY > INLV."Davg"
		ORDER BY 2 DESC)

WHERE 



















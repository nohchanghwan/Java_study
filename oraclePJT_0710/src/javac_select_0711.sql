--0710--[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]

--SELECT ������� �⺻����--
SELECT * 
FROM   EMPLOYEE ;

SELECT EMP_ID,EMP_NAME
FROM EMPLOYEE ;

select *
from DEPARTMENT;
--OPTION ����--
WHERE �࿡���� ����
GROUP BY
HAVING
ORDER BY

--�μ���ȣ�� 10���� ������� --
SELECT 	EMP_NAME AS "�� ��", SALARY AS "�޿�(��)"
FROM 	EMPLOYEE
WHERE	DEPT_ID = 10;

-----------------------------------------------
SELECT EMP_NAME AS �̸�,
	   SALARY*12 AS �޿�,
	   (SALARY+(SALARY*BONUS_PCT))*12 AS �Ѽҵ�
FROM EMPLOYEE

-----
SELECT EMP_ID,
	   EMP_NAME,
	   '����' AS �ٹ�����
FROM   EMPLOYEE ;

SELECT DISTINCT JOB_ID , DEPT_ID
FROM EMPLOYEE ;

ĳ����Ÿ�԰� varĳ����Ÿ���� ������ ����������


--0711--[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]

SELECT 	EMP_NAME || '�� ������ ' || SALARY || '�� �Դϴ�.'
FROM 	EMPLOYEE;
-----------------------------------------------
BETWEEN AND 			: Ư�� ������ ���ԵǴ�����
LIKE / NOT LIKE 		: ���������� ��
IS NULL / IS NOT NULL 	: NULL���ڿ��� ��
IN 					  	: �񱳰� ��Ͽ� ���ԵǴ��� ���� ��
-----------------------------------------------
SELECT 	EMP_NAME,
	   	SALARY
FROM 	EMPLOYEE
WHERE 	SALARY BETWEEN 3500000 AND 5500000;

-- LIKE����ϱ�
SELECT	EMP_NAME,PHONE
FROM 	EMPLOYEE
WHERE 	PHONE LIKE '___9_______'

-- ESCAPE����ϱ� : ���ϵ�ī�� ��ü�� �����ͷ� ó���Ҽ����� 
SELECT 	EMP_NAME,
		EMAIL
FROM	EMPLOYEE 
WHERE 	EMAIL LIKE '___\_%'ESCAPE'\';

-- NULL�� = �� ���Ҽ����⶧���� IS NULL �̳� IS NOT NULL ���
SELECT	EMP_NAME , DEPT_ID , BONUS_PCT
FROM	EMPLOYEE
WHERE	DEPT_ID IS NULL
AND		BONUS_PCT IS NOT NULL;

-- IN ������ ����ؼ� ORó�� ��밡���ϴ�
SELECT 	EMP_NAME , DEPT_ID , SALARY
FROM 	EMPLOYEE
WHERE 	DEPT_ID IN('60','90');

-- PL/SQL �Լ�����ϱ�
�ް��ϸ� varchar (char ����)�ΰ��� ���Ѵ�

--�ֿ�������Լ� - ���ڿ��Լ� INSTR
'@vcc..com'���ڿ��� .�ٷξ��� ���� 'c'�� ��ġ���Ͻÿ�
-1�� ���������� ó��������c�� 2ĭ��ŭ�̵�
SELECT	EMAIL,
 		INSTR(EMAIL,'c',-1,2)��ġ
 FROM   EMPLOYEE;

--�ֿ�������Լ� - ���ڿ��Լ� LPAD/RPAD
�е��� �����ǹ��ڿ��� ���� / �����ʿ� ���ٿ� ���� N�� ���ڿ��� ��ȯ�ϴ� �Լ� => ���ı��

SELECT  EMAIL AS ����������,
		LENGTH(EMAIL) AS ��������,
		LPAD(EMAIL,20,'.')AS ������,
		LENGTH(LPAD(EMAIL,20,'.')) AS �������
FROM 	EMPLOYEE;

--�ֿ�������Լ� - ���ڿ��Լ� LTRIM/RTRIM
�������� ���� ���ڿ������� ���´�

SELECT 	LTRIM('xyzzxzx123Techxxx','xyz')
FROM	DUAL; 

--�ֿ�������Լ� - ���ڿ��Լ� TRIM

SELECT 	TRIM(BOTH '1' FROM '1tech1')   
FROM 	DUAL;

BOTH �� �翷 (�ٵ� �Ƚᵵ�Ȱ���)
LEADING �� ���ʿ��ִ°��� 
TRAILING �� ������(��)�� �ִ°��� ���ش�.

--�ֿ�������Լ� - ���ڿ��Լ� SUBSTR
-�������� 8��ŭ �̵���(�ڿ�������) ���ڸ����� 2��
SELECT  SUBSTR('TechOnTheNet',-8,2)
FROM	DUAL;

--SYSDATE : ��¥�Լ�
SUBSTR �� �߶󳽵� 20�̶���ģ�� �װ��� ���ڷ� �ٲ۴�.
SELECT 	SYSDATE
FROM	DUAL;

SELECT 	SUBSTR(SYSDATE,1,4)
FROM	DUAL;

SELECT 	TO_NUMBER(20||SUBSTR(SYSDATE,1,2)) - (1900+93) AS AGE
FROM 	DUAL;

--�ֿ�������Լ� - ���ڿ��Լ� ROUND,TRUNC

SELECT 	TRUNC(123.315,1) 
FROM	DUAL;

SELECT 	ROUND(127.315,-1) 
FROM	DUAL;

SELECT 	ROUND(123.315,2) 
FROM	DUAL;

ROUND �� �ش� �ڸ����� �ݿø��ϴ� �Լ�
TRUNC �� �ݴ�� �����ϴ� �Լ�

--�ֿ�������Լ� - ��¥�Լ� ADD_MONTH , MONTHS_BETWEEN
 MONTHS_BETWEEN(date1,date2) �� ��¥������ ���� ��-��
 
SELECT 	*
FROM	EMPLOYEE 

-- ������̺��� ���糯¥�������� �ټӳ���� 10���̻��� �����˻�,�޿�,�ټӳ���� ����϶�

SELECT 	EMP_NAME,
		SALARY, 
		TRUNC(MONTHS_BETWEEN(SYSDATE,HIRE_DATE)/12)  AS �ټӿ���
FROM 	EMPLOYEE
WHERE	MONTHS_BETWEEN(SYSDATE,HIRE_DATE) > 120;

-- ������ Ÿ�� ��ȯ 

 NUMBER			 CHARACTER			DATE
    <<TO_NUMBER			  <<TO_CHAR
      TO_CHAR>>				TO_DATE>>
      
      
SELECT 	DEPT_ID  , DEPT_NAME , LOC_ID
FROM	DEPARTMENT;

SELECT 	EMP_NAME , DEPT_ID
FROM 	EMPLOYEE
WHERE 	DEPT_ID = '10';


--�ֿ�������Լ� -������Ÿ�� ��ȭ �Լ� TO_CHAR ��� ��

9	:�ڸ�������
0	:�����ڸ� 0����ǥ��
$,L	: ��ȭ��ȣǥ��
. , : ��������ġ�� . , ǥ��

SELECT TO_CHAR (1234,'99999')	FROM DUAL;
SELECT TO_CHAR (1234,'09999')	FROM DUAL;
SELECT TO_CHAR (1234,'L99999')	FROM DUAL;
SELECT TO_CHAR (1234,'99,999')	FROM DUAL;
SELECT TO_CHAR (1234,'09,999')	FROM DUAL;


--�ֿ�������Լ� -������Ÿ�� ��ȭ �Լ� TO_CHAR ��� ��

 YYYY/YY/YEAR 		: �⵵
 MONTH/MON/MM/RM 	: ��
 DDD/DD/D			: ��(1��/1��/1�� ����)
 Q					: �б�
 DAY/DY				: ����
 HH(12)/HH24		: 12,24 �ð�ǥ��
 AN|PM				: ����,����
 MI					:��
 SS					:��

SELECT 	TO_CHAR(SYSDATE , 'PM HH24:MI') FROM DUAL;
SELECT 	EMP_NAME AS �̸� , 
		TO_CHAR(HIRE_DATE,'YYYY"��" MM"��" DD"��"') AS �Ի���
FROM  	EMPLOYEE
WHERE	JOB_ID = 'J7';


--�ֿ�������Լ� -������Ÿ�� ��ȭ �Լ� TO_DATE

SELECT TO_DATE('20100101','YYYYMMDD') FROM DUAL;
SELECT TO_CHAR('20100101','YYYY,MON') FROM DUAL;
SELECT TO_CHAR(TO_DATE('20100101','YYYYMMDD'),'YYYY,MON') FROM DUAL;
SELECT TO_DATE('041030 143000','YYMMDD HH24MISS') FROM DUAL;
SELECT TO_CHAR(TO_DATE('041030 143000','YYMMDD HH24MISS'), 'DD-MON-YY HH:MI:SS PM') FROM DUAL;
SELECT TO_DATE('980630','YYMMDD') FROM DUAL;
SELECT TO_CHAR(TO_DATE('980630','RRMMDD'),'YYYY.MM.DD') FROM DUAL;

RR ��¥���� :���⹮��x 

--�ֿ�������Լ� -������Ÿ�� ��ȭ �Լ� TO_NUMBER
�ֹε�Ϲ�ȣ

SELECT 	EMP_NAME, EMP_NO,
		SUBSTR(EMP_NO,1,6) AS �պκ�,
		SUBSTR(EMP_NO,8) AS �޺κ�,
		SUBSTR(EMP_NO,1,6) +  SUBSTR(EMP_NO,8) AS ���
FROM EMPLOYEE
WHERE EMP_ID = '101';


--�ֿ�������Լ� -��Ÿ�Լ� NVL
SELECT EMP_NAME , SALARY , NVL(BONUS_PCT,0)
FROM EMPLOYEE
WHERE SALARY > 3500000;                              

--�ֿ�������Լ� -��Ÿ�Լ� DECODE 

SELECT 	EMP_NAME,
		DECODE(SUBSTR(EMP_NO,8,1),
		'1','��','2','��','3','��','4','��') AS ����
FROM 	EMPLOYEE
WHERE	DEPT_ID = '50';

--�μ��� ����� �λ�޿��� Ȯ��
-- 10���μ� �λ���� 10% 20���� 15% 30=> 20 �������� x 

SELECT 	EMP_NAME , 
		DEPT_ID , 
		SALARY , 
		DECODE(DEPT_ID,
		'10',SALARY*1.1,
		'20',SALARY*1.15,
		'30',SALARY*1.2,
		SALARY)AS �λ�޿�
FROM EMPLOYEE;

 if else �������� DEFAULT ���ش�.

--�ֿ�������Լ� -��Ÿ�Լ� CASE
CASE expr [WHEN search1 THEN result1][ELSE default] END

SELECT 	EMP_NAME,
		SALARY,
		CASE
		WHEN SALARY <='3000000' THEN '�ʱ�'
		WHEN SALARY <='4500000' THEN '�߱�'
		ELSE '���' 
		END AS �޿�Ŭ��
FROM EMPLOYEE
ORDER BY SALARY DESC , 2 DESC; 

DESC|ASC




























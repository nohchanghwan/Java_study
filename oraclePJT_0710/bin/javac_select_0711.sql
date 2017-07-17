--0710--[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]

--SELECT 를만드는 기본구문--
SELECT * 
FROM   EMPLOYEE ;

SELECT EMP_ID,EMP_NAME
FROM EMPLOYEE ;

select *
from DEPARTMENT;
--OPTION 구문--
WHERE 행에대한 제한
GROUP BY
HAVING
ORDER BY

--부서번호가 10번인 사원정보 --
SELECT 	EMP_NAME AS "이 름", SALARY AS "급여(원)"
FROM 	EMPLOYEE
WHERE	DEPT_ID = 10;

-----------------------------------------------
SELECT EMP_NAME AS 이름,
	   SALARY*12 AS 급여,
	   (SALARY+(SALARY*BONUS_PCT))*12 AS 총소득
FROM EMPLOYEE

-----
SELECT EMP_ID,
	   EMP_NAME,
	   '재직' AS 근무여부
FROM   EMPLOYEE ;

SELECT DISTINCT JOB_ID , DEPT_ID
FROM EMPLOYEE ;

캐릭터타입과 var캐릭터타입은 고정과 가변의차이


--0711--[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][]

SELECT 	EMP_NAME || '의 월급은 ' || SALARY || '원 입니다.'
FROM 	EMPLOYEE;
-----------------------------------------------
BETWEEN AND 			: 특정 범위에 포함되는지비교
LIKE / NOT LIKE 		: 문자패턴을 비교
IS NULL / IS NOT NULL 	: NULL문자여부 비교
IN 					  	: 비교값 목록에 포함되는지 여부 비교
-----------------------------------------------
SELECT 	EMP_NAME,
	   	SALARY
FROM 	EMPLOYEE
WHERE 	SALARY BETWEEN 3500000 AND 5500000;

-- LIKE사용하기
SELECT	EMP_NAME,PHONE
FROM 	EMPLOYEE
WHERE 	PHONE LIKE '___9_______'

-- ESCAPE사용하기 : 와일드카드 자체를 데이터로 처리할수있음 
SELECT 	EMP_NAME,
		EMAIL
FROM	EMPLOYEE 
WHERE 	EMAIL LIKE '___\_%'ESCAPE'\';

-- NULL은 = 로 비교할수없기때문에 IS NULL 이나 IS NOT NULL 사용
SELECT	EMP_NAME , DEPT_ID , BONUS_PCT
FROM	EMPLOYEE
WHERE	DEPT_ID IS NULL
AND		BONUS_PCT IS NOT NULL;

-- IN 연산자 사용해서 OR처럼 사용가능하다
SELECT 	EMP_NAME , DEPT_ID , SALARY
FROM 	EMPLOYEE
WHERE 	DEPT_ID IN('60','90');

-- PL/SQL 함수사용하기
앵간하면 varchar (char 보단)로가면 편한다

--주요단일행함수 - 문자열함수 INSTR
'@vcc..com'문자열중 .바로앞의 문자 'c'의 위치구하시오
-1은 역방향으로 처음만나는c붜 2칸만큼이동
SELECT	EMAIL,
 		INSTR(EMAIL,'c',-1,2)위치
 FROM   EMPLOYEE;

--주요단일행함수 - 문자열함수 LPAD/RPAD
패딩은 임의의문자열을 왼쪽 / 오른쪽에 덧붙여 길이 N의 문자열을 반환하는 함수 => 정렬기대

SELECT  EMAIL AS 원본데이터,
		LENGTH(EMAIL) AS 원본길이,
		LPAD(EMAIL,20,'.')AS 적용결과,
		LENGTH(LPAD(EMAIL,20,'.')) AS 결과길이
FROM 	EMPLOYEE;

--주요단일행함수 - 문자열함수 LTRIM/RTRIM
만족하지 않은 문자열만나면 나온다

SELECT 	LTRIM('xyzzxzx123Techxxx','xyz')
FROM	DUAL; 

--주요단일행함수 - 문자열함수 TRIM

SELECT 	TRIM(BOTH '1' FROM '1tech1')   
FROM 	DUAL;

BOTH 는 양옆 (근데 안써도똑같다)
LEADING 은 왼쪽에있는것을 
TRAILING 은 오른쪽(뒤)에 있는것을 없앤다.

--주요단일행함수 - 문자열함수 SUBSTR
-방향으로 8만큼 이동후(뒤에서부터) 그자리에서 2개
SELECT  SUBSTR('TechOnTheNet',-8,2)
FROM	DUAL;

--SYSDATE : 날짜함수
SUBSTR 로 잘라낸뒤 20이랑합친후 그것을 숫자로 바꾼다.
SELECT 	SYSDATE
FROM	DUAL;

SELECT 	SUBSTR(SYSDATE,1,4)
FROM	DUAL;

SELECT 	TO_NUMBER(20||SUBSTR(SYSDATE,1,2)) - (1900+93) AS AGE
FROM 	DUAL;

--주요단일행함수 - 문자열함수 ROUND,TRUNC

SELECT 	TRUNC(123.315,1) 
FROM	DUAL;

SELECT 	ROUND(127.315,-1) 
FROM	DUAL;

SELECT 	ROUND(123.315,2) 
FROM	DUAL;

ROUND 는 해당 자리에서 반올림하는 함수
TRUNC 는 반대로 절삭하는 함수

--주요단일행함수 - 날짜함수 ADD_MONTH , MONTHS_BETWEEN
 MONTHS_BETWEEN(date1,date2) 두 날짜사이의 차이 앞-뒤
 
SELECT 	*
FROM	EMPLOYEE 

-- 사원테이블에서 현재날짜기준으로 근속년수가 10년이상인 사람들검색,급여,근속년수를 출력하라

SELECT 	EMP_NAME,
		SALARY, 
		TRUNC(MONTHS_BETWEEN(SYSDATE,HIRE_DATE)/12)  AS 근속연수
FROM 	EMPLOYEE
WHERE	MONTHS_BETWEEN(SYSDATE,HIRE_DATE) > 120;

-- 데이터 타입 변환 

 NUMBER			 CHARACTER			DATE
    <<TO_NUMBER			  <<TO_CHAR
      TO_CHAR>>				TO_DATE>>
      
      
SELECT 	DEPT_ID  , DEPT_NAME , LOC_ID
FROM	DEPARTMENT;

SELECT 	EMP_NAME , DEPT_ID
FROM 	EMPLOYEE
WHERE 	DEPT_ID = '10';


--주요단일행함수 -데이터타입 변화 함수 TO_CHAR 사용 예

9	:자리수지정
0	:남는자리 0으로표시
$,L	: 통화기호표시
. , : 지정한위치에 . , 표시

SELECT TO_CHAR (1234,'99999')	FROM DUAL;
SELECT TO_CHAR (1234,'09999')	FROM DUAL;
SELECT TO_CHAR (1234,'L99999')	FROM DUAL;
SELECT TO_CHAR (1234,'99,999')	FROM DUAL;
SELECT TO_CHAR (1234,'09,999')	FROM DUAL;


--주요단일행함수 -데이터타입 변화 함수 TO_CHAR 사용 예

 YYYY/YY/YEAR 		: 년도
 MONTH/MON/MM/RM 	: 달
 DDD/DD/D			: 일(1년/1달/1주 기준)
 Q					: 분기
 DAY/DY				: 요일
 HH(12)/HH24		: 12,24 시간표시
 AN|PM				: 오전,오후
 MI					:분
 SS					:초

SELECT 	TO_CHAR(SYSDATE , 'PM HH24:MI') FROM DUAL;
SELECT 	EMP_NAME AS 이름 , 
		TO_CHAR(HIRE_DATE,'YYYY"년" MM"월" DD"일"') AS 입사일
FROM  	EMPLOYEE
WHERE	JOB_ID = 'J7';


--주요단일행함수 -데이터타입 변화 함수 TO_DATE

SELECT TO_DATE('20100101','YYYYMMDD') FROM DUAL;
SELECT TO_CHAR('20100101','YYYY,MON') FROM DUAL;
SELECT TO_CHAR(TO_DATE('20100101','YYYYMMDD'),'YYYY,MON') FROM DUAL;
SELECT TO_DATE('041030 143000','YYMMDD HH24MISS') FROM DUAL;
SELECT TO_CHAR(TO_DATE('041030 143000','YYMMDD HH24MISS'), 'DD-MON-YY HH:MI:SS PM') FROM DUAL;
SELECT TO_DATE('980630','YYMMDD') FROM DUAL;
SELECT TO_CHAR(TO_DATE('980630','RRMMDD'),'YYYY.MM.DD') FROM DUAL;

RR 날짜형식 :세기문제x 

--주요단일행함수 -데이터타입 변화 함수 TO_NUMBER
주민등록번호

SELECT 	EMP_NAME, EMP_NO,
		SUBSTR(EMP_NO,1,6) AS 앞부분,
		SUBSTR(EMP_NO,8) AS 뒷부분,
		SUBSTR(EMP_NO,1,6) +  SUBSTR(EMP_NO,8) AS 결과
FROM EMPLOYEE
WHERE EMP_ID = '101';


--주요단일행함수 -기타함수 NVL
SELECT EMP_NAME , SALARY , NVL(BONUS_PCT,0)
FROM EMPLOYEE
WHERE SALARY > 3500000;                              

--주요단일행함수 -기타함수 DECODE 

SELECT 	EMP_NAME,
		DECODE(SUBSTR(EMP_NO,8,1),
		'1','남','2','여','3','남','4','여') AS 성별
FROM 	EMPLOYEE
WHERE	DEPT_ID = '50';

--부서별 사원의 인상급여를 확인
-- 10번부서 인상률은 10% 20번은 15% 30=> 20 나머지는 x 

SELECT 	EMP_NAME , 
		DEPT_ID , 
		SALARY , 
		DECODE(DEPT_ID,
		'10',SALARY*1.1,
		'20',SALARY*1.15,
		'30',SALARY*1.2,
		SALARY)AS 인상급여
FROM EMPLOYEE;

 if else 나머지는 DEFAULT 해준다.

--주요단일행함수 -기타함수 CASE
CASE expr [WHEN search1 THEN result1][ELSE default] END

SELECT 	EMP_NAME,
		SALARY,
		CASE
		WHEN SALARY <='3000000' THEN '초급'
		WHEN SALARY <='4500000' THEN '중급'
		ELSE '고급' 
		END AS 급여클라스
FROM EMPLOYEE
ORDER BY SALARY DESC , 2 DESC; 

DESC|ASC




























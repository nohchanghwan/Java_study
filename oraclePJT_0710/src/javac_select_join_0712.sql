
--0712
--�ֿ�׷��Լ�

[SUM]

SELECT 	SUM(SALARY),SUM(DISTINCT SALARY)
FROM 	EMPLOYEE
WHERE 	DEPT_ID = '50' OR DEPT_ID IS NULL;


[AVG]

SELECT 	AVG(BONUS_PCT) AS �⺻���,
		AVG(DISTINCT BONUS_PCT) AS �ߺ��������,
		AVG(NVL(BONUS_PCT,0)) AS NULL�������
FROM 	EMPLOYEE
WHERE	DEPT_ID IN ('50','90') OR DEPT_ID IS NULL;


[COUNT]

SELECT  COUNT(BONUS_PCT)
FROM 	EMPLOYEE;


[MIN MAX]

SELECT 	MIN(SALARY), MAX(SALARY)
FROM	EMPLOYEE;


[GROUP BY] ~��(�׷����´�) 

�μ��� �޿����
SELECT 	DEPT_ID AS �μ�,
		ROUND(AVG(SALARY),-4)AS ��ձ޿�
FROM 	EMPLOYEE
GROUP BY DEPT_ID
ORDER BY 1;

SELECT 	DECODE(SUBSTR(EMP_NO,8,1),'1','��','3','��','��') AS ����,
		ROUND(AVG(SALARY),-4) AS ��ձ޿�
FROM 	EMPLOYEE
GROUP BY DECODE(SUBSTR(EMP_NO,8,1),'1','��','3','��','��')
ORDER BY 2;


GROUP BY �� ������ �÷��� SELECT �� ���� , �ȳ��°� �Ұ�
BUT �׷��Լ��°����ϴ�.


SELECT  EMP_NAME , DEPT_ID , COUNT(*)
FROM	EMPLOYEE
GROUP BY DEPT_ID;
�̰� ����������.

SELECT	EMP_NAME, DEPT_ID,COUNT(*)
FROM 	EMPLOYEE
GROUP BY ROLLUP(EMP_NAME,DEPT_ID);
�̰� ������ �̸������� (�̸��̴ٴ޶�) Ƽ�������ʴ´�.  
��Ī������.

GROUP BY �� ������ WHERE �� �ƴ� HAVING ���� �����.


[HAVING]

�μ��� �޿������� ��� ������� 9000000 �̻��ΰ�츸 ����
SELECT	DEPT_ID , SUM(SALARY)
FROM	EMPLOYEE
GROUP BY DEPT_ID
HAVING	SUM(SALARY) > 9000000;

������ WHERE���ϸ� ����������
SELECT 	DEPT_ID , SUM(SALARY)
FROM	EMPLOYEE
WHERE	SUM(SALARY) > 9000000
GROUP BY DEPT_ID;

--9

SELECT ROUND(AVG(POINT),1) AS ���� 
FROM TB_GRADE
WHERE  STUDENT_NO = 'A517178';


--10

SELECT 	DEPARTMENT_NO AS �а���ȣ , COUNT(*) AS "�л���(��)"
FROM	TB_STUDENT
GROUP BY DEPARTMENT_NO
ORDER BY 1;



[JOIN]

���� �����ǰ� �ٸ����̺��� �����ϴ� �÷����� �ѹ��� ��ȸ�ϱ� ���� ���Ǵ� 
��ǥ���� ���


1. USING �� ON �� ���̴� ������ �÷����ϰ�� USING (�θ��� �ܷ�Ű�� �ڽ��� �⺻Ű�̸��� ������)
   �������� �ʾƼ� ���ǽ��� �ް�� ON ���.
2. GROUP BY ���� �����Ȱ͸� SELECT �������ǵɼ��ִ�.


 -- EQU-JOIN
SELECT 	EMP_NAME , DEPT_NAME
FROM 	EMPLOYEE E,
		DEPARTMENT D
WHERE	E.DEPT_ID = D.DEPT_ID;

 -- NON-EQU-JOIN
SELECT 	EMP_NAME, SALARY , SLEVEL AS �޿����
FROM 	EMPLOYEE E , SAL_GRADE s
WHERE	SALARY BETWEEN LOWEST AND HIGHEST;

SELECT 	EMP_NAME,DEPT_NAME, LOC_DESCRIBE,COUNTRY_NAME,SLEVEL
FROM 	EMPLOYEE
JOIN	DEPARTMENT USING(DEPT_ID)
JOIN	LOCATION 	ON(LOCATION_ID = LOC_ID)
JOIN 	COUNTRY		USING(COUNTRY_ID)
JOIN	SAL_GRADE	ON(SALARY BETWEEN LOWEST AND HIGHEST);


 --OUTER ���� (��籸����~)
 
SELECT 	EMP_NAME , DEPT_NAME
FROM 	EMPLOYEE
LEFT	JOIN DEPARTMENT USING (DEPT_ID)
ORDER	BY 1;


 --SELF ����
1. �����̺��� �ι����� / ���̺� ��Ī�� ����ؾ���

SELECT 	E.EMP_NAME AS ����,
		M.EMP_NAME AS ������,
		S.EMP_NAME AS ���۹�����		
FROM	EMPLOYEE E

JOIN	EMPLOYEE M ON(E.MGR_ID = M.EMP_ID)
JOIN	EMPLOYEE S ON(M.MGR_ID = S.EMP_ID)
ORDER BY 1;





--��������
���ް��� ���޸���

SELECT *
FROM EMPLOYEE
WHERE JOB_ID = ( 	SELECT JOB_ID
					FROM	EMPLOYEE
					WHERE 	EMP_NAME='���¿�' 
				)
AND	SALARY > (		SELECT SALARY
					FROM	EMPLOYEE
					WHERE 	EMP_NAME='���¿�' 
				);
				

�޿��� �������� ȸ���ã�� (������ ��������)
SELECT 	*
FROM	EMPLOYEE
WHERE	SALARY = (	SELECT MIN(SALARY)
					FROM EMPLOYEE
				 );



--HAVING ������ ��������
���� ���� ������ �޴� ~
				 
SELECT 	DEPT_NAME,
		SUM(SALARY)
FROM	EMPLOYEE
LEFT  JOIN DEPARTMENT USING(DEPT_ID)
GROUP BY DEPT_ID, DEPT_NAME
HAVING 	SUM(SALARY) = (SELECT MAX(SUM(SALARY))
					  FROM	EMPLOYEE
					  GROUP BY DEPT_ID);
 

�ִ�� �ּ� ������ ���� ���ϴ�  ANY
�ִ뺸�� ũ�� �ּҺ����۴�	    

<ANY  : �񱳴���� �ִ뺸���۴� 
>ANY  :	�񱳴���� �ּҺ���ũ��			  
=<ANY : 				  



�������޺��� �޿��� ���� �븮���� ��ȸ

SELECT 	EMP_NAME,SALARY,JOB_TITLE
FROM	EMPLOYEE
JOIN	JOB USING (JOB_ID)
WHERE	JOB_TITLE = '�븮'
AND		SALARY > ANY
				(	SELECT  SALARY
					FROM	EMPLOYEE
					JOIN	JOB USING(JOB_ID)
					WHERE	JOB_TITLE ='����');
					
					
--������������****************************************************					

1. ���޺� ��ձ޿�

SELECT	JOB_TITLE,TRUNC(AVG(SALARY),-5)
FROM	EMPLOYEE
JOIN	JOB USING(JOB_ID)
GROUP BY	JOB_ID, JOB_TITLE ;
					
2. ������� ����̸� �����̸� �޿�
SELECT EMP_NAME,JOB_TITLE,SALARY
FROM	EMPLOYEE
JOIN	JOB USING	(JOB_ID)

3. ��������

SELECT EMP_NAME,JOB_TITLE,SALARY
FROM	EMPLOYEE
JOIN	JOB USING (JOB_ID)
WHERE	(JOB_ID,SALARY) IN (	SELECT	JOB_ID,TRUNC(AVG(SALARY),-5)
					FROM	EMPLOYEE
					GROUP BY	JOB_ID );
					
-> ���ް�����ŭ�� ���̳��´�					
-> ����� ��ձ޿��¸����� �ش��޿� �´� �޿����޴»���� ������ X
-> ����� ������������ ������ ��ձ޿��� �����Ѵ�.
-> ID�� ���� ���Ͻ��Ѽ� ���߿� ���������� ����
-> ���� ������������ JOB_ID�� �߰��ؼ� �����̵ǰԲ� 2:2 �θ��� ������
-> ���ް� �ݾ��� �°� ��������´�.

IN�� �̿��ؼ� �ϳ��ϳ��� ���ؼ� ���� �����Ҽ��ִ�.


--������������2 FROM���� �������� = INLINE��*************************************					
���������� FROM���� ���� ��������̺��� ���ܼ� ���� ���̺�ó�� �����Ҽ��ִ�.

SELECT	EMP_NAME,
		JOB_TITLE,
		SALARY		
FROM	(SELECT JOB_ID,
				TRUNC(AVG(SALARY),-5) AS JOBAVG
		 FROM	EMPLOYEE
		 GROUP BY JOB_ID) V
JOIN	EMPLOYEE E ON 
		(JOBAVG = SALARY AND NVL(E.JOB_ID,' ') = NVL(V.JOB_ID,' '))
LEFT	JOIN JOB J ON (E.JOB_ID = J.JOB_ID)
ORDER BY E.JOB_ID;



--������輭������

SELECT	EMP_NAME,
		JOB_TITLE,
		SALARY
FROM	EMPLOYEE E
LEFT JOIN JOB J ON (E.JOB_ID = J.JOB_ID)
WHERE	SALARY = (SELECT TRUNC(AVG(SALARY),-5)
				  FROM	EMPLOYEE
				  WHERE	NVL(JOB_ID,' ') = NVL(E.JOB_ID,' '))

ORDER BY	E.JOB_ID;












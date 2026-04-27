show tables;

select * from jobs;

select * from emp;

desc emp;

select empno, ename, job from emp;

desc dept;

select deptno, dname, loc from dept;

select * from emp;
select * from dept;

select version() ;
select current_date;
select 3+3; select version();
select
deptno, dname
from
dept;

desc emp;

select * from emp;
select distinct job from emp;
select ename, sal * 18 "연 봉" from emp;

select * from emp
where sal > 2000;
select * from emp where job= 'MANAGER';
desc employees;
select * from emp where job= 'MANAGER' order by sal desc;

show tables;

SELECT CONCAT(employee_id,'사원의 이름은',first_name,' ',last_name,' 입니다.') AS full_name
FROM employees;
-- employees 테이블에서 직원의 이름(first_name), 성(last_name)을 조회하세요.
SELECT 
  first_name, 
  last_name 
FROM employees;

-- departments 테이블에서 모든 부서의 이름(department_name)과 위치 ID(location_id)를 조회하세요.
SELECT 
  department_name, 
  location_id 
FROM departments;

-- jobs 테이블에서 직업 ID(job_id)와 직업 타이틀(job_title)을 조회하세요.
SELECT 
  job_id, 
  job_title 
FROM jobs; 

-- locations 테이블에서 각 위치의 주소(street_address)와 우편번호(postal_code)를 조회하세요.
SELECT 
  street_address, 
  postal_code 
FROM locations; 

-- countries 테이블에서 국가 ID(country_id)와 국가 이름(country_name)을 조회하세요.
SELECT 
  country_id, 
  country_name 
FROM countries; 

-- regions 테이블에서 지역 ID(region_id)와 지역 이름(region_name)을 조회하세요.
SELECT 
  region_id, 
  region_name 
FROM regions; 

-- employees 테이블에서 모든 직원의 직업 ID(job_id)를 조회하세요.
SELECT job_id 
FROM employees; 

-- departments 테이블에서 부서 ID(department_id)별로 부서 이름(department_name)을 조회하세요.
SELECT 
  department_id, 
  department_name 
FROM departments; 

-- job_history 테이블에서 직원 ID(employee_id)와 부서 ID(department_id)를 조회하세요.
SELECT 
  employee_id, 
  department_id 
FROM job_history; 

-- employees 테이블에서 직원 ID(employee_id), 이름(first_name)과 성(last_name)을 조회하세요.
SELECT 
  employee_id, 
  first_name, 
  last_name 
FROM employees;

-- employees 테이블에서 급여(salary)가 10000 이상인 직원의 이름과 급여를 조회하세요.
SELECT first_name, last_name , salary FROM employees WHERE salary > 10000;

-- departments 테이블에서 위치 ID(location_id)가 1700인 부서의 이름을 조회하세요.
SELECT department_name FROM departments WHERE location_id = 1700;

-- employees 테이블에서 직업 ID(job_id)가 'IT_PROG'인 직원들의 전체 정보를 조회하세요.
Select * FROM employees WHERE job_id = 'IT_PTOG';

-- employees 테이블에서 부서 ID(department_id)가 90인 직원들의 이름과 급여를 조회하세요.
SELECT first_name, last_name, salary FROM employees WHERE department_id = 90;

-- jobs 테이블에서 최소 급여(min_salary)가 5000 이상인 직업의 타이틀을 조회하세요.
SELECT job_title FROM jobs WHERE min_salary > 5000 order by job_title;

-- employees 테이블에서 성(last_name)이 'King'인 직원의 전체 정보를 조회하세요.
SELECT 	last_name FROM employees WHERE 	last_name = 'king';

-- locations 테이블에서 국가 ID(country_id)가 'US'인 위치의 상세 정보를 조회하세요.
Select * From locations WHERE country_id = 'US';

-- job_history 테이블에서 시작 날짜(start_date)가 '2001-01-01' 이전인 기록을 조회하세요.
Select * From job_history WHERE start_date < '2001-01-01';

-- employees 테이블에서 성(last_name)에 'a'가 포함되는 직원들의 이름과 이메일을 조회하세요.
Select first_name, last_name, email From employees WHERE last_name like '%a%' order by first_name;

-- departments 테이블에서 부서 이름(department_name)이 'Sales'인 부서의 모든 직원 정보를 조회하세요.
Select * From employees WHERE department_id = (Select department_id From departments where department_name = 'sales');

Select first_name, email From employees;

Select * From employees WHERE salary >= 15000;

Select * From employees WHERE hire_date BETWEEN '2005-01-01' and '2025-12-31';

Select * From employees WHERE first_name like '%an%';

Select * From employees WHERE email like 'S%' order by salary;

Select department_id,  COUNT(*) AS emp_count,
    ROUND(AVG(salary), 2) AS avg_salary From employees group by department_id order by department_id;

Select department_id, count(*) as emp_count From employees group by department_id HAVING Count(*) >= 5 order by count(*) desc;

insert into emp values( 7934, 'MILLER', 'CLERK', 7782, STR_TO_DATE('23-1-1982','%d-%m-%Y'), 1300, null, 10);


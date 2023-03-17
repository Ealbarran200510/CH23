-- USE business; para comenzar a usar la tabla

-- Revisar tabla employee

SELECT * FROM employee;

-- Alias cambia el resultado de la tabla, pero no modifica nada de su contenido

SELECT last_name AS "Apellido" FROM employee;

SELECT
	employee_id AS "ID",
    first_name AS "Nombre",
    last_name AS "Apellido",
    department AS "Departamento"
FROM employee;

-- Filtrar por nombre

SELECT * FROM employee
WHERE first_name = "Monika";

-- Filtrar doble

SELECT * FROM employee
WHERE salary = "500000" AND first_name = "Vivek";

-- Filtrar por NOT

SELECT * FROM employee
WHERE NOT first_name = "Vivek";

-- Filtrar por doble NOT

SELECT * FROM employee
WHERE NOT first_name = "Santiago" AND NOT first_name = "IAN";

-- Ordenamiento
-- Order By

-- Ascendente

SELECT * FROM employee
ORDER BY department;

-- Descendente

SELECT * FROM employee
ORDER BY department DESC;

-- Ordenamiento doble

SELECT * FROM employee
ORDER BY department ASC, last_name DESC;

-- Group By

SELECT * FROM employee
GROUP BY department;

-- In

SELECT * FROM employee
WHERE employee_id IN (1, 3, 7, 8, 5);

-- Between

SELECT * FROM employee
WHERE salary BETWEEN 200000 AND 500000;

-- Between Not

SELECT * FROM employee
WHERE salary NOT BETWEEN 200000 AND 500000;

-- LIMIT

SELECT * FROM employee
LIMIT 3;

-- LIMIT + OFFSET

SELECT * FROM employee
LIMIT 3 OFFSET 3;

-- Like

SELECT * FROM employee
WHERE last_name LIKE "%A";

-- Sensitive

SELECT * FROM employee
WHERE last_name LIKE BINARY "%a";

-- Like ++

SELECT * FROM employee
WHERE join_date LIKE "%02%";

-- Actualizar dato

UPDATE employee
	SET salary = 300000
WHERE employee_id = 5;

SELECT * FROM employee
ORDER BY last_name ASC;

-- Min

SELECT MIN(salary) FROM employee;
SELECT MIN(last_name) FROM employee;

-- Max

SELECT MAX(salary) FROM employee;

-- Average

SELECT AVG(salary) FROM employee;
SELECT AVG(join_date) FROM employee;

-- Sum

SELECT SUM(employee_id) FROM employee;
SELECT SUM(salary), SUM(employee_id) FROM employee;

-- Count

SELECT COUNT(employee_id) FROM employee;
SELECT COUNT(salary) FROM employee;

SELECT * FROM employee;
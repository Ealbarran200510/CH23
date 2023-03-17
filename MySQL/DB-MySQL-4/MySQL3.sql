-- INNER JOIN
-- Encontrar a que pais pertenecen
SELECT
    students.*,
    countries.name,
    countries.code
FROM students
INNER JOIN countries
ON students.nationality = countries.idCountries;

-- INNER JOIN sencillo
SELECT students.name, 
students.last_name,countries.Name AS "country", 
countries.Code  
FROM students
INNER JOIN countries 
ON countries.idCountries = students.nationality;

-- Encontrar que tipo de ID tienen

SELECT
students.idStudent AS "ID",
students.name AS  "Name",
students.last_name AS "Last name",
idtypes.name AS 'Tipo de registro'
FROM students
INNER JOIN idtypes
ON idtypes.id_idTypes = students.IdType_id;

SELECT 
    students.name,
    countries.name,
    countries.code
FROM
students
INNER JOIN countries 
ON students.nationality = countries.idCountries;

-- Abreviaciones
SELECT 
    t1.name,
    t2.name,
    t2.code
FROM students t1
INNER JOIN countries t2
ON t1.nationality = t2.idCountries;

SELECT * FROM students;
SELECT * FROM countries;
SELECT * FROM idtypes;
SELECT * FROM courses_has_students;
SELECT * FROM courses;
SELECT * FROM modules;
-- Estudiantes que esten registrades en un curso.
-- Nombre, id, apellido, curso al que estan registrades

-- Buscar estudiantes y el curso al que pertenecen
SELECT 
    t1.name AS 'Nombre',
    t1.last_name AS 'Apellido',
    t2.course_code AS 'Codigo de curso',
    t3.name AS 'Curso',
    t3.credits
FROM students t1
INNER JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
INNER JOIN courses t3
ON t2.course_code = t3.code;

SELECT 
	t1.course_code AS 'Codigo de curso',
	t2.code AS 'Codigo de curso',
	t2.name AS 'Curso'
FROM courses_has_students t1
INNER JOIN courses t2
ON t1.course_code = t2.code
GROUP BY t2.code;

-- Encontrar estudiantes que sean del pais 125

SELECT 
	countries.name "País",
    countries.idCountries AS "Código del país",
    students.name AS "Nombre",
    students.last_name AS "Apellido"
FROM students
INNER JOIN countries ON students.nacionality = countries.idCountries
WHERE countries.idCountries = "125";

 -- Contar estudiantes que pertenezcan al curso JAVA-1
 
 SELECT * FROM Courses_has_Students;
 SELECT
	Courses_has_Students.course_code AS "Código del curso",
    Students.idStudent AS "ID del estudiante",
    Students.name AS "Nombre del estudiante",
    Students.last_name AS "Apellido del estudiante"
FROM Students
INNER JOIN Courses_has_Students 
ON Students.idStudent = Courses_has_Students.student_id_student
WHERE Courses_has_Students.course_code = "JAVA-1";

SELECT COUNT(*) AS 'Estudiantes JAVA 1'
FROM students
INNER JOIN courses_has_students
ON  students.idStudent = courses_has_students.students_id_student
WHERE courses_has_students.course_code = "JAVA-1";

-- Contar estudiantes por cada modulo

SELECT modules.name AS 'Nombre Modulo', COUNT(*) AS 'Total Estudiantes'
FROM modules
INNER JOIN courses ON modules.code = courses.module_code
INNER JOIN courses_has_students ON courses.code = courses_has_students.course_code
GROUP BY modules.name;


-- JOIN  Students - courses-h-students
-- JOIN courses-h-s courses
-- JOIN courses - modules
-- Contar estudiantes
-- Agrupar por modules

SELECT 
t4.name AS "Nombre del módulo", 
count(t1.idStudent) AS "Numero de estudiantes"
FROM students t1
JOIN courses_has_students t2
ON t1.idStudent = t2.students_id_student
JOIN courses t3
ON t2.course_code = t3.code
JOIN modules t4
ON t3.module_code = t4.code
GROUP BY t4.code
ORDER BY count(t1.idStudent);


 -- Encontrar estudiantes SIN curso

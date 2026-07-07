INSERT INTO department(name)
VALUES
('IT'),
('HR'),
('Finance');

INSERT INTO skill(skill_name)
VALUES
('Java'),
('Spring Boot'),
('SQL'),
('React');

INSERT INTO employee(name,salary,department_id)
VALUES
('Rahul',50000,1),
('Amit',60000,1),
('Sneha',55000,2),
('Priya',70000,3);

INSERT INTO employee_skill(employee_id,skill_id)
VALUES
(1,1),
(1,2),
(2,2),
(2,3),
(3,3),
(4,4);
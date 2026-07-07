
INSERT INTO department(name)
VALUES ('IT'),
       ('HR'),
       ('Finance');

INSERT INTO skill(name)
VALUES ('Java'),
       ('Spring Boot'),
       ('SQL'),
       ('React');

INSERT INTO employee(name, department_id)
VALUES ('Rahul',1),
       ('Priya',2),
       ('Amit',1),
       ('Sneha',3);

INSERT INTO employee_skill(employee_id, skill_id)
VALUES
(1,1),
(1,2),
(1,3),
(2,3),
(3,1),
(3,2),
(3,4),
(4,3);
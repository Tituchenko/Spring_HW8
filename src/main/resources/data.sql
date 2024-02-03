INSERT INTO users_my (user_name,password,email,role) VALUES
('Vasya','12345','1@mail.ru','user'),
('Петя','12345','1@mail.ru','пользователь'),
('Коля','12345','1@mail.ru','пользователь'),
('Дима','12345','1@mail.ru','пользователь'),
('Оксана','12345','1@mail.ru','пользователь');

INSERT INTO projects (name,description,created_date) VALUES
('project 1','project first',CURRENT_DATE()),
('project 2','project second',CURRENT_DATE());

INSERT INTO user_project (project_id,user_id) VALUES
(1,1),
(1,2),
(1,3),
(2,4),
(2,5);

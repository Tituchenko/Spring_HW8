create table tasks (
                         id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                         description VARCHAR(50) NOT NULL,
                         status VARCHAR(50) NOT NULL,
                         createDate DATE
);

create table users_my (
                         id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                         user_name VARCHAR(50),
                         password VARCHAR(50),
                         email VARCHAR(50),
                         role VARCHAR(50)
);

create table projects (
                         id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                         name VARCHAR(50),
                         description varchar(50),
                         created_date DATE
);

create table user_project (
                         id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                         project_id INT NOT NULL,
                         user_id INT NOT NULL
);


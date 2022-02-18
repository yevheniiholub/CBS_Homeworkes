drop database MyJoinsDB;

-- Задание 2
-- Создайте базу данных с именем “MyJoinsDB”.
create database MyJoinsDB;

use MyJoinsDB;

-- Задание 3
-- В данной базе данных создайте 3 таблицы,

-- В 1-й таблице содержатся имена и номера телефонов сотрудников компании.
create table employeeContactInfo
(
	id int auto_increment not null primary key,
    name varchar(20),
    phone varchar(11)
);

-- Во 2-й таблице содержатся ведомости о зарплате и должностях сотрудников: главный директор,
-- менеджер, рабочий.
create table emloyeeProfInfo
(
	id int auto_increment not null primary key,
    employee_id int,
    salary int,
    foreign key (employee_id) references employeeContactInfo(id),
    position varchar(30)
);

-- В 3-й таблице содержится информация о семейном положении, дате рождения, и месте проживания.
create table employeePresonalInfo
(
	id int auto_increment not null primary key,
    employee_id int,
    foreign key (employee_id) references employeeContactInfo(id),
    maried bool,
    birthdate date,
    city varchar(30)
);

insert employeeContactInfo
(name, phone)
values
('Іванов А.А', '38800553535'),
('Антонов А.І', '38800553536'),
('Федоров В.Г', '38800553537'),
('Данилюк Г.І', '38800553538'),
('Іващенко С.М', '38800553539'),
('Романов Р.Т', '38800553540'),
('Трофімов Г.І', '38800553541'),
('Ярмоленко Н.Г', '38800553542'),
('Петросян Г.Г', '38800553543');

insert emloyeeProfInfo
(employee_id, position, salary)
values
(1, 'Головний директор', 4000),
(2, 'Менеджер', 2000),
(3, 'Робочий', 1000),
(4, 'Головний директор', 4500),
(5, 'Менеджер', 2500),
(6, 'Робочий', 1200),
(7, 'Головний директор', 5000),
(8, 'Менеджер', 1800),
(9, 'Робочий', 1300);

insert employeePresonalInfo
(employee_id, maried, birthdate, city)
values
(1, false, '1986-02-26', 'Київ'),
(2, true, '1992-03-12', 'Львів'),
(3, false, '1998-11-02', 'Харків'),
(4, true, '1987-02-12', 'Київ'),
(5, true, '1994-08-01', 'Львів'),
(6, false, '2000-04-17', 'Харків'),
(7, true, '1984-06-18', 'Київ'),
(8, false, '1995-09-06', 'Львів'),
(9, false, '2001-04-12', 'Харків');


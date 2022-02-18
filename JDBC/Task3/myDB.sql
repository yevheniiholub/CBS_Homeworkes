drop database myDB;
create database myDB;

use myDB;

create table simpleTable
(
	id int auto_increment not null primary key,
    name varchar(30),
    age int,
    phone varchar(11)
);

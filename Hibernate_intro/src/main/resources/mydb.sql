create database mydb;

use mydb;

create table animal(
	id int auto_increment not null primary key,
    name varchar(30),
    tail bool
);

--liquibase formatted sql
--changeset admin:1

create table user_data (
    name varchar(255) not null,
    email varchar(255) not null unique,
    password varchar(255) not null,
    age int not null,
    user_Id int primary key auto_increment
)
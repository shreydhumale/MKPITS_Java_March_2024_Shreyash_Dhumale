create database online_book_store;

use online_book_store;

create table books(
	book_id int primary key,
    title varchar(20),
    isbn char,
    price int,
    publication_date date,
    author_id int
);

create table author(
	author_id int primary key,
    first_name varchar(10),
    last_name varchar(10)
);

create table customer(
	customer_id int primary key,
    first_name varchar(10),
    last_name varchar(10),
    email varchar(20),
    address varchar(40)
);

create table orders(
	order_id int primary key,
    customer_id int,
    order_date date
);

create table sales(
	sales_id int primary key,
    sales_date date,
    order_id int,
    book_id int
);


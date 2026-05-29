create schema test_schema;

create table nationalities
(
    id   int GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name varchar(255) not null
);

create table authors
(
    id             int GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name           varchar(255) not null,
    nationality_id int          not null references nationalities (id)
);

create table books
(
    id             int GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    title          varchar(255) not null,
    author_id      int          not null references authors (id),
    published_date date,
    genre          varchar(255)
);

insert into nationalities (name)
values ('American'),
       ('British'),
       ('French');

insert into authors (name, nationality_id)
values ('Mark Twain', 1),
       ('Jane Austen', 2),
       ('Victor Hugo', 3);

insert into books (title, author_id, published_date)
values ('The Adventures of Tom Sawyer', 1, '1876-06-01'),
       ('Pride and Prejudice', 2, '1813-01-28'),
       ('Les Misérables', 3, '1862-04-03');

select *
from books b
         join authors a on b.author_id = a.id;

select a.name, n.name
from authors a
         join nationalities n
              on a.nationality_id = n.id
         join books b on a.id = b.author_id
where a.id = 1;

drop table books;
drop table authors;
drop table nationalities cascade


CREATE schema movie_db;
CREATE schema movie_db_test;

CREATE TABLE movie_db.movies (
id int auto_increment primary key,
title varchar(100) not null,
genre varchar(100) not null
);

CREATE TABLE movie_db_test.movies (
id int auto_increment primary key,
title varchar(100) not null,
genre varchar(100) not null
);



insert into movie_db.movies (title,genre) values ('the sixth sense','thriller');
insert into movie_db.movies (title,genre) values ('scary movie 6','comedy');
insert into movie_db.movies (title,genre) values ('the lord of the rings','fantasy');
insert into movie_db.movies (title,genre) values ('star wars','sci-fi');
insert into movie_db.movies (title,genre) values ('boob','drama');
insert into movie_db.movies (title,genre) values ('aka','thriller');

insert into movie_db_test.movies (title,genre) values ('the sixth sense','thriller');
insert into movie_db_test.movies (title,genre) values ('scary movie 6','comedy');
insert into movie_db_test.movies (title,genre) values ('the lord of the rings','fantasy');
insert into movie_db_test.movies (title,genre) values ('star wars','sci-fi');
insert into movie_db_test.movies (title,genre) values ('boob','drama');
insert into movie_db_test.movies (title,genre) values ('aka','thriller');



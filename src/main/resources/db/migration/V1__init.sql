DROP TABLE IF EXISTS users, roles, users_roles,pet_types, pet_genders, pets ;

create table users
(
    user_id       bigserial primary key,
    user_name     varchar(30) not null unique,
    user_password varchar(80) not null
);

create table roles
(
    user_role_id    bigserial primary key,
    user_role_title varchar(50) not null unique
);

CREATE TABLE users_roles
(
    user_id      bigint not null references users (user_id),
    user_role_id bigint not null references roles (user_role_id),
    primary key (user_id, user_role_id)
);

insert into roles (user_role_title)
values ('ROLE_USER'),
       ('ROLE_ADMIN');

insert into users (user_name, user_password)
values ('user', '$2y$12$4g1SOm4vGFSF/CbT84nOzOyygKSuTtRshecj7HYOCC1xUPjhkVPWG'),
       ('admin', '$2y$12$4g1SOm4vGFSF/CbT84nOzOyygKSuTtRshecj7HYOCC1xUPjhkVPWG');


insert into users_roles (user_id, user_role_id)
values (1, 1),
       (2, 2);

create table pet_types
(
    pet_type_id    bigserial primary key,
    pet_type_title varchar(255) not null unique
);

insert into pet_types (pet_type_title)
values ('Cat'),
       ('Dog'),
       ('Fish');

create table pet_genders
(
    pet_gender_id    bigserial primary key,
    pet_gender_title varchar(255) not null unique
);

insert into pet_genders (pet_gender_title)
values ('M'),
       ('F');

create table pets
(
    pet_id        bigserial primary key,
    pet_type_id   bigint references pet_types (pet_type_id),
    pet_birth_date     date,
    pet_gender_id bigint references pet_genders (pet_gender_id),
    pet_nickname  varchar(30) not null unique
);

insert
into pets (pet_type_id, pet_birth_date, pet_gender_id, pet_nickname)
values (1, '2020/03/02', 1, 'Tom'),
       (2, '2017/03/02', 1, 'Rex'),
       (3, '2022/03/02', 2, 'Dorry');



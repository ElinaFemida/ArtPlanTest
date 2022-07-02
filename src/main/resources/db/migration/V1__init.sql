create table users
(
    user_id       bigserial primary key,
    user_name     varchar(30) not null,
    user_password varchar(80) not null
);

create table pets
(
    pet_id        bigserial primary key,
    pet_nickname  varchar(30) not null,

);


insert into users (user_name, user_password, user_email, user_phone)
values ('Petya', '$2a$12$zCa/vu1142NwfLnRW..e0.wdnmxgnh7if6ROeVuCi62XR6N9db9eO', 'petya@google.com', 89851002121),
       ('Vasya', '$2a$12$zCa/vu1142NwfLnRW..e0.wdnmxgnh7if6ROeVuCi62XR6N9db9eO', 'vasya@google.com', 89851002122),
       ('Misha', '$2a$12$zCa/vu1142NwfLnRW..e0.wdnmxgnh7if6ROeVuCi62XR6N9db9eO', 'misha@google.com', 89851002123),
       ('Lesha', '$2a$12$zCa/vu1142NwfLnRW..e0.wdnmxgnh7if6ROeVuCi62XR6N9db9eO', 'lesha@google.com', 89851002124),
       ('Ksenya', '$2a$12$zCa/vu1142NwfLnRW..e0.wdnmxgnh7if6ROeVuCi62XR6N9db9eO', 'ksenya@google.com', 89851002125),
       ('Olya', '$2a$12$zCa/vu1142NwfLnRW..e0.wdnmxgnh7if6ROeVuCi62XR6N9db9eO', 'olya@google.com', 89851002126);






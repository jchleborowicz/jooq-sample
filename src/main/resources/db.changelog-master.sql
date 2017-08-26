--liquibase formatted sql
--changeset jch:001

create table system_user (
  id int not null,
  username varchar(32) not null,
  constraint pk_user primary key (id)
);

--changeset jch:002
INSERT INTO system_user (id, username) VALUES (1, 'johny');
INSERT INTO system_user (id, username) VALUES (2, 'jack');
INSERT INTO system_user (id, username) VALUES (3, 'jim');

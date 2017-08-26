--liquibase formatted sql
--changeset jch:001

create table system_user (
  id int not null,
  username varchar(32) not null,
  constraint pk_user primary key (id)
);

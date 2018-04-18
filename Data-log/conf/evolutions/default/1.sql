# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table data_sensor (
  id                        bigint auto_increment not null,
  value                     integer,
  jumlah                    integer,
  input                     integer,
  output                    integer,
  node                      varchar(255),
  tipe                      varchar(255),
  constraint pk_data_sensor primary key (id))
;

create table tipe (
  tipe                      varchar(255))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table data_sensor;

drop table tipe;

SET FOREIGN_KEY_CHECKS=1;


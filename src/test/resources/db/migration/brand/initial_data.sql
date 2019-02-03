create table brand (
  id integer not null auto_increment,
  name varchar(30) not null,
  designer varchar(30) not null,
  gender varchar(10) not null,
  primary key (id)
);

insert into brand (name, designer, gender) values ('ETHOSENS', '橋本 唯', 'MAN');
insert into brand (name, designer, gender) values ('STOF', '谷田 浩', 'UNISEX');
insert into brand (name, designer, gender) values ('bedsidedrama', '谷田 浩', 'UNISEX');

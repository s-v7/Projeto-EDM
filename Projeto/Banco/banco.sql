create database cliente;
use cliente;

create table cadastro(
  id int priamary key auto_increment,
  Cpf varchar(14) not null unique,
  Nome varchar(50) not null,
  Endereco varchar(70) not null,
  );
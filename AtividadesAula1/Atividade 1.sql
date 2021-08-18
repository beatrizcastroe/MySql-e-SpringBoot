create database db_rh;

use db_rh;

create table tb_funcionarios(
	id bigint auto_increment,
    nome varchar (30) not null,
    depart varchar (30) not null, 
    cargo varchar (30) not null, 
    salario decimal (10,2),
    primary key (id)
);


insert into tb_funcionarios (nome, depart, cargo, salario) values ("Beatriz Castro", "TI", "Supervisora", 4500.50);
insert into tb_funcionarios (nome, depart, cargo, salario) values ("Diego Geraldo", "Faxina", "Faxineiro", 500.00);
insert into tb_funcionarios (nome, depart, cargo, salario) values ("Malu Doguerson", "RH", "Consultora", 2000.00);
insert into tb_funcionarios (nome, depart, cargo, salario) values ("Fernanda Rossato", "Administrativo", "CEO", 20000.00);
insert into tb_funcionarios (nome, depart, cargo, salario) values ("Mário Jorge", "Financeiro", "Contador", 3675.49);

select * from tb_funcionaries where salario > 2000.00;
select * from tb_funcionaries where salario < 2000.00;

update tb_funcionarios set salario = 1200.00 where id = 2
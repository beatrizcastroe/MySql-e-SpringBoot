create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
	id bigint auto_increment,
    nome varchar (30) not null,
    marca varchar (30) not null, 
    preco decimal (10,2),
    primary key (id)
);

select * from tb_produtos;

insert into tb_produtos (nome, marca, preco) values ("Bicicleta", "Caloi", 980.00);
insert into tb_produtos (nome, marca, preco) values ("Bicicleta", "MTB", 239.90);
insert into tb_produtos (nome, marca, preco) values ("Patins", "Decatlon", 350.00);
insert into tb_produtos (nome, marca, preco) values ("Patinete", "Scooter", 768.90);
insert into tb_produtos (nome, marca, preco) values ("Bicicleta", "Poti", 550.00);
insert into tb_produtos (nome, marca, preco) values ("Patins", "Fit3", 249.99);
insert into tb_produtos (nome, marca, preco) values ("Patinete", "Oxello",678.98);
insert into tb_produtos (nome, marca, preco) values ("Bicicleta", "Marq", 499.99);

select * from tb_produtos where preco > 500.00;
select * from tb_produtos where preco < 500.00;

update tb_produtos set preco = 200.00 where id = 6;
select * from tb_produtos;

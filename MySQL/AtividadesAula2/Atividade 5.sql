create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria (
	id int primary key auto_increment,
    vendedor varchar (30),
    filial varchar (30),
	categoria varchar (30)
);

create table tb_produto (
	id int primary key auto_increment,
    nome varchar (30),
    preco decimal (10,2),
    tam varchar(30),
    cor varchar (30),
    qntd int,
    categoria_id int,
    foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_categoria (vendedor, filial, categoria) values 
("Marcelo", "São José II", "Ferramentas"),
("Diego", "São José II", "Materiais"),
("Felipe", "São José II", "Floricultura"),
("Marcela", "São José II", "Decoração"),
("Denise", "São José I", "Ferragens");
select * from tb_categoria;

insert into tb_produto (nome, preco, tam, cor, qntd, categoria_id) values
("Cavalete", 55.00, "Médio", "Prata", 5, 5),
("Alicate", 30.00, "Médio", "Laranja", 1, 1),
("Martelo", 29.99, "Médio", "Marrom", 1, 1),
("Vaso de flor", 79.90, "Grande", "Marrom", 1, 3),
("Quadro", 150.99, "Grande", "Colorido", 1, 4),
("Tijolo", 3.50, "Pequeno", "Marrom", 1, 2),
("Fita métrica", 25.99, "Médio", "Azul", 1, 1),
("Cimento", 20.00, "Grande", "Cimento", 1, 2);

select * from tb_produto where preco > 50.0;
select * from tb_produto where preco > 3 and preco < 60;
select * from tb_produto where nome like "C%";

select * from tb_produto
    inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;
select * from tb_produto
    inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
	where categoria like "%Materiais%";




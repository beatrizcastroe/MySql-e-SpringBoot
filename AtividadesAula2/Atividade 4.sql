create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria(
	id int primary key auto_increment,
    tipo varchar (30),
    armazenamento varchar (30), 
    temp varchar (30)
);

create table tb_produtos(
	id int primary key auto_increment,
    nome varchar (30),
    preco decimal (6,2),
	kg decimal (6,2),
    tam varchar (30),
    categoria_id int,
    foreign key (categoria_id) references tb_categoria (id)
);

 insert into tb_categoria (tipo, armazenamento, temp) values
 ("Fruta", "Sacola", "Ambiente"),
 ("Legume", "Plastico", "Baixa"),
 ("Verdura", "Sacola", "Baixa com umidade"),
 ("Tempero", "Pote", "Ambiente"),
 ("Fruta Desidratada", "Saco de Papel", "Ambiente");
 
 insert into tb_produtos (nome, preco, kg, tam, categoria_id) values 
 ("Maçã", 10.00, 1, "grande", 1),
 ("Couve", 25.00, 1, "médio", 3),
 ("Abobrinha", 55.00, 3, "grande", 2),
 ("Uva Passa", 60.00, 4, "pequeno", 5),
 ("Orégano", 49.90, 5, "pequeno", 4),
 ("Tâmara Passada", 103.99, 2, "pequeno", 5),
 ("Banana", 15.99, 2, "médio", 1),
 ("Cominho", 10.00, 1, "pequeno", 4);
 
 select * from tb_produtos where preco > 50.00;
 select * from tb_produtos where preco > 3 and preco < 60;
 select * from tb_produtos where nome like "C%";
 
 select * from tb_produtos
    inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;
select * from tb_produtos
    inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id
	where tipo like "%Legume%";
 

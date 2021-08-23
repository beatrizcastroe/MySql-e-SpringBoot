create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe (
	id int primary key auto_increment,
    classe varchar (50),
	habilidade varchar (50)
);

create table tb_personagens(
	id int primary key auto_increment,
    nome varchar (30) not null, 
    nivel bigint (4),
    ataque int (10),
    defesa int (10),
    classe_id int not null,
	foreign key(classe_id) references tb_classe (id)
);

insert into tb_classe (classe, habilidade) values ("Arqueiro", "Força");
insert into tb_classe (classe, habilidade) values ("Elfo", "Sabedoria");
insert into tb_classe (classe, habilidade) values ("Mago", "Sabedoria");
insert into tb_classe (classe, habilidade) values ("Guerreiro", "Força");
insert into tb_classe (classe, habilidade) values ("Elfo", "Sabedoria");

insert into tb_personagens (nome, nivel, ataque, defesa, classe_id) values 
		("Celeste", 75, 2050, 1000, 1),
        ("Orc", 32, 1000, 2000, 2),
		("Arcano", 80, 3000, 1080, 1),
		("Luz", 43, 2500, 1000, 4),
        ("Fogo", 57, 1000, 3000, 5),
        ("Mística", 89, 1000, 3500, 2),
        ("Snake", 90, 2000, 2000, 4),
        ("Trovão", 67, 1800, 3500, 3);
        
select * from tb_personagens where ataque > 2000;
select * from tb_personagens where defesa > 1000 and defesa < 2000;
select * from tb_personagens where nome like "%C%";

select * from tb_personagens
    inner join tb_classe on tb_classe.id = tb_personagens.classe_id;

select * from tb_classe
    inner join tb_personagens on tb_classe.id = tb_personagens.classe_id 
    where classe like "%Arqueiro%";
	


drop database db_escola;

use db_escola;

create table tb_estudantes (
	id bigint auto_increment,
    nome varchar (30) not null,
    serie varchar (30) not null,
    periodo varchar (30) not null,
    nota decimal (5,2),
    primary key (id)
);

select * from tb_estudantes;

insert into tb_estudantes (nome, serie, periodo, nota) values ("Amanda Man", "3 série", "manhã", 7.0);
insert into tb_estudantes (nome, serie, periodo, nota) values ("Beatriz Bea", "1 série", "integral", 10.0);
insert into tb_estudantes (nome, serie, periodo, nota) values ("Caio Can", "2 série", "manhã", 8.0);
insert into tb_estudantes (nome, serie, periodo, nota) values ("Danilo Dan", "3 série", "tarde", 4.5);
insert into tb_estudantes (nome, serie, periodo, nota) values ("Eduardo Ed", "1 série", "manhã", 3.0);
insert into tb_estudantes (nome, serie, periodo, nota) values ("Felipe Fer", "2 série", "integral", 9.0);
insert into tb_estudantes (nome, serie, periodo, nota) values ("Gustavo Gus", "2 série", "manhã", 2.0);
insert into tb_estudantes (nome, serie, periodo, nota) values ("Henrique Rike", "3 série", "integral", 7.5);

select * from tb_estudantes where nota > 7.0;
select * from tb_estudantes where nota < 7.0;

update tb_estudantes set nota = 10.0 where id = 7;

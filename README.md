# java-Academia-Capgemini-Proway



# Script SQL da tabela Dog:

create table dog (id serial primary key, nome varchar (50), raca varchar (20), idade varchar (20)) 

select * from dog

select * from dog where id = 1


insert into dog(nome, raca, idade) values('Bolinha', 'pinscher', '10 meses')
insert into dog(nome, raca, idade) values('Florzinha', 'shih tzu', '20 meses')
insert into dog(nome, raca, idade) values('Bob', 'srd', '18 meses')

update dog set nome = 'Thor', raca = 'Labrador', idade = '35 meses' where id = 4

delete from dog where id = 5

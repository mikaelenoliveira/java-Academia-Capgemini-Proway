-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE cliente (
idcliente serial PRIMARY KEY,
razaosocial varchar(40),
cpf varchar(14)
);

CREATE TABLE categoria (
idcategoria serial PRIMARY KEY,
descricao varchar(40)
);

CREATE TABLE produto (
idproduto serial PRIMARY KEY,
idcategoria int,
descricao varchar(40),
preco float,
estoque float,
FOREIGN KEY(idcategoria) REFERENCES categoria (idcategoria)
);

CREATE TABLE carrinho (
idproduto int,
idvenda int,
quantidade float,
preco float,
FOREIGN KEY(idproduto) REFERENCES produto (idproduto)
);

CREATE TABLE venda (
idvenda serial PRIMARY KEY,
idcliente int,
FOREIGN KEY(idcliente) REFERENCES cliente (idcliente)
);

ALTER TABLE carrinho ADD FOREIGN KEY(idvenda) REFERENCES venda (idvenda);

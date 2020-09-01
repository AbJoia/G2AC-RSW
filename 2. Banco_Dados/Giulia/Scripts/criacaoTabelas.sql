create table endereco(
id_endereco serial primary key not null,
rua varchar(40) not null,
numero varchar(15) not null,
bairro varchar(30) not null,
cidade varchar(40) not null,
estado char(2) not null,
cep char(9) not null);

create table usuario(
id_usuario serial primary key not null,
nome varchar not null,
cpf char(11) unique not null,
email varchar unique not null,
nome_usuario varchar(15) unique not null,
data_nascimento date not null,
id_endereco integer,
foreign key(id_endereco) references endereco);

create table contato(
id_contato serial primary key not null,
ddd char(2) not null,
fixo char(8) unique,
movel char(9) unique,
id_usuario integer,
foreign key(id_usuario) references usuario);

create table produto(
id_produto serial primary key not null,
data_fabricacao date not null,
valor_unidade real not null,
quantidade_estoque integer not null,
descricao varchar(150),
nome varchar(30) not null,
id_usuario integer,
foreign key(id_usuario) references usuario);

create table categoria(
id_categoria serial primary key not null,
nome varchar(30) not null,
descricao varchar(50),
id_produto integer,
foreign key(id_produto) references produto);

create table pedido(
id_pedido serial primary key not null,
data_realizado timestamp with time zone default current_timestamp not null,
id_usuario integer,
foreign key(id_usuario) references usuario);

create table item_pedido(
id_item_pedido serial primary key not null,
quantidade_item integer not null,
id_produto integer,
id_pedido integer,
foreign key(id_produto) references produto,
foreign key(id_pedido) references pedido);

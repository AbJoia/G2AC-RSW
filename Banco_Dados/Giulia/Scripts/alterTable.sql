alter table produto add id_categoria integer;

alter table categoria 
drop column id_produto;

alter table produto 
add foreign key(id_categoria) references categoria;

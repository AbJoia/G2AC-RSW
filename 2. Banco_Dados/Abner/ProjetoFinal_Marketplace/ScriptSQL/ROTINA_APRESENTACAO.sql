-- Rotina de apresentação

-- Cadastro Usuario

insert into endereco
	 values (default,'Nova Brasil', '125', 'Centro', 'São Paulo', 'SP', '01040001');
insert into usuario
	 values	(default, 'Alex Moraes', '15686906692', 'alexmoraes@gmail.com', 'Alex_M', '1988-05-23', 6);
insert into contato 
	 values (default, '11', '33561256', '985661222', 6);
	
select * from usuario	
select * from contato
select * from endereco
	
-- Cadastro de Produto

insert into produto 
	 values (default, '2018-10-05', 1200, 5, 'Produto usado', 'Iphone', 6, 1);
	
select * from produto where id_usuario = 6;
select * from categoria
	
-- Registro de venda

insert into pedido (id_usuario)
	 values (2);
	
insert into item_pedido (quantidade_item , id_produto , id_pedido)
	 values (2, 7, 6);
	
update produto 
   set quantidade_estoque = quantidade_estoque - 2   
 where id_produto = 7;

select * from pedido where pedido.id_usuario = 2;
select * from item_pedido where item_pedido.id_pedido = 6;

-- Gerar Nota Fiscal

	select pd.id_pedido as "Nº Pedido", p.nome as "Produto", p.valor_unidade as "Valor unitario",
	   	   ip.quantidade_item as "Quantidade", pd.data_realizado as "Data Emissão", u.nome as "Comprador(a)",
		   u.cpf, p.valor_unidade * ip.quantidade_item as "Total", v.nome as "Vendedor(a)"
	  from produto p
inner join usuario v
		on p.id_usuario = v.id_usuario 
inner join item_pedido ip
		on p.id_produto = ip.id_produto
inner join pedido pd
		on ip.id_pedido = pd.id_pedido 
inner join usuario u
		on pd.id_usuario = u.id_usuario 
 	 where pd.id_pedido = 6;

-- Select de consultas	 
	
select * from usuario	
select * from contato
select * from endereco
select * from produto
select * from categoria
select * from pedido where pedido.id_usuario = 2;
select * from item_pedido where item_pedido.id_pedido = 6;


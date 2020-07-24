update usuario
set CPF = '12332145689', email = 'camilla.ferreira@hotmail.com'
where (id_usuario = 5);
update endereco
set rua = 'Presidente Sodré', numero = '500', cep = '25645-025'
where (id_endereco = 5);
update contato
set fixo = '22442315', movel = '992439505'
where (id_contato = 5);
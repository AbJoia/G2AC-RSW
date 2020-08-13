package modelo.contas;

import modelo.usuario.Diretor;
import modelo.usuario.Gerente;
import modelo.usuario.Presidente;
import modelo.usuario.Usuario;

public class Login {
	
	
	public boolean logar(Usuario usuario, String senha) {
		
		if(usuario.getSenha().endsWith(senha)) {
			return true;
		}		
		return false;				
	}	
}

package org.g2ac.java2backend.ProjetoFinal.services;

import java.util.List;

import org.g2ac.java2backend.ProjetoFinal.entities.Usuario;
import org.g2ac.java2backend.ProjetoFinal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> getUsuarios() {
		return usuarioRepository.findAll();
	}
	
	public Usuario getUsuario(Integer id) {
		if(usuarioRepository.existsById(id)) {
			return usuarioRepository.getOne(id);
		}
		return null;	//Exception
	}
	
	public void insertUsuario(Usuario usuario) {
		usuarioRepository.save(usuario);
	}
	
	public Usuario updateUsuario(Integer id, Usuario newUsuario) {
		Usuario usuarioEncontrado = getUsuario(id);
		usuarioEncontrado.setNome(newUsuario.getNome());
		usuarioEncontrado.setCpf(newUsuario.getCpf());
		usuarioEncontrado.setEmail(newUsuario.getEmail());
		usuarioEncontrado.setNomeUsuario(newUsuario.getNomeUsuario());
		usuarioEncontrado.setDataNascimento(newUsuario.getDataNascimento());
		usuarioEncontrado.setEndereco(newUsuario.getEndereco());
		return usuarioRepository.save(usuarioEncontrado);
	}
	
	public void deleteUsuario(Integer id) {
		usuarioRepository.delete(getUsuario(id));
	}
}

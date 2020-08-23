package org.g2ac.backend.ProjetoFinal.service;

import java.util.List;

import org.g2ac.backend.ProjetoFinal.Repository.UsuarioRepository;
import org.g2ac.backend.ProjetoFinal.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario incluirUsuario(Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
	public List<Usuario> buscarUsuario(String nome){
		return usuarioRepository.findAll(Sort.by(nome));
	}
	
	public Usuario buscarUniUsuario(Integer id){
		if(usuarioRepository.existsById(id)) {
		return usuarioRepository.findById(id).get();
		}
		return null;
	}
	
	public Usuario alterarUsuario(Integer id, Usuario altUsuario){
		Usuario usuario = buscarUniUsuario(id);
		usuario.setCpf(altUsuario.getCpf());
		usuario.setData_nascimento(altUsuario.getData_nascimento());
		usuario.setEmail(altUsuario.getEmail());
		usuario.setEndereco(altUsuario.getEndereco());
		usuario.setNome(altUsuario.getNome_usuario());
		usuario.setNome_usuario(altUsuario.getNome_usuario());
		return usuarioRepository.save(usuario);
				
	}
	
	public Usuario excluirUsuario(Integer id){
		Usuario usuario = buscarUniUsuario(id);
		usuarioRepository.delete(usuario);
		return usuario;
	}

}

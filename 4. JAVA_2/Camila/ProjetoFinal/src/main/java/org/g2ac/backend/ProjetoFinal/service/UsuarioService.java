package org.g2ac.backend.ProjetoFinal.service;

import java.util.List;
import java.util.Optional;

import org.g2ac.backend.ProjetoFinal.entity.Usuario;
import org.g2ac.backend.ProjetoFinal.exceptions.DataNotFoundException;
import org.g2ac.backend.ProjetoFinal.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
		
	@Transactional
	public Usuario incluirUsuario(Usuario usuario){
		return usuarioRepository.save(usuario);
	}
	
	public List<Usuario> buscarUsuario(){
		return usuarioRepository.findAll();
	}
	
	public Usuario buscarUniUsuario(Integer id)throws DataNotFoundException{
		Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
		if(optionalUsuario.isPresent()) {
			return optionalUsuario.get();
		}
		throw new DataNotFoundException(id);
	}
	
	@Transactional
	public Usuario alterarUsuario(Integer id, Usuario altUsuario)throws DataNotFoundException{
		Usuario usuario = buscarUniUsuario(id);
		usuario.setCpf(altUsuario.getCpf());
		usuario.setData_nascimento(altUsuario.getData_nascimento());
		usuario.setEmail(altUsuario.getEmail());
		usuario.setNome(altUsuario.getNome_usuario());
		usuario.setNome_usuario(altUsuario.getNome_usuario());
		usuario.getEndereco().setRua(altUsuario.getEndereco().getRua());
		usuario.getEndereco().setNumero(altUsuario.getEndereco().getNumero());
		usuario.getEndereco().setBairro(altUsuario.getEndereco().getBairro());
		usuario.getEndereco().setCidade(altUsuario.getEndereco().getCidade());
		usuario.getEndereco().setEstado(altUsuario.getEndereco().getEstado());
		usuario.getEndereco().setCep(altUsuario.getEndereco().getCep());
		usuario.getContato().setDdd(altUsuario.getContato().getDdd());
		usuario.getContato().setFixo(altUsuario.getContato().getFixo());
		usuario.getContato().setMovel(altUsuario.getContato().getMovel());
		return usuarioRepository.save(usuario);
				
	}
	
	public Usuario excluirUsuario(Integer id)throws DataNotFoundException{
		Usuario usuario = buscarUniUsuario(id);
		usuarioRepository.delete(usuario);
		return usuario;
	}

}

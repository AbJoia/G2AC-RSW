package org.g2ac.javabackend.projetofinal.services;

import java.util.List;
import java.util.Optional;

import org.g2ac.javabackend.projetofinal.entities.Usuario;
import org.g2ac.javabackend.projetofinal.repositories.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepositorio uRepositorio; 
	
	public Usuario procuraID(Integer id) {
		Optional <Usuario> uOptional = uRepositorio.findById(id);
		if(uOptional.isPresent()) {
			return uOptional.get();
		}
		return null;
	}
	
	public List<Usuario> buscaTodos(){
		return uRepositorio.findAll();
	}
	
	public Usuario buscaPorID(Integer id) {
		return procuraID(id);
	}
	
	public Usuario adicionar(Usuario corpo) {
		return uRepositorio.save(corpo);
	}
	
	public void deletar(Integer id) {
		Usuario encontrou = procuraID(id);
		uRepositorio.delete(encontrou);
	}
	
	public Usuario atualizar(Integer id, Usuario novo) {
		Usuario encontrou = procuraID(id);
		encontrou.setNome(novo.getNome());
		encontrou.setCpf(novo.getCpf());
		encontrou.setEmail(novo.getEmail());
		encontrou.setNickname(novo.getNickname());
		encontrou.setDataNascimento(novo.getDataNascimento());
		return uRepositorio.save(encontrou);
	}	
}

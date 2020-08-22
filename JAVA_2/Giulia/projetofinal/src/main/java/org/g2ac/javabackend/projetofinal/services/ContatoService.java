package org.g2ac.javabackend.projetofinal.services;

import java.util.List;
import java.util.Optional;

import org.g2ac.javabackend.projetofinal.entities.Contato;
import org.g2ac.javabackend.projetofinal.repositories.ContatoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepositorio coRepositorio;
	
	public Contato procuraID(Integer id) {
		Optional<Contato> cOptional = coRepositorio.findById(id);
		if(cOptional.isPresent()) {
			return cOptional.get();
		}
		return null;
	}
	
	public List<Contato> buscarTodos(){
		return coRepositorio.findAll();
	}
	
	public Contato buscarPorID(Integer id) {
		return procuraID(id);
	}
	
	public Contato adicionar(Contato corpo) {
		return coRepositorio.save(corpo);
	}
	
	public void deletar(Integer id) {
		Contato achou = procuraID(id);
		coRepositorio.delete(achou);
	}
	
	public Contato atualizar(Integer id, Contato novo) {
		Contato achouID = procuraID(id);
		achouID.setDdd(novo.getDdd());
		achouID.setFixo(novo.getFixo());
		achouID.setCelular(novo.getCelular());
		return coRepositorio.save(achouID);
	}	
}

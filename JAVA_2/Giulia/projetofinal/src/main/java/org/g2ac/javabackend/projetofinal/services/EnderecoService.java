package org.g2ac.javabackend.projetofinal.services;

import java.util.List;
import java.util.Optional;

import org.g2ac.javabackend.projetofinal.entities.Endereco;
import org.g2ac.javabackend.projetofinal.repositories.EnderecoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepositorio eRepositorio; 
	
	public List<Endereco> buscaTodos(){
		return eRepositorio.findAll();
	}
	
	public Endereco procuraID (Integer id) {
		Optional<Endereco> optionalEndereco = eRepositorio.findById(id);
		if (optionalEndereco.isPresent()) {
			return optionalEndereco.get();
		}
		return null;
	}
	
	public Endereco buscaPorID (Integer id) {
		return procuraID(id);
	}
	
	public Endereco adicionar(Endereco corpo) {
		return eRepositorio.save(corpo);
	}
	
	public void deletar(Integer id) {
		Endereco achou = procuraID(id);
		eRepositorio.delete(achou);
	}
	
	public Endereco atualizar(Integer id, Endereco novo) {
		Endereco achou = procuraID(id); 
		achou.setRua(novo.getRua());
		achou.setNumero(novo.getNumero());
		achou.setBairro(novo.getBairro());
		achou.setCidade(novo.getCidade());
		achou.setEstado(novo.getEstado());
		achou.setCep(novo.getCep());
		return eRepositorio.save(achou);
	}
}

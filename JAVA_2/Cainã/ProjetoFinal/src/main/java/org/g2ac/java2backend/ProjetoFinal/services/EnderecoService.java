package org.g2ac.java2backend.ProjetoFinal.services;

import java.util.List;

import org.g2ac.java2backend.ProjetoFinal.entities.Endereco;
import org.g2ac.java2backend.ProjetoFinal.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public List<Endereco> getEnderecos() {
		return enderecoRepository.findAll();
	}
	
	public Endereco getEndereco(Integer id) {
		if(enderecoRepository.existsById(id)) {
			return enderecoRepository.getOne(id);
		}
		return null;	//Exception
	}
	
	public void insertEndereco(Endereco endereco) {
		enderecoRepository.save(endereco);
	}
	
	public Endereco updateEndereco(Integer id, Endereco newEndereco) {
		Endereco enderecoEncontrado = getEndereco(id);
		enderecoEncontrado.setRua(newEndereco.getRua());
		enderecoEncontrado.setNumero(newEndereco.getNumero());
		enderecoEncontrado.setBairro(newEndereco.getBairro());
		enderecoEncontrado.setCidade(newEndereco.getCidade());
		enderecoEncontrado.setEstado(newEndereco.getEstado());
		enderecoEncontrado.setCep(newEndereco.getCep());
		return enderecoRepository.save(enderecoEncontrado);
	}
	
	public void deleteEndereco(Integer id) {
		enderecoRepository.delete(getEndereco(id));
	}
}

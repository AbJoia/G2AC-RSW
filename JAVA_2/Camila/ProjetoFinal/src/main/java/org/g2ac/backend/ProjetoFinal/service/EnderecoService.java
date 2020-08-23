package org.g2ac.backend.ProjetoFinal.service;

import java.util.List;

import org.g2ac.backend.ProjetoFinal.Repository.EnderecoRepository;
import org.g2ac.backend.ProjetoFinal.entity.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public Endereco incluirEndereco(Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
	
	public List<Endereco> buscarEndereco() {
		return enderecoRepository.findAll();
	}
	
	public Endereco buscarUniEndereco(Integer id) {
		if(enderecoRepository.existsById(id)) {
			return enderecoRepository.findById(id).get();
		}
		return null;
	}
	
	public Endereco alterarEndereco(Integer id, Endereco altEndereco) {
		Endereco endereco = buscarUniEndereco(id);
		endereco.setBairro(altEndereco.getBairro());
		endereco.setCep(altEndereco.getCep());
		endereco.setCidade(altEndereco.getCidade());
		endereco.setEstado(altEndereco.getEstado());
		endereco.setNumero(altEndereco.getNumero());
		endereco.setRua(altEndereco.getRua());
		return enderecoRepository.save(endereco);
	}
	
	public Endereco excluirEndereco(Integer id) {
		Endereco endereco = buscarUniEndereco(id);
		enderecoRepository.delete(endereco);
		return endereco;
	
	}
}

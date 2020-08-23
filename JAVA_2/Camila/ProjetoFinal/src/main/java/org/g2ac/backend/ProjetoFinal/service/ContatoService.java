package org.g2ac.backend.ProjetoFinal.service;

import java.util.List;

import org.g2ac.backend.ProjetoFinal.Repository.ContatoRepository;
import org.g2ac.backend.ProjetoFinal.entity.Contato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;
	
	public Contato incluirContato(Contato contato) {
		return contatoRepository.save(contato);
	}
	
	public List<Contato> buscarContato() {
		return contatoRepository.findAll();
	}
	
	public Contato buscarUniContato(Integer id) {
		if(contatoRepository.existsById(id)) {
			return contatoRepository.findById(id).get();
		}
		return null;
	}
	
	public Contato alterarContato(Integer id, Contato altContato) {
		Contato contato = buscarUniContato(id);
		contato.setDdd(altContato.getDdd());
		contato.setFixo(altContato.getFixo());
		contato.setMovel(altContato.getMovel());
		return contatoRepository.save(contato);
	}
	
	public Contato excluirContato(Integer id) {
		Contato contato = buscarUniContato(id);
		contatoRepository.delete(contato);
		return contato;
	
	}
}

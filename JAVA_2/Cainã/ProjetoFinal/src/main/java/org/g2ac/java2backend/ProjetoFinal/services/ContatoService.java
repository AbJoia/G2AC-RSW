package org.g2ac.java2backend.ProjetoFinal.services;

import java.util.List;

import org.g2ac.java2backend.ProjetoFinal.entities.Contato;
import org.g2ac.java2backend.ProjetoFinal.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {

	@Autowired
	private ContatoRepository contatoRepository;
	
	public List<Contato> getContatos() {
		return contatoRepository.findAll();
	}
	
	public Contato getContato(Integer id) {
		if(contatoRepository.existsById(id)) {
			return contatoRepository.getOne(id);
		}
		return null;	//Exception
	}
	
	public void insertContato(Contato contato) {
		contatoRepository.save(contato);
	}
	
	public Contato updateContato(Integer id, Contato newContato) {
		Contato contatoEncontrado = getContato(id);
		contatoEncontrado.setDdd(newContato.getDdd());
		contatoEncontrado.setFixo(newContato.getFixo());
		contatoEncontrado.setMovel(newContato.getMovel());
		contatoEncontrado.setUsuario(newContato.getUsuario());
		return contatoEncontrado;
	}
	
	public void deleteContato(Integer id) {
		contatoRepository.delete(getContato(id));
	}
}

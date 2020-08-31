package org.serratec.java2backend.Projeto4.services;

import java.util.ArrayList;
import java.util.List;

import org.serratec.java2backend.Projeto4.entity.Livro;
import org.springframework.stereotype.Service;

@Service
public class LivroServices {
	
	List<Livro> livros = new ArrayList<>();
	private int contador;
	
	public List<Livro> getAllLivros() {
		return this.livros;
	}
	
	public Livro getOneLivro(int id) {
		return achaLivro(id);
	}
	
	public Livro insertLivro(Livro livro) {
		livro.setId(++contador);
		livros.add(livro);
		return livro;
	}
	
	public Livro updateLivro(int id, Livro newLivro) {
		achaLivro(id).setAutor(newLivro.getAutor());
		achaLivro(id).setDataPublicacao(newLivro.getDataPublicacao());
		achaLivro(id).setTipo(newLivro.getTipo());
		achaLivro(id).setTitulo(newLivro.getTitulo());
		return this.achaLivro(id);
	}
	
	public Livro deleteLivro(int id) {
		livros.remove(achaLivro(id));
		return achaLivro(id);
	}
	
	public Livro achaLivro(int id) {
		for(Livro livro : livros) {
			if(id == livro.getId()) {
				return livro;
			}
		}
		return null;	//Exception
	}
}

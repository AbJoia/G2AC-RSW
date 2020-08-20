package org.serratec.java2backend.Projeto4.controllers;

import java.util.List;

import org.serratec.java2backend.Projeto4.entity.Livro;
import org.serratec.java2backend.Projeto4.services.LivroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LivroController {
	
	@Autowired
	private LivroServices livrosServices;
	
	@GetMapping("/livro")
	public List<Livro> getAllLivros() {
		return livrosServices.getAllLivros();
	}
	
	@GetMapping("/livro/{id}")
	public Livro getOneLivro(@PathVariable int id) {
		return livrosServices.getOneLivro(id);
	}
	
	@PostMapping("/livro")
	public Livro insertLivro(@RequestBody Livro livro) {
		return livrosServices.insertLivro(livro);
	}
	
	@PutMapping("/livro/{id}")
	public Livro updateLivro(@PathVariable int id, @RequestBody Livro newLivro) {
		return livrosServices.updateLivro(id, newLivro);
	}
	
	@DeleteMapping("/livro/{id}")
	public Livro deleteLivro(@PathVariable int id) {
		return livrosServices.deleteLivro(id);
	}
}

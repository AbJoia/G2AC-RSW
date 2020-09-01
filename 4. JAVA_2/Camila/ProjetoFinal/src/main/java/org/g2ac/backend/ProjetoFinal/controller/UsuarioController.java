package org.g2ac.backend.ProjetoFinal.controller;

import java.util.List;

import javax.validation.Valid;

import org.g2ac.backend.ProjetoFinal.entity.Usuario;
import org.g2ac.backend.ProjetoFinal.exceptions.DataNotFoundException;
import org.g2ac.backend.ProjetoFinal.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping
	public Usuario incluirUsuario(@Valid @RequestBody Usuario newUsuario) {
		return usuarioService.incluirUsuario(newUsuario);
	}

	@GetMapping
	public List<Usuario> buscarUsuario() {
		return usuarioService.buscarUsuario();
	}

	@GetMapping("/{id}")
	public Usuario buscarUniUsuario(@Valid @PathVariable Integer id) throws DataNotFoundException{
		return usuarioService.buscarUniUsuario(id);
	}

	@PutMapping("/{id}")
	public Usuario alterarUsuario(@Valid @PathVariable Integer id, @RequestBody Usuario altUsuario)throws DataNotFoundException {
		return usuarioService.alterarUsuario(id, altUsuario);
	}

	@DeleteMapping("/{id}")
	public Usuario excluirUsuario(@PathVariable Integer id) throws DataNotFoundException{
		return usuarioService.excluirUsuario(id);
	}
}

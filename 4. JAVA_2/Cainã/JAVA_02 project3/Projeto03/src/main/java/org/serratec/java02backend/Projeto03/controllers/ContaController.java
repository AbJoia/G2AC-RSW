package org.serratec.java02backend.Projeto03.controllers;

import java.util.List;

import org.serratec.java02backend.Projeto03.entity.Conta;
import org.serratec.java02backend.Projeto03.exception.ValorInvalidoException;
import org.serratec.java02backend.Projeto03.services.ContaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContaController {
	
	@Autowired
	private ContaService contaService;
	
	@GetMapping("/contas")
	public List<Conta> getContas() {
		return contaService.getAllContas();
	}
	
	@GetMapping("/contas/{id}")
	public Conta getUmaConta(@PathVariable int id) {
		return contaService.getUmaConta(id);
	}
	
	@PostMapping("/contas")
	public Conta insertConta(@RequestBody Conta conta) {
		return contaService.insertConta(conta);
	}
	
	@PutMapping("/contas/{id}")
	public Conta updateConta(@PathVariable int id, @RequestBody Conta newConta) {
		return contaService.updateConta(id, newConta);
	}
	
	@DeleteMapping("/contas/{id}")
	public Conta deleteConta(@PathVariable int id) {
		return contaService.deleteConta(id);
	}
	
	@PostMapping("/contas/{id}/{op}")
	public Conta atualizaSaldo(@PathVariable int id, @PathVariable String op, @RequestParam double valor) throws ValorInvalidoException {
		return contaService.realizaOperacao(id, op, valor);
	}
}

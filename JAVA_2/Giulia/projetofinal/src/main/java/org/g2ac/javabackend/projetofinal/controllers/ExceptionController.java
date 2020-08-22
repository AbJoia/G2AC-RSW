package org.g2ac.javabackend.projetofinal.controllers;

import org.g2ac.javabackend.projetofinal.exceptions.DadosNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(DadosNotFoundException.class)
	public ResponseEntity<String> trataLivroNotFound(DadosNotFoundException exception) {
		return ResponseEntity
				.notFound()
				.header("error-code", "DadosNãoEncontrados")
				.header("error-value", String.valueOf(exception.getId()))
				.build();
	}
}

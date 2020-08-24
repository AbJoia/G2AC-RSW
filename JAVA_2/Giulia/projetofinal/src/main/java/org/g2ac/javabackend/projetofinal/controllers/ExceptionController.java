package org.g2ac.javabackend.projetofinal.controllers;

import org.g2ac.javabackend.projetofinal.exceptions.ObjectNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<String> ObjetoNotFound(ObjectNotFoundException exception) {
		String mensagem = String.format("Não foi possível localizar o ID %d", exception.getId());
		return ResponseEntity.notFound()
				.header("error-message", mensagem)
				.header("error-code", "Objeto_Nao_Encontrado")
				.header("error-value", String.valueOf(exception.getId()))
				.build();
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> ValidBadRequest(MethodArgumentNotValidException manve) {
		return ResponseEntity.badRequest()
				.header("error-code", "Operacao_Invalida")
				.header("error-message", manve.getMessage())
				.build();
	}
}

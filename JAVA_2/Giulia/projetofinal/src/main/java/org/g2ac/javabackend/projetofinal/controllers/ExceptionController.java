package org.g2ac.javabackend.projetofinal.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.g2ac.javabackend.projetofinal.exceptions.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> ValidBadRequest(MethodArgumentNotValidException manve) {
		Map<String, String> errosOcorridos = new HashMap<>();
		List<ObjectError> erros = manve.getBindingResult().getAllErrors();
		for (ObjectError erro : erros) {
			String atributo = ((FieldError) erro).getField();
			String mensagem = erro.getDefaultMessage();
			errosOcorridos.put(atributo, mensagem);
		}
		return errosOcorridos;
	}

	@ExceptionHandler(ObjectNotFoundException.class)
	public ResponseEntity<String> ObjetoNotFound(ObjectNotFoundException exception) {
		String mensagem = String.format("Não foi possível localizar o ID %d", exception.getId());
		return ResponseEntity.notFound().header("error-message", mensagem).header("error-code", "Objeto_Nao_Encontrado")
				.header("error-value", String.valueOf(exception.getId())).build();
	}
}

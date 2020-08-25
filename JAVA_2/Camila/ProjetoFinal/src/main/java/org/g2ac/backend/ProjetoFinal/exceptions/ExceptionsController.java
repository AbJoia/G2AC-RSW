package org.g2ac.backend.ProjetoFinal.exceptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionsController {

	@ExceptionHandler(DataNotFoundException.class)
	public ResponseEntity<String> NotFoundException(DataNotFoundException e) {
		return ResponseEntity.notFound().header("error-code", "DADOS NAO ENCONTRADOS")
				.header("error-value", String.valueOf(e.getId())).build();
	}

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException exception) {
		Map<String, String> errosOcorridos = new HashMap<>();
		List<ObjectError> erros = exception.getBindingResult().getAllErrors();
		for (ObjectError erro : erros) {
			String atributo = ((FieldError) erro).getField();
			String mensagem = erro.getDefaultMessage();
			errosOcorridos.put(atributo, mensagem);
		}
		return errosOcorridos;
	}

}

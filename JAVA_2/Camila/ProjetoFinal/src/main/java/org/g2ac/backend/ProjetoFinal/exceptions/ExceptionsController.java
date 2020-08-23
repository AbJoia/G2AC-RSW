package org.g2ac.backend.ProjetoFinal.exceptions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class ExceptionsController {

	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public Map<String, String> handleValidationExceptions(MethodArgumentNotValidException ex) {
		Map<String, String> errosOcorridos = new HashMap<>();
		List<ObjectError> erros = ex.getBindingResult().getAllErrors();
		for (ObjectError erro : erros) {
			String atributo = ((FieldError) erro).getField();
			String mesagem = erro.getDefaultMessage();
			errosOcorridos.put(atributo, mesagem);

		}
		return errosOcorridos;
	}

}

package org.serratec.java02backend.Projeto03.controllers;

import org.serratec.java02backend.Projeto03.exception.IdInvalidoException;
import org.serratec.java02backend.Projeto03.exception.OperacaoInvalidaException;
import org.serratec.java02backend.Projeto03.exception.ValorInvalidoException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(ValorInvalidoException.class)
	public ResponseEntity<String> trataValorInvalido (ValorInvalidoException exception) {
		String msg = String.format("O valor %f digitado é inválido", exception.getValor());
		return ResponseEntity.notFound()
				.header("x-erro-msg", msg)
				.header("x-erro-code", "VALOR_INVALIDO")
				.header("x-erro-values", "" + exception.getValor())
				.build();
	}
	
	@ExceptionHandler(OperacaoInvalidaException.class)
	public ResponseEntity<String> trataOperacaoInvalida (OperacaoInvalidaException exception) {
		String msg = "A operação é inválida";
		return ResponseEntity.notFound()
				.header("x-erro-msg", msg)
				.header("x-erro-code", "VALOR_INVALIDO")
				.header("x-erro-values", "" + exception.getOp())
				.build();
	}
	
	@ExceptionHandler(IdInvalidoException.class)
	public ResponseEntity<String> trataIdInvalido (IdInvalidoException exception) {
		String msg = String.format("O ID %d digitado é inválido", exception.getId());
		return ResponseEntity.notFound()
				.header("x-erro-msg", msg)
				.header("x-erro-code", "VALOR_INVALIDO")
				.header("x-erro-values", "" + exception.getId())
				.build();
	}
}

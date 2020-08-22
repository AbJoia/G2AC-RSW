package org.g2ac.javabackend.projetofinal.exceptions;

public class DadosNotFoundException extends Exception{

	private Integer id;

	public DadosNotFoundException(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
}

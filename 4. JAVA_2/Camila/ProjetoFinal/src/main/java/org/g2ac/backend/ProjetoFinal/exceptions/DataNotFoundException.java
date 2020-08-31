package org.g2ac.backend.ProjetoFinal.exceptions;

public class DataNotFoundException extends Exception {
	
	private Integer id;

	public DataNotFoundException(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
}

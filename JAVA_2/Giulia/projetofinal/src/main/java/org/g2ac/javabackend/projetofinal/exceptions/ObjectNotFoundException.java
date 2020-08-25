package org.g2ac.javabackend.projetofinal.exceptions;

public class ObjectNotFoundException extends Exception{

	private Integer id;

	public ObjectNotFoundException(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
}

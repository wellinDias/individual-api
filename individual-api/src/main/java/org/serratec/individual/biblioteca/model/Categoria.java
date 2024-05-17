package org.serratec.individual.biblioteca.model;

import org.serratec.individual.biblioteca.exception.EnumValidationException;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Categoria {
	AVENTURA, ROMANCE, FICCAO, TERROR, COMEDIA, SUSPENSE;
	
	@JsonCreator
	public static Categoria verifica(String value) throws EnumValidationException {
		for (Categoria c : values()) {
			if (value.equals(c.name())) {
				return c;
			}
		}
		throw new EnumValidationException("Categoria preenchida incorretamente");
	}

}

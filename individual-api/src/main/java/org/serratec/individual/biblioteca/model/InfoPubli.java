package org.serratec.individual.biblioteca.model;

import java.time.LocalDate;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class InfoPubli {
	
	private String autor;
	private String editora;
	private LocalDate dataPubli;
	
	@Enumerated(EnumType.STRING)
	private Categoria categoria;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public LocalDate getDataPubli() {
		return dataPubli;
	}

	public void setDataPubli(LocalDate dataPubli) {
		this.dataPubli = dataPubli;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	

}

package com.capijava.capijava.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table (name ="tb_categorias")
public class CategoriaModel {

	//Tabela Categoria

	//Id
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;

	//Tipos
	@NotBlank
	@Size (min = 1, max = 20)  //Tamanho Tipo - Sujeito alteração
	private String tipos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipos() {
		return tipos;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}



}

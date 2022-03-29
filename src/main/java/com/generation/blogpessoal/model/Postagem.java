package com.generation.blogpessoal.model;


import java.time.LocalDateTime;

import javax.persistence.Entity;//Trabalhando com JPA vamos usar JAVAX
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity  // Os comandos Entity e Table são equivalentes aos Create no MYSQL
@Table(name = "tb_postagens") // da o nome da tabela
public class Postagem {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id; // Long c/ L pasar a ser um objeto de uma classe
	
	@NotBlank(message = "O Atributo Titulo é Obrigatório")
	@Size( min=5, max=100, message = "O atributo titulo deve possuir no min 5 e no max 100 caracteres")
	private String titulo;
	
	@NotBlank(message = "O Atributo texto é Obrigatório")
	@Size( min=5, max=1000, message = "O atributo texto deve possuir no min 5 e no max 1000 caracteres")
	private String texto;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;

	
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	
}

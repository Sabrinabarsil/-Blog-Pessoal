package com.generation.blogpessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity  
@Table(name = "tb_temas")
public class Tema {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@NotBlank(message = "O Atributo Descrição é Obrigatório")
	@Size( min=10, max=1000, message = "O atributo Descrição deve possuir no min 10 e no max 1000 caracteres")
	public String getDescricao() {
		return descricao;
				
	}
	@OneToMany(mappedBy = "tema", cascade = CascadeType.REMOVE )
	@JsonIgnoreProperties("tema")
	private List<Postagem> postagem;
	
	
	public List<Postagem> getPostagem() {
		return postagem;
	}
	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	private String descricao;

}

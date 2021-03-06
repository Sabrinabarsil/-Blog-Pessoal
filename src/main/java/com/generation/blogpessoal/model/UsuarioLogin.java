package com.generation.blogpessoal.model;

  
/*classe auxiliar para ajudar no processo de login
 para comparar o usuario que esta sendo digitado com a senha que esta no banco de dados
 não gera tabela */

public class UsuarioLogin {
	
	private Long id;
	private String nome;
	private String usuario;
	private String senha;
	private String foto;
	private String Token;
	
	
	public UsuarioLogin(Long id, String nome, String usuario, String senha, String foto, String token) {
		
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
		this.foto = foto;
		Token = token;
		
	}
	public UsuarioLogin ( ) {
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getToken() {
		return Token;
	}
	public void setToken(String token) {
		Token = token;
	}
}

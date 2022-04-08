package com.generation.blogpessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity /*
		 * Informa q/ classe = entidade.JPA faz a ligação entre a entidade e uma tabela
		 * no banco de dados. em POOuma entidade representa uma tabela do banco de
		 * dados, e cada instância dessa entidade representa uma linha dessa tabela.
		 */
@Table(name = "tb_usuarios") // nome da tabela

public class Usuario {

	@Id // informa ao JPA qual campo/atributo de uma entidade estará relacionado à chave
		// primária da respectiva tabela no banco de dados. OBRIGATÓRIOA
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*
														 * @GeneratedValue: é utilizada para informar que a geração do
														 * valor do identificador único da entidade será gerenciada pelo
														 * provedor de persistência. (strategy =
														 * GenerationType.IDENTITY): Informa ao provedor de persistência
														 * que os valores a serem atribuídos ao identificador único
														 * serão gerados pela coluna de auto incremento do banco de
														 * dados.
														 */
	private Long id;

	@NotBlank(message = "o Atributo NOME é Obrigatório!")
	private String nome;

	@NotBlank(message = "O atributo USUARIO é obrigatório!!!")
	@Email(message = "O atributo USUARIO deve conter um email Valido!!!")
	private String usuario;

	@NotBlank(message = "O atributo SENHA é obrigatório")
	@Size(min = 8, message = "A SENHA deve ter no minimo 8 caracteres")
	private String senha;

	private String foto;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;
	
	// Primeiro método Construtor

		public Usuario(Long id, String nome, String usuario, String senha, String foto) {
			this.id = id;
			this.nome = nome;
			this.usuario = usuario;
			this.senha = senha;
			this.foto = foto;
		}
	
		// Segundo método Construtor

		public Usuario() {	}


		public long getId() {
			return this.id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return this.nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getUsuario() {
			return this.usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getSenha() {
			return this.senha;
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
	    
		public List<Postagem> getPostagem() {
			return this.postagem;
		}

		public void setPostagem(List<Postagem> postagem) {
			this.postagem = postagem;
		}

	}

package com.generation.blogpessoal.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

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

	@Column(name = "data_nascimento") // indica o nome que o atributo terá no Banco de dados
	@JsonFormat(pattern = "yyyy-MM-dd") // formata a data para o mesmo padrão do MySQL
	@NotNull(message = "O Atributo Data de Nascimento é Obrigatório")
	private LocalDate dataNascimento;

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

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

}

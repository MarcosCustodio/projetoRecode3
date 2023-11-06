package model;

public class Usuario {

	private int id_usuario;
	private String nome_usuario;
	private String cpf_usuario;
	private String telefone_usuario;
	private String senha_usuario;
	private String email_usuario;
	
	public int getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNome_usuario() {
		return nome_usuario;
	}
	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}
	public String getCpf_usuario() {
		return cpf_usuario;
	}
	public void setCpf_usuario(String cpf_usuario) {
		this.cpf_usuario = cpf_usuario;
	}
	public String getTelefone_usuario() {
		return telefone_usuario;
	}
	public void setTelefone_usuario(String telefone_usuario) {
		this.telefone_usuario = telefone_usuario;
	}
	public String getSenha_usuario() {
		return senha_usuario;
	}
	public void setSenha_usuario(String senha_usuario) {
		this.senha_usuario = senha_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nome_usuario=" + nome_usuario + ", cpf_usuario=" + cpf_usuario
				+ ", telefone_usuario=" + telefone_usuario + ", senha_usuario=" + senha_usuario + ", email_usuario="
				+ email_usuario + "]";
	}
	
}
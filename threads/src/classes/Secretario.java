package classes;

import interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {

	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	/*Atributos login e senha*/
	private String login;
	private String senha;
	
	public Secretario() {
	}

	public Secretario(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	@Override
	public double Salario() {
		return 2000.37 + 500.00; /*regra de negócio, por exemplo*/
	}
	
	/*Método do contrato de autenticação*/
	@Override
	public boolean autenticar(String login, String senha) {
		this.login = login;
		this.senha = senha;
		return autenticar();
	}
	
	@Override
	public boolean autenticar() {
		return login.equals("admin") && senha.equals("admin");
	}
	
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia
				+ ", nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + "]";
	}
}

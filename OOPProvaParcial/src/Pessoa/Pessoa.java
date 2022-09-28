package Pessoa;

public class Pessoa {
	String nome;
	String sobrenome;
	
	
	
	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	@Override
	public String toString() {
		return nome + " " + sobrenome;
	}
	
	public Pessoa getNomeSobrenome() {
		Pessoa aux = new Pessoa(this.nome, this.sobrenome);
		return aux;
	}
	
	
}

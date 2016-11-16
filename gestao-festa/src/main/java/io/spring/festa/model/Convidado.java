package io.spring.festa.model;

public class Convidado {

	private String nome;
	private String sexo;
	private Integer idade;
	private Integer quantidadeAcompanhantes;
	
	
	public Convidado(){
		
	}
	
	public Convidado(String nome, String sexo, Integer idade, Integer quantidadeAcompanhantes){
		this.nome = nome;
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
		this.sexo = sexo;
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeAcompanhantes() {
		return quantidadeAcompanhantes;
	}

	public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
		this.quantidadeAcompanhantes = quantidadeAcompanhantes;
	}
	
	
	
}

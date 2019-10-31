package serHumano;

import java.util.Random;

import javax.jws.soap.SOAPBinding.ParameterStyle;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String grau_escolaridade;
	private String orientSexual;
	private String sexo;
	identidadeGenero genero;
	
	
	public Pessoa(String nome, int idade, String grau_escolaridade, identidadeGenero genero, String orientSexual,
			String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.grau_escolaridade = grau_escolaridade;
		this.genero = genero;
		this.orientSexual = orientSexual;
		this.sexo = sexo;
	}
	
	//public Pessoa () {} //construtor default

//	public Pessoa(String nome, int idade) {
//		this.nome = nome;
//		this.idade = idade;
//		this.grau_escolaridade = "Médio";
//		this.genero = identidadeGenero.CISGENERO;
//		this.orientSexual = "hetero";
//		this.sexo = "macho";
//	}
//	
	
		
	public String getNome() {
		return this.nome;
	}

	protected void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return this.idade;
	}

	protected void setIdade(int idade) {
		this.idade = idade;
	}

	public String getGrau_escolaridade() {
		return this.grau_escolaridade;
	}

	protected void setGrau_escolaridade(String grau_escolaridade) {
		this.grau_escolaridade = grau_escolaridade;
	}

	public identidadeGenero getGenero() {
		return this.genero;
	}
	
//	protected identidadeGenero getGenero(Pessoa p) {
//	return p.genero;
//}

	
	protected void setGenero(identidadeGenero genero) {
		this.genero = genero;
	}

	 String getOrientSexual() {
		return this.orientSexual;
	}

	 protected void setOrientSexual(String orientSexual) {
		this.orientSexual = orientSexual;
	}

	protected String getSexo() {
		return this.sexo;
	}

	protected void setSexo(String sexo) {
		this.sexo = sexo;
	}

	protected void dormir() {
		double sera;
		sera = Math.random(); //entre 0 e 1		
		 System.out.println((sera > 0.5) ? "Dormindo" : "Com sono"); 
		 
		 //if(sera < 50){
		 //	System.err.println("Dormindo);
		 //else{
		 //	System.err.println("Com sono");
		 //}
	}

	protected void estudar() {
		System.out.println("Estudando");
	}

	protected void trabalhar() {
		System.out.println("Trabalhando");
	}

	protected void viver() {
		System.out.println("Sobrevivendo");
	}

	protected void sobreviver() {
		this.viver();
	}
	


}

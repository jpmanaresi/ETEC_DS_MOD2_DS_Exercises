package br.edu.eteczl.AulaMaven;

public class Aluno extends Pessoa{

	private boolean fumante = false; 
	
	public Aluno() {
		
	}
	
	public boolean isFumante() {
		return fumante;
	}
	
	public void setFumante (boolean fumante) {
		
		this.fumante = fumante;
	}
}

package br.com.horacio.model;

public class Aluno extends Pessoa { //herança de pessoa
	
	private String cursoAlocado;
	
	private int Idade;

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public String getCursoAlocado() {
		return cursoAlocado;
	}

	public void setCursoAlocado(String cursoAlocado) {
		this.cursoAlocado = cursoAlocado;
	}
	
}

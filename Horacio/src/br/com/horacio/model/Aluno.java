package br.com.horacio.model;

public class Aluno extends Pessoa { //herança de pessoa
	
	private String cursoAlocado;

	public String getCursoAlocado() {
		return cursoAlocado;
	}

	public void setCursoAlocado(String cursoAlocado) {
		this.cursoAlocado = cursoAlocado;
	}
	
}

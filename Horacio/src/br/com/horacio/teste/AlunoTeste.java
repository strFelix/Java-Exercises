package br.com.horacio.teste;

import javax.swing.JOptionPane;

import br.com.horacio.model.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		String recebeNome = JOptionPane.showInputDialog("Digite seu nome");
		String recebeCurso = JOptionPane.showInputDialog("Digite o curso alocado");
		int recebeIdade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));

		
		aluno.setNome(recebeNome);
		aluno.setCursoAlocado(recebeCurso);
		aluno.setIdade(recebeIdade);
		
		System.out.println("O nome do aluno é " + aluno.getNome() +
				"\nO curso que está alocado é " + aluno.getCursoAlocado() +
				"\nA idade do aluno é " + aluno.getIdade()
				);
		
		System.out.println(String.format("\nO nome do aluno é %s \n", aluno.getNome()));
		
		Aluno alunoDois = new Aluno();
		
		aluno.setNome("Pascal");
		aluno.setCursoAlocado("Jornalista da record, e ele tá fazendo noticia da palestina");
		aluno.setIdade(35);
		
		System.out.println("O nome é " + aluno.getNome() +
				"\nAtua como " + aluno.getCursoAlocado() +
				"\nA idade do aluno é " + aluno.getIdade()
				);
		

	}

}

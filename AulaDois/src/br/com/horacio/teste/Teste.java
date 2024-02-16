package br.com.horacio.teste;

import java.io.Console;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
		
		if(idade < 18) {
			System.out.println(String.format("Seu nome é %s, você possui %d e é menor de idade!", nome, idade));
		}
		else {
			System.out.println(String.format("Seu nome é %s, você possui %d e é maior de idade!", nome, idade));
		}
		
	}

}

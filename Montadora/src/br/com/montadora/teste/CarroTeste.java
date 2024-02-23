package br.com.montadora.teste;

import br.com.montadora.model.Carro;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.setNome("Corola");
		carro.setQuantidadeJanelas(6);
		
		System.out.println("O carro se chama " + carro.getNome() + " e possui " + carro.getQuantidadeJanelas() + " janelas!");
	}

}

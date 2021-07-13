package br.com.humberto.cursojava.aula35;

public class TesteCalculadora {

	public static void main(String[] args) {
		
		int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
		System.out.println(fatorialNR);
		
		int fatorialRecursivo = Calculadora.fatorial(5);
		System.out.println(fatorialRecursivo);
	}

}

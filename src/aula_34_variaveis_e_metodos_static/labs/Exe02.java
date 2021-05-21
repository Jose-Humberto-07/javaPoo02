package aula_34_variaveis_e_metodos_static.labs;
import java.util.Scanner;
public class Exe02 {
	public static void imprimir(double num) {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		imprimir(Calculadora.soma(5, 7));
		imprimir(Calculadora.subtrair(5, 12));
		imprimir(Calculadora.multiplicar(5, 12));
		imprimir(Calculadora.potencia(5, 2));
		
		System.out.println();
		
		Scanner teclado = new Scanner(System.in);
		int num;
		
		do {
			System.out.println("Informe um número: ");
			num = teclado.nextInt();
			
			if (num < 0) {
				System.out.println("Número inválido");
			}
		} while(num < 0);
		
		System.out.println(Calculadora.fatorial(num));
	}

}

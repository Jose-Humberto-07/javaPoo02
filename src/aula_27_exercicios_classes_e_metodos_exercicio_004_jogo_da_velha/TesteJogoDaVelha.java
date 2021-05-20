/**
 * 
 */
package aula_27_exercicios_classes_e_metodos_exercicio_004_jogo_da_velha;

import java.util.Scanner;

/**
 * @author humbe
 *
 */

	
public class TesteJogoDaVelha {
	
	
	static int valor(String tipoValor, Scanner teclado) {
		int valor = 0;
		boolean valorValida = false;
		
		while (!valorValida) {
			 System.out.println("Entre com a " +tipoValor+ " (1, 2 ou 3)");
			 valor = teclado.nextInt();
			 if(valor >= 1 && valor <= 3) {
				 valorValida = true;
			 }else {
				 System.out.println("Entrada inválida, tente novamente");
			 }
			 
		}
		valor--;
		return valor;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		
		
		
		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;
		
		System.out.println("=====================================");
		System.out.println("            JOGO DA VELHA            ");
		System.out.println("=====================================");
		System.out.println();
		System.out.println("Símbolos dos jogadores");
		System.out.println("Jogador 1 = x");
		System.out.println("Jogador 2 = o");
		System.out.println();
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("         QUE COMEÇE A PARTIDA        ");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println();
		System.out.println();
		
		
		while (!ganhou) {
			if (jogoDaVelha.vezJogador1()) {
				
				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3)");
				sinal = 'x';
			}else {
				
				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3)");
				sinal = 'O';
			}
			
			
			
			linha = valor("Linha", teclado);
			coluna = valor("Coluna", teclado);
			
			if(!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posição já usada, tente novamente");
			}
			
			
			jogoDaVelha.imprimirTabuleiro();
			
			
			if (jogoDaVelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 1 ganhou!");
			}else {
				if (jogoDaVelha.verificarGanhador('O')) {
					ganhou = true;
					System.out.println("Parabéns, jogador 2 ganhou!");
				}else {
					if (jogoDaVelha.jogada > 9 ) {
						ganhou = true;
						System.out.println("Ninguém ganhou essa partida.");
					}
				}
			}
		}
		
	}
	
}


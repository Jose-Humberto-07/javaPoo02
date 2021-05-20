package aula_33_sobrecarga_de_metodos_e_contrutores_overload.labs;

public class JogoDaVelha {
	//atributos
	private char[][] jogoVelha;
	private int jogada;
	//contrutor vazio (padrão)
	public JogoDaVelha() {
		this.jogoVelha = new char[3][3];
		this.jogada = 1;
	}
	//métodos getters e setters
	public char[][] getJogoVelha() {
		return jogoVelha;
	}
	public void setJogoVelha(char[][] jogoVelha) {
		this.jogoVelha = jogoVelha;
	}
	public int getJogada() {
		return jogada;
	}
	public void setJogada(int jogada) {
		this.jogada = jogada;
	}
	//métodos personalizados
	//validar jogada
		public boolean validarJogada(int linha, int coluna, char sinal) {
			
			if (jogoVelha[linha][coluna] == sinal || jogoVelha[linha][coluna] == 'O') {
				return false;
				
			}else {
				jogoVelha[linha][coluna] = sinal;
				jogada++;
				return true;
			}
		}
		
		//imprimir tabuleiro
		public void imprimirTabuleiro() {
			for (int l = 0; l < jogoVelha.length; l++) {
				for(int c = 0; c < jogoVelha[l].length; c++) {
					System.out.print(jogoVelha[l][c] + "|");
				}
				System.out.println();
			}
		}
		
		//verificar se tem ganhador
		public boolean verificarGanhador(int sinal) {
			if ((jogoVelha[0][0] == sinal && jogoVelha[0][1] == sinal && jogoVelha[0][2] == sinal)     || //linha1 
					(jogoVelha[1][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[1][2] == sinal) || //linha2
					(jogoVelha[2][0] == sinal && jogoVelha[2][1] == sinal && jogoVelha[2][2] == sinal) || //linha3
					(jogoVelha[0][0] == sinal && jogoVelha[1][0] == sinal && jogoVelha[2][0] == sinal) || //coluna1
					(jogoVelha[0][1] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][1] == sinal) || //coluna2
					(jogoVelha[0][2] == sinal && jogoVelha[1][2] == sinal && jogoVelha[2][2] == sinal) || //coluna3
					(jogoVelha[0][0] == sinal && jogoVelha[1][1] == sinal && jogoVelha[2][2] == sinal)    //diagonal
					) {
				return true;
			}else {
				return false;
			}
		}
		
		//vez jogador 
		public boolean vezJogador1() {
			if (jogada % 2 == 1) {
				return true;
			}
			return false;
		}
	
	
}

/**
 * 
 */
package aula_33_sobrecarga_de_metodos_e_contrutores_overload;

/**
 * @author humberto
 *
 */
public class MinhaCalculadora {
	
	//sobra carga de métodos e contrutores (overload), basicamente é:
	//quando eu preciso criar um método ou contrutor com um nome que já existe.
	//eu tenho um método mas preciso criar outro método ou contrutor com mesmo nome, aí está a sobre carga (overload). 
	//exemplo:
	//quando eu preciso criar um método que já existe tenho que mudar os tipos de parâmetros ou adicionar mais um parâmetro (mas sempre lembrando da compatibilidade de dados, pois java é uma linguagem fortemente tipada.)
	
	public int soma(int num1, int num2) {
		return num1 + num2;
	}
	
	public double soma(double num1, double num2) {
		return num1 + num2;
	}
	
	public int soma(int num1, int num2, int num3) {
		return num1 + num2 + num3;
		
	}
	
	public int soma(int[] vetorInteiros) {
		
		int total = 0;
		
		for (int i = 0; i < vetorInteiros.length; i++) {
			total += vetorInteiros[i];
		}
		return total;
	}
	
	
	//temos o mesmo método declarado 4 vezes, com a assinatura diferente, isso se chama sobre carga de métodos(overload).
	
	
	
	
	
}

/**
 * 
 */
package aula_33_sobrecarga_de_metodos_e_contrutores_overload;

/**
 * @author humberto
 *
 */
public class MinhaCalculadora {
	
	//sobra carga de m�todos e contrutores (overload), basicamente �:
	//quando eu preciso criar um m�todo ou contrutor com um nome que j� existe.
	//eu tenho um m�todo mas preciso criar outro m�todo ou contrutor com mesmo nome, a� est� a sobre carga (overload). 
	//exemplo:
	//quando eu preciso criar um m�todo que j� existe tenho que mudar os tipos de par�metros ou adicionar mais um par�metro (mas sempre lembrando da compatibilidade de dados, pois java � uma linguagem fortemente tipada.)
	
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
	
	
	//temos o mesmo m�todo declarado 4 vezes, com a assinatura diferente, isso se chama sobre carga de m�todos(overload).
	
	
	
	
	
}

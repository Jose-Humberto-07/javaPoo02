/**
 * 
 */
package aula_25_poo_classes_e_metodos_simples;

/**
 * @author humbe
 *
 */
public class Carro {
	//objeto
	
		public String marca;
		public String modelo;
		public int numPassageiros; //n�mero de passageiros
		public double capCombustivel; //capacidade do tanque de combust�vel
		public double consumoCombustivel; //consumo de combust�vel por km
		
		//criando um m�todo simples (retorno) para essa classe
		
		
		public void exibirAutonomia() {
			System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + "km");
		}
		
		
		//m�todo com retorno
		
		public double obterAutonomia() {
			
			System.out.println("M�todo obterAutonomia foi chamado.");
			return capCombustivel * consumoCombustivel;
		}
}

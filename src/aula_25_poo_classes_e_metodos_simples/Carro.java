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
		public int numPassageiros; //número de passageiros
		public double capCombustivel; //capacidade do tanque de combustível
		public double consumoCombustivel; //consumo de combustível por km
		
		//criando um método simples (retorno) para essa classe
		
		
		public void exibirAutonomia() {
			System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");
		}
		
		
		//método com retorno
		
		public double obterAutonomia() {
			
			System.out.println("Método obterAutonomia foi chamado.");
			return capCombustivel * consumoCombustivel;
		}
}

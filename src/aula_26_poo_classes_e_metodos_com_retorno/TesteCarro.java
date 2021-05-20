/**
 * 
 */
package aula_26_poo_classes_e_metodos_com_retorno;

import aula_25_poo_classes_e_metodos_simples.Carro;

/**
 * @author humbe
 *
 */
public class TesteCarro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println(van.numPassageiros);
		System.out.println(van.capCombustivel);
		System.out.println(van.consumoCombustivel);
		System.out.println();
		System.out.println();
		
		
		//método com retorno
		
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
		System.out.println("A autonomia do carro é: " + van.obterAutonomia());
	}
	
	
	
	
}
	
	

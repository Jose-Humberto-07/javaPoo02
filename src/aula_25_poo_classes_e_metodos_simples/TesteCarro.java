/**
 * 
 */
package aula_25_poo_classes_e_metodos_simples;


/**
 * @author humbe
 *
 */
public class TesteCarro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		System.out.println();
		//método simples sem retorno
		van.exibirAutonomia();
		
		System.out.println();
		
		//método com retorno
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
	}

}

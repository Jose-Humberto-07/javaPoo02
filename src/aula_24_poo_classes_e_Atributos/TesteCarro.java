/**
 * 
 */
package aula_24_poo_classes_e_Atributos;

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
		
		van.stauts();
		
		System.out.println();
		
		Carro fusca = new Carro();
		fusca.marca = "Wolkswagen";
		fusca.modelo = "fusca";
		fusca.numPassageiros = 4;
		fusca.capCombustivel = 30;
		fusca.consumoCombustivel = 0.15;
		
		fusca.stauts();
		
		System.out.println();
		

		Carro caminhonete = new Carro();
		caminhonete.marca = "TOYOTA";
		caminhonete.modelo = "HYLUX";
		caminhonete.numPassageiros = 4;
		caminhonete.capCombustivel = 30;
		caminhonete.consumoCombustivel = 0.15;
		
		caminhonete.stauts();
	}

}

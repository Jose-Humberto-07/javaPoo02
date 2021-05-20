/**
 * 
 */
package aula_24_poo_classes_e_Atributos;

/**
 * @author humbe
 *
 */
public class Carro {
	//objeto
	
	String marca;
	String modelo;
	int numPassageiros; //número de passageiros
	double capCombustivel; //capacidade do tanque de combustível
	double consumoCombustivel; //consumo de combustível por km
	
	
	
	void stauts() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Número de passageiros: " + this.numPassageiros);
		System.out.println("Capacidade de combustível: " + this.capCombustivel);
		System.out.println("Consumo de combustível: " + this.consumoCombustivel);
	}
}

	

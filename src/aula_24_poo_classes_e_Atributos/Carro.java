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
	int numPassageiros; //n�mero de passageiros
	double capCombustivel; //capacidade do tanque de combust�vel
	double consumoCombustivel; //consumo de combust�vel por km
	
	
	
	void stauts() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("N�mero de passageiros: " + this.numPassageiros);
		System.out.println("Capacidade de combust�vel: " + this.capCombustivel);
		System.out.println("Consumo de combust�vel: " + this.consumoCombustivel);
	}
}

	

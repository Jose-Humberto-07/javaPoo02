/**
 * 
 */
package aula_29_construtores;

/**
 * @author humbe
 *
 */
public class TesteCarro2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carro2 gol = new Carro2("Gol", "Preto", 10, 20, 0.5);
		System.out.println(gol.marca);
		System.out.println(gol.modelo);
		System.out.println(gol.numPassageiros);
		System.out.println(gol.capCombustivel);
		System.out.println(gol.consumoCombustivel);
	}

}

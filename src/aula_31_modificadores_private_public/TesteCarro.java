/**
 * 
 */
package aula_31_modificadores_private_public;


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
		Carro carro = new Carro();
		
		carro.marca = "gol";
		//no auto-complit
		//triângulo é default
		//verde e bolinha é public
		//quadrado vermelho é private
	}

}

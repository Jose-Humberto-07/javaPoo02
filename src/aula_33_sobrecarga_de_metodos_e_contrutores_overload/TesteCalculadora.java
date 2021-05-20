/**
 * 
 */
package aula_33_sobrecarga_de_metodos_e_contrutores_overload;

/**
 * @author humbe
 *
 */
public class TesteCalculadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		calc.soma(1, 2);
		calc.soma(1.0, 2.0);
		// o java sabe quais parâmetros usar.
	}

}

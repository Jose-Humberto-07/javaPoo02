/**
 * 
 */
package aula_27_exercicios_classes_e_metodos_exercicio_001;

/**
 * @author humbe
 *
 */
public class TesteLampada {
	public static void main(String[] args) {
		
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		
		lampada.mostrarEstado();
		
		lampada.desligar();
		
		lampada.mostrarEstado();
		
		lampada.mudarEstado();
		
		lampada.mostrarEstado();
	}
}

/**
 * 
 */
package aula_27_poo_calsses_e_metodos_com_parametros;

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
		
		van.exibirAutonomia();
		
		System.out.println();
		
		double autonomia = van.obterAutonomia();
		System.out.println("A autonomia do carro �: " + autonomia);
		//out put direto do m�todo
		System.out.println("A autonomia do carro �: " + van.obterAutonomia());
		
		System.out.println();
		
		//m�todo calcular combust�vel com param�tros
		
		double qtdCombustivel10 = van.calcularCombustivel(10);
		double qtdCombustivel15 = van.calcularCombustivel(15);
		
		System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		System.out.println("qtdCombustivel15 = " + qtdCombustivel15);
		
		System.out.println();
		System.out.println("==================================");
		System.out.println("==================================");
		System.out.println("==================================");
		System.out.println();
		
		System.out.println("Outro carro");
		System.out.println();
		
		Carro camaro = new Carro();
		
		camaro.marca = "Chevrolet";
		camaro.modelo  = "Camaro";
		
		System.out.println(camaro.marca);
		System.out.println(camaro.modelo);
	}

}

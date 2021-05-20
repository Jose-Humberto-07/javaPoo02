/**
 * 
 */
package aula_27_poo_calsses_e_metodos_com_parametros;

/**
 * @author humbe
 *
 */
public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	//m�todo simples
	void exibirAutonomia() {
		System.out.println("A autonomia �: " + capCombustivel * consumoCombustivel + "KM");
	}
	
	
	
	//m�todo com retorno
	double obterAutonomia() {
		System.out.println("M�todo obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	
	//m�todo com param�tros
	//param�tros s�o informa��es que n�o existem dentro do carro
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}
	
	
}

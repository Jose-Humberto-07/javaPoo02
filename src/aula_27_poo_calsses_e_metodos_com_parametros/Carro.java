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
	
	//método simples
	void exibirAutonomia() {
		System.out.println("A autonomia é: " + capCombustivel * consumoCombustivel + "KM");
	}
	
	
	
	//método com retorno
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	
	//método com paramêtros
	//paramêtros são informações que não existem dentro do carro
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km / consumoCombustivel;
		
		return qtdCombustivel;
	}
	
	
}

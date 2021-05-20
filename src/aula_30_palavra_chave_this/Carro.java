/**
 * 
 */
package aula_30_palavra_chave_this;

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
	
	
	
	//construtor com métodos

	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}


	

	//construtor vazio
	public Carro() { }
	

	

	public Carro(String marca, String modelo, int numPassageiros) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando contrutor com 3 parâmetros");
	}




	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando contrutor com 2 parâmetros");
	}




	//método simples
	void exibirAutonomia() {
		System.out.println("A autonomia é: " + this.capCombustivel * this.consumoCombustivel + "KM");
	}
	
	
	
	//método com retorno
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	
	//método com paramêtros
	//paramêtros são informações que não existem dentro do carro
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km / this.consumoCombustivel;
		
		return qtdCombustivel;
	}
}

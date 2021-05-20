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
	
	
	
	//construtor com m�todos

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
		System.out.println("Chamando contrutor com 3 par�metros");
	}




	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando contrutor com 2 par�metros");
	}




	//m�todo simples
	void exibirAutonomia() {
		System.out.println("A autonomia �: " + this.capCombustivel * this.consumoCombustivel + "KM");
	}
	
	
	
	//m�todo com retorno
	double obterAutonomia() {
		System.out.println("M�todo obterAutonomia foi chamado.");
		
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	
	//m�todo com param�tros
	//param�tros s�o informa��es que n�o existem dentro do carro
	
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km / this.consumoCombustivel;
		
		return qtdCombustivel;
	}
}

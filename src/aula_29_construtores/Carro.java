/**
 * 
 */
package aula_29_construtores;

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
	
	//contrutor j� tem escondido, agora vamos apenas mostrar
	//contrutor
	Carro(){
		System.out.println("Classe Carro foi instaciada");
		this.numPassageiros = 4;
	}
	
	
	
	
	//construtor com param�tros
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
		marca = marca_;
		modelo = modelo_;
		this.numPassageiros =  numPassageiros_;
		this.capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}
	
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

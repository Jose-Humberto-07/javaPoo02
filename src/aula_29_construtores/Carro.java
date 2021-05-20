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
	
	//contrutor já tem escondido, agora vamos apenas mostrar
	//contrutor
	Carro(){
		System.out.println("Classe Carro foi instaciada");
		this.numPassageiros = 4;
	}
	
	
	
	
	//construtor com paramêtros
	Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_){
		marca = marca_;
		modelo = modelo_;
		this.numPassageiros =  numPassageiros_;
		this.capCombustivel = capCombustivel_;
		consumoCombustivel = consumoCombustivel_;
	}
	
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

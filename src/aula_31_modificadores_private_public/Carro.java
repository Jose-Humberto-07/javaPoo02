/**
 * 
 */
package aula_31_modificadores_private_public;


	/*
	 * A classe public pode ser vista em qualquer pacote.
	 * 
	 * A calsse private s� pode ser vista na classe em que foi criada. (classe peivada)
	 * 
	 * A classe defalt (padr�o, quando n�o tem nada na frente) � vista apenas dentro do pacote
	 * 
	 * */



	
/**
 * @author humbe
 *
 */
public class Carro {
	
	public String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	
	
	
	//m�todo simples
		public void exibirAutonomia() {
			System.out.println("A autonomia �: " + this.capCombustivel * this.consumoCombustivel + "KM");
		}
		
		
		
		//m�todo com retorno
		public double obterAutonomia() {
			System.out.println("M�todo obterAutonomia foi chamado.");
			
			return this.capCombustivel * this.consumoCombustivel;
		}
		
		
		private double divideKmPorConsumo(double km) {
			return km / this.consumoCombustivel;
		}
		
		
		//m�todo com param�tros
		//param�tros s�o informa��es que n�o existem dentro do carro
		
		public double calcularCombustivel(double km) {
			
			
			return this.divideKmPorConsumo(km);
		}
}

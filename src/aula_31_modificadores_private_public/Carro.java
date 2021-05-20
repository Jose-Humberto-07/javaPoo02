/**
 * 
 */
package aula_31_modificadores_private_public;


	/*
	 * A classe public pode ser vista em qualquer pacote.
	 * 
	 * A calsse private só pode ser vista na classe em que foi criada. (classe peivada)
	 * 
	 * A classe defalt (padrão, quando não tem nada na frente) é vista apenas dentro do pacote
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
	
	
	
	//método simples
		public void exibirAutonomia() {
			System.out.println("A autonomia é: " + this.capCombustivel * this.consumoCombustivel + "KM");
		}
		
		
		
		//método com retorno
		public double obterAutonomia() {
			System.out.println("Método obterAutonomia foi chamado.");
			
			return this.capCombustivel * this.consumoCombustivel;
		}
		
		
		private double divideKmPorConsumo(double km) {
			return km / this.consumoCombustivel;
		}
		
		
		//método com paramêtros
		//paramêtros são informações que não existem dentro do carro
		
		public double calcularCombustivel(double km) {
			
			
			return this.divideKmPorConsumo(km);
		}
}

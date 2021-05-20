/**
 * 
 */
package aula_32_encapsulamento_metodos_getters_e_stters;




	//métodos get e set são para atributos privates  (com certeza)
/**
 * @author humbe
 *
 */
public class Carro {
	
	private String marca;
	private String modelo;
	private int numPassageiros;
	private double capCombustivel;
	private double consumoCombustivel;
	
	
	//para o get tem que ter retorno 
	public String getMarca() {
		return marca;
	}
	
	//para o set tem que ser vazio, porque apenas vai setar um valor
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	//get
	public int getNumpassageiros() {
		return this.numPassageiros;
	}
	
	//set
	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}
	
	//agora posso usar esses atributos privados na classe de testes
}

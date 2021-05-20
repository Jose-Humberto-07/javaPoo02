/**
 * 
 */
package aula_33_sobrecarga_de_metodos_e_contrutores_overload.labs;

/**
 * @author humbe
 *
 */
public class Lampada {
	
	//ordem de padrão java (boa prática) >> atributos >> contrutores >> métodos getters e setters >> métodos extras
	
	private String modelo;
	private String tensao;
	private int potencia;
	private String cor;
	private String tipoLuz;
	private int garantiaMeses;
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;
	
	//contrutor vazio
		//posso criar o contrutor usando também o ctrl + espaço
		public Lampada() {
			// TODO Auto-generated constructor stub
		}
		public Lampada(String modelo, String tensao, int potencia, String cor, String tipoLuz, int garantiaMeses,
				String[] tipos, boolean tipoAbajur, boolean ligada) {
			super();
			this.modelo = modelo;
			this.tensao = tensao;
			this.potencia = potencia;
			this.cor = cor;
			this.tipoLuz = tipoLuz;
			this.garantiaMeses = garantiaMeses;
			this.tipos = tipos;
			this.tipoAbajur = tipoAbajur;
			this.ligada = ligada;
		}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTensao() {
		return tensao;
	}
	public void setTensao(String tensao) {
		this.tensao = tensao;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipoLuz() {
		return tipoLuz;
	}
	public void setTipoLuz(String tipoLuz) {
		this.tipoLuz = tipoLuz;
	}
	public int getGarantiaMeses() {
		return garantiaMeses;
	}
	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	
	//quando é tipo boolean o get é is.
	public boolean isTipoAbajur() {
		return tipoAbajur;
	}
	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	//métodos extras
	public void ligar() {
		setLigada(true);
	}
	
	public void desligar() {
		setLigada(false);
	}
	

	public void mostrarEstado() {

		if (isLigada()) {
			System.out.println("Lâmpada está ligada");

		}else {
			System.out.println("Lâmpada está desligada");
			
		}
	}
	
	public void mudarEstado() {
		if(isLigada()) {
			desligar();
		} else {
			ligar();
		}
	}
}

/**
 * 
 */
package aula_33_sobrecarga_de_metodos_e_contrutores_overload.labs;

/**
 * @author humbe
 *
 */
public class ContaCorrente {
	
	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double valorEspecialUsado;
	private double saldo;
	//contrutor sem parâmetro
		public ContaCorrente() {
			super();
		}
		//construtor com parâmetros
		public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial,
				double valorEspecialUsado, double saldo) {
			super();
			this.numero = numero;
			this.agencia = agencia;
			this.especial = especial;
			this.limiteEspecial = limiteEspecial;
			this.valorEspecialUsado = valorEspecialUsado;
			this.saldo = saldo;
		}
		//métodos getters e setters
		public String getNumero() {
			return numero;
		}
		public void setNumero(String numero) {
			this.numero = numero;
		}
		public String getAgencia() {
			return agencia;
		}
		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}
		public boolean isEspecial() {
			return especial;
		}
		public void setEspecial(boolean especial) {
			this.especial = especial;
		}
		public double getLimiteEspecial() {
			return limiteEspecial;
		}
		public void setLimiteEspecial(double limiteEspecial) {
			this.limiteEspecial = limiteEspecial;
		}
		public double getValorEspecialUsado() {
			return valorEspecialUsado;
		}
		public void setValorEspecialUsado(double valorEspecialUsado) {
			this.valorEspecialUsado = valorEspecialUsado;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
	//métodos personalizados
	public boolean realizarSaque(double quantiaASacar){
		//tem saldo na conta
		if (this.saldo >= quantiaASacar) {
			this.saldo -= quantiaASacar;
			return true;
		}else { //não tem saldo na conta
			if (this.especial) {
				//verificar se o limite especial tem saldo
				
				double limite = this.limiteEspecial + this.saldo;
				if (limite >= quantiaASacar) {
					this.saldo -= quantiaASacar;
					return true;
				}else {
					return false;
				}
				
				
			}else {
				return false; // não é especial e não tem saldo suficiente
			}
		}
		
	}
	
	public void depositar(double valorDepositado) {
		saldo += valorDepositado;
	}
	
	public void consultarSaldo() {
		System.out.println("Saldo atual da conta = " + saldo);
	}
	
	public boolean verificarUsoChequeEspecial() {
		return saldo < 0;
	}
	
}

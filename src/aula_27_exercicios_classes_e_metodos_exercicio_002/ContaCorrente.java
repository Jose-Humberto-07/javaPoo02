/**
 * 
 */
package aula_27_exercicios_classes_e_metodos_exercicio_002;

/**
 * @author humbe
 *
 */
public class ContaCorrente {
	
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double valorEspecialUsado;
	double saldo;
	
	boolean realizarSaque(double quantiaASacar){
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

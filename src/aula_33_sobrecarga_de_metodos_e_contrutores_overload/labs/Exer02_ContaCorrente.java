/**
 * 
 */
package aula_33_sobrecarga_de_metodos_e_contrutores_overload.labs;


/**
 * @author humbe
 *
 */
public class Exer02_ContaCorrente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ContaCorrente conta = new ContaCorrente();
		conta.setNumero("123456");
		conta.setAgencia("1234");
		conta.setEspecial(true);
		conta.setLimiteEspecial(500);
		conta.setValorEspecialUsado(0);
		conta.setSaldo(-10);
		
		System.out.println("Saldo da conta " + conta.getNumero() + " = " + conta.getSaldo());
		
		boolean saqueEfetuado = conta.realizarSaque(100);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			System.out.println("Saldo atual da conta = " + conta.getSaldo());
		}else {
			System.out.println("não foi possível realizar saque. Saldo insuficiente");
		}
	}

}

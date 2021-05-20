/**
 * 
 */
package aula_27_exercicios_classes_e_metodos_exercicio_002;

/**
 * @author humbe
 *
 */
public class TesteContaCorrente {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123456";
		conta.agencia = "1234";
		conta.especial = true;
		conta.limiteEspecial = 500;
		conta.valorEspecialUsado = 0;
		conta.saldo = -10;
		
		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
		
		boolean saqueEfetuado = conta.realizarSaque(100);
		
		if (saqueEfetuado) {
			System.out.println("Saque efetuado com sucesso.");
			System.out.println("Saldo atual da conta = " + conta.saldo);
		}else {
			System.out.println("não foi possível realizar saque. Saldo insuficiente");
		}
	}

}

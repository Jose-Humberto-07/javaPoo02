/**
 * 
 */
package aula_24_poo_classes_e_Atributos;

/**
 * @author humbe
 *
 */
public class Exercicio_002_Livro {
	public static void main(String[] args) {
		
		
		Livro livro = new Livro();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		
		System.out.println("Nome do livro = " + livro.nome);
	}
}

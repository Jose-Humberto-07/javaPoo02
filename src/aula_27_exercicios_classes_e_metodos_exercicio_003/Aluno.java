/**
 * 
 */
package aula_27_exercicios_classes_e_metodos_exercicio_003;

/**
 * @author humbe
 *
 */
public class Aluno {

	String nome;
	String matricula;
	String nomeCurso;
	String[] nomeDisciplinas = new String[3];
	double[][] notasDisciplinas = new double[3][4];
	
	//out put das informa��es
	void exibirInfo() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matr�cula: " + this.matricula);
		System.out.println("Nome do Curso: " + this.nomeCurso);
		
		for (int i = 0; i < this.notasDisciplinas.length; i++) {
			System.out.print("Notas da displina " + this.nomeDisciplinas[i] + " ");
			for (int j = 0; j < this.notasDisciplinas[i].length; j++) {
				System.out.print(this.notasDisciplinas[i][j] + " ") ;
			}
			System.out.println();
		}
	}
	
	
	
	
	//verificar se o aluno est� aprovado
	boolean verificarAprovado(int indice) {
		
		double soma = 0;
		
		for (int i = 0; i < this.notasDisciplinas[indice].length; i++) {
			soma += this.notasDisciplinas[indice][i];
		}
		
		double media = soma / 4;
		
		
		//nos m�todos, depois do retunr nada mais � executado
		// colocar um print por exemplo n�o ser� executado por causa do retunr
		if (media >= 7) {
			return true;
		}else {
			return false;
		}
	}
}

/**
 * 
 */
package aula_33_sobrecarga_de_metodos_e_contrutores_overload.labs;

import java.util.Scanner;


/**
 * @author humbe
 *
 */
public class Exer03_Aluno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	    Scanner teclado = new Scanner (System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("===============");
		System.out.println("Relatório Aluno");
		System.out.println("===============");
		System.out.println();
		
		System.out.println("Informe o nome do aluno: ");
		aluno.setNome(teclado.nextLine());
		
		System.out.println("Informe o nome do curso: ");
		aluno.setNomeCurso(teclado.nextLine());
		
		System.out.println("Informe a matrícula: ");
		aluno.setMatricula(teclado.nextLine());
		
		
		
		//nomes das disciplinas
		//aluno.nomeDisciplinas = new String[3];
		for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			System.out.println("Informe o nome da "+(i+1)+"° disciplina: ");
			aluno.setNomeDisciplinaPos(i, teclado.nextLine());
		}
		
		System.out.println();
		
		//notas das disciplinas
		for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Obtendo notas da "+(i+1)+"° disciplina que é " + aluno.getNomeDisciplinas()[i] + ": ");
			for (int j = 0; j < aluno.getNomeDisciplinas()[i].length();j++) {
				System.out.println("Entre com a "+(j+1)+"° nota: ");
				aluno.setNomePosIJ(i, j, teclado.nextDouble());
			}
		}
		
		System.out.println();
		aluno.exibirInfo();
		
		for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " foi aprovado com sucesso.");
			}else {
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " foi reprovado com sucesso.");

			}
		}
	}

}

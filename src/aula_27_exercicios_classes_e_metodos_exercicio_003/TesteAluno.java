/**
 * 
 */
package aula_27_exercicios_classes_e_metodos_exercicio_003;

import java.util.Scanner;

/**
 * @author humbe
 *
 */
public class TesteAluno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("===============");
		System.out.println("Relatório Aluno");
		System.out.println("===============");
		System.out.println();
		
		System.out.println("Informe o nome do aluno: ");
		aluno.nome = teclado.nextLine();
		
		System.out.println("Informe o nome do curso: ");
		aluno.nomeCurso = teclado.nextLine();
		
		System.out.println("Informe a matrícula: ");
		aluno.matricula = teclado.nextLine();
		
		
		
		//nomes das disciplinas
		//aluno.nomeDisciplinas = new String[3];
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			System.out.println("Informe o nome da "+(i+1)+"° disciplina: ");
			aluno.nomeDisciplinas[i] = teclado.nextLine();
		}
		
		System.out.println();
		
		//notas das disciplinas
		for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas da "+(i+1)+"° disciplina que é " + aluno.nomeDisciplinas[i] + ": ");
			for (int j = 0; j < aluno.notasDisciplinas[i].length;j++) {
				System.out.println("Entre com a "+(j+1)+"° nota: ");
				aluno.notasDisciplinas[i][j] = teclado.nextDouble();
			}
		}
		
		System.out.println();
		aluno.exibirInfo();
		
		for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " foi aprovado com sucesso.");
			}else {
				System.out.println("Disciplina " + aluno.nomeDisciplinas[i] + " foi reprovado com sucesso.");

			}
		}
	}

}

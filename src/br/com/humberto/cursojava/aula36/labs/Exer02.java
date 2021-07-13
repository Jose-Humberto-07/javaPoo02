package br.com.humberto.cursojava.aula36.labs;
import java.util.Scanner;


public class Exer02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome do curso: ");
		String nome = teclado.nextLine();
		
		System.out.println("Informe o horário do curso: ");
		String horario = teclado.nextLine();
		
		System.out.println("Informe o nome do professor: ");
		String nomeProf = teclado.nextLine();
		
		System.out.println("Informe o departamento do professor: ");
		String depProf = teclado.nextLine();
		
		System.out.println("Informe o email do professor: ");
		String emailProf = teclado.nextLine();
		
		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);
		
		Professor prof = new Professor();
		prof.setNome(nomeProf);
		prof.setDepartamento(depProf);
		prof.setEmail(emailProf);
		
		curso.setProfessor(prof);
		
		System.out.println("================================");
		System.out.println("==============Alunos============");
		System.out.println("================================");
		
		Aluno[] alunos = new Aluno[5];
		
		for (int i = 0; i<5; i++) {
			
			System.out.println((i+1) + "° Aluno: ");
			System.out.println("Informe o nome do aluno: ");
			String nomeAluno = teclado.nextLine();
			
			System.out.println("Informe a matrícula do aluno: ");
			String matriculaAluno = teclado.nextLine();
			
			double[] notas = new double[4];
			
			for (int j = 0; j < 4; i++) {
				System.out.println("Informe a "+(i+1)+"° nota: ");
				notas[j] = teclado.nextDouble();
			}
			
			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matriculaAluno);
			aluno.setNotas(notas);
		}
		
		curso.setAlunos(alunos);
	}
}

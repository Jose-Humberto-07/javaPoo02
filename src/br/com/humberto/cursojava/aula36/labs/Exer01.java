package br.com.humberto.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer01 {
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o nome da agenda: ");
		String nome = teclado.nextLine();
		
		Agenda agenda = new Agenda(nome);
		
		
		
		Contato[] contatos = new Contato[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Entre com as informações: ");
			Contato c = new Contato();
			
			System.out.println("Informe o nome: ");
			nome = teclado.nextLine();
			c.setNome(nome);
			
			System.out.println("Informe o telefone: ");
			String telefone = teclado.nextLine();
			c.setTelefone(telefone);
			
			System.out.println("Informe o email: ");
			String email = teclado.nextLine();
			c.setEmail(email);
			
			contatos[i] = c;
		}
		
		agenda.setContatos(contatos);
	}
}

package br.com.humberto.cursojava.aula36;

public class TesteContato {
	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		
		contato1.setNome("Neymar");

		Endereco end = new Endereco();
		end.setCidade("Fortaleza");
		end.setComplemento("Avenida");
		end.setRua("Barcelona");
		
		//relacionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("Android");
		telefone.setDdd("85");
		telefone.setNumero("7777-7777");
		
		//output
		contato1.setTelefone(telefone);
		contato1.setEndereco(end);
		contato1.exibirContato();		
		
		if (contato1 != null && contato1.getEndereco() != null) {
			System.out.println(contato1.getEndereco().getCidade());
		}
		
		if (contato1 != null && contato1.getTelefone() != null) {
			System.out.println(contato1.getTelefone().getDdd() + " " + contato1.getTelefone().getNumero());
		}
	}
}

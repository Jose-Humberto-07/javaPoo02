package aula_34_variaveis_e_metodos_static.labs;

public class Exe01 {
	public static void imprimir() {
		System.out.println(Contador.obterValor());
	}
	public static void main(String[] args) {
		
		Contador.incrementar();
		imprimir();
		
		Contador.zerar();
		imprimir();
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		
		imprimir();
		
		Contador c1 = new Contador();
		Contador c2 = new Contador();
		Contador c3 = new Contador();
		Contador c4 = new Contador();
		Contador c5 = new Contador();

		imprimir();

		
	}

}

package aula_34_variaveis_e_metodos_static;


public class TesteCalculadora {
	static double soma; 
	
	public  static int soma(int n1, int n2) {
		return n1 + n2;
	}
	
	
	public static void main(String[] args) {
		MinhaCalculadora calc = new MinhaCalculadora();
		
		calc.soma(1, 2);
		calc.soma(1.0, 2.0);
		
		 soma = MinhaCalculadora.soma(1.7, 1);
		 System.out.println(soma(5, 5));
		 System.out.println(soma);
	}

}

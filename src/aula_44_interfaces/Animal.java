package aula_44_interfaces;

public abstract class  Animal {
	private String nome;

	public Animal() {
		
	}
	public Animal(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	//métodos personalizados
	public abstract void emitirSom();
	
}

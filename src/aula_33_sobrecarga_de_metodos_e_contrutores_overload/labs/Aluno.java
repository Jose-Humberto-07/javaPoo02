/**
 * 
 */
package aula_33_sobrecarga_de_metodos_e_contrutores_overload.labs;

/**
 * @author humbe
 *
 */
public class Aluno {
	
	private String nome;
	private String matricula;
	private String nomeCurso;
	private String[] nomeDisciplinas = new String[3];
	private double[][] notasDisciplinas = new double[3][4];
	//contrutor sem parâmetros
	public Aluno() {
	}
	//contrutor com parâmetros

	public Aluno(String nome, String matricula, String nomeCurso, String[] nomeDisciplinas,
			double[][] notasDisciplinas) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nomeCurso = nomeCurso;
		this.nomeDisciplinas = nomeDisciplinas;
		this.notasDisciplinas = notasDisciplinas;
	}
	//métodos getters e seters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String[] getNomeDisciplinas() {
		return nomeDisciplinas;
	}

	public void setNomeDisciplinas(String[] nomeDisciplinas) {
		this.nomeDisciplinas = nomeDisciplinas;
	}

	public double[][] getNotasDisciplinas() {
		return notasDisciplinas;
	}

	public void setNotasDisciplinas(double[][] notasDisciplinas) {
		this.notasDisciplinas = notasDisciplinas;
	}
	
	
	
	//out put das informações
	void exibirInfo() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("Nome do Curso: " + this.nomeCurso);
		
		for (int i = 0; i < this.notasDisciplinas.length; i++) {
			System.out.print("Notas da displina " + this.nomeDisciplinas[i] + " ");
			for (int j = 0; j < this.notasDisciplinas[i].length; j++) {
				System.out.print(this.notasDisciplinas[i][j] + " ") ;
			}
			System.out.println();
		}
	}
	

	//verificar se o aluno está aprovado
	boolean verificarAprovado(int indice) {
		
		double soma = 0;
		
		for (int i = 0; i < this.notasDisciplinas[indice].length; i++) {
			soma += this.notasDisciplinas[indice][i];
		}
		
		double media = soma / 4;
		
		
		//nos métodos, depois do retunr nada mais é executado
		// colocar um print por exemplo não será executado por causa do retunr
		if (media >= 7) {
			return true;
		}else {
			return false;
		}
	}
	
	public void setNomeDisciplinaPos(int pos, String nomeDisciplina) {
		this.nomeDisciplinas[pos] = nomeDisciplina;
	}
	
	public void setNomePosIJ(int posI, int posJ, double nota) {
		this.notasDisciplinas[posI][posJ] = nota;
	}
}

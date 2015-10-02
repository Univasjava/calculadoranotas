package br.edu.univas.si.es4.calculadora.notas;

public abstract class Aluno {
	
	public static final int APROVADO = 1;
	public static final int EM_EXAME = 2;
	public static final int REPROVADO = 3;

	private String nome;
	private int matricula;
	
	public int verificarSituacao() {
	    double media = createCalculadora().calcularMedia();
	    if(media >= 60) {
	        return APROVADO;
	    } else if(media >= 30) {
	        return EM_EXAME;
	    } else {
	        return REPROVADO;
	    }
	}
	
	protected abstract CalculadoraMedia createCalculadora();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}

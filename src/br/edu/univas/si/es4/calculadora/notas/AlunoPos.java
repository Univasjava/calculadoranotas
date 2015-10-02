package br.edu.univas.si.es4.calculadora.notas;

import java.util.ArrayList;
import java.util.List;

public class AlunoPos extends Aluno {

	private List<Character> conceitos = new ArrayList<>();
	private String orientador;

	public List<Character> getConceitos() {
		return conceitos;
	}

	public void setConceitos(List<Character> conceitos) {
		this.conceitos = conceitos;
	}
	
	public void addConceito(char conceito) {
		conceitos.add(conceito);
	}

	public String getOrientador() {
		return orientador;
	}

	public void setOrientador(String orientador) {
		this.orientador = orientador;
	}

	@Override
	protected CalculadoraMedia createCalculadora() {
		return new CalcularMediaPorConceito(conceitos);
	}

}

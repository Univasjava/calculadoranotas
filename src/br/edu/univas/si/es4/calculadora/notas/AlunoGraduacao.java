package br.edu.univas.si.es4.calculadora.notas;

import java.util.ArrayList;
import java.util.List;

public class AlunoGraduacao extends Aluno {

	private List<Double> notas = new ArrayList<>();

	public List<Double> getNotas() {
		return notas;
	}

	public void setNotas(List<Double> notas) {
		this.notas = notas;
	}
	
	public void addNota(double nota) {
		notas.add(nota);
	}

	@Override
	protected CalculadoraMedia createCalculadora() {
		return new CalcularMediaPorNota(notas);
	}
	
}

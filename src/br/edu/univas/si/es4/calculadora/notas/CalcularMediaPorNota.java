package br.edu.univas.si.es4.calculadora.notas;

import java.util.List;

public class CalcularMediaPorNota implements CalculadoraMedia {

	private List<Double> notas;

	public CalcularMediaPorNota(List<Double> notas) {
		this.notas = notas;
	}

	public double calcularMedia() {
		if (notas.size() == 0) return 0;
		double soma = 0;
		for (double nota : notas) {
			soma += nota;
		}
		return soma / notas.size();
	}

}

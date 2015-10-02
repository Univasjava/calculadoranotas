package br.edu.univas.si.es4.calculadora.notas;

import java.util.List;

public class CalcularMediaPorConceito implements CalculadoraMedia {

	private List<Character> conceitos;

	public CalcularMediaPorConceito(List<Character> conceitos) {
		this.conceitos = conceitos;
	}

	public double calcularMedia() {
		if (conceitos.size() == 0)
			return 0;
		double soma = 0;
		for (char conceito : conceitos) {
			switch (conceito) {
			case 'A':
			case 'a':
				soma += 100;
				break;
			case 'B':
			case 'b':
				soma += 70;
				break;
			case 'C':
			case 'c':
				soma += 50;
				break;
			default:
				soma += 0;
				break;
			}
		}
		return soma / conceitos.size();
	}

}

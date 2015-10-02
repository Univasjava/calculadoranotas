package br.edu.univas.si.es4.calculadora.notas;

public class Runner {

	public static void main(String[] args) {
		AlunoGraduacao graduacao = new AlunoGraduacao();
		graduacao.setNome("João");
		graduacao.addNota(50);
		graduacao.addNota(40);
		
		AlunoPos pos = new AlunoPos();
		pos.setNome("Maria");
		pos.addConceito('A');
		pos.addConceito('B');
		
		imprimirSituacao(graduacao);
		imprimirSituacao(pos);
	}

	private static void imprimirSituacao(Aluno aluno) {
		String nome = aluno.getNome();
		String situacao = "";
		int situacaoAsInt = aluno.verificarSituacao();
		switch(situacaoAsInt) {
		case Aluno.APROVADO:
			situacao = "Aprovado";
			break;
		case Aluno.EM_EXAME:
			situacao = "Em exame";
			break;
		case Aluno.REPROVADO:
			situacao = "Reprovado";
			break;
		}
		System.out.println("O aluno " + nome + " está " + situacao);
	}
}

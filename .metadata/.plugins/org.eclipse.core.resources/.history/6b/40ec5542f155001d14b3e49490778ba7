package executavel;

import classes.Aluno;
import classes.Disciplina;

public class ArrayVetor {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Edan Almeida");
		aluno.setNomeEscola("Java Treinamento");
		
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setDisciplina("Banco de Dados");
		double[] notas1 = {40.0, 80.0, 90.0, 70.0};
		disciplina1.setNota(notas1);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Java");
		double[] notas2 = {70.0, 80.5, 90.0, 90.0};
		disciplina2.setNota(notas2);
		
		aluno.getDisciplinas().add(disciplina1);
		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("Nome do aluno: " + aluno.getNome() + "| Inscrito no curso: " + aluno.getNomeEscola());
		for (Disciplina disc : aluno.getDisciplinas()) {
			System.out.println("Disciplina: " + disc.getDisciplina());
			System.out.println("Notas da disciplina: " );
			for (int i = 0; i < disc.getNota().length; i++) {
				System.out.println("Nota " + i + ": " + disc.getNota()[i]);
				System.out.println("Média: " + disc.getMediaNotas());
				System.out.println("Resultado: " + aluno.getAlunoAprovado());
			}
		}
		
	}

}

/*Array pode ser de todos os tipos de dados e objetos*/
/*String n = JOptionPane.showInputDialog("Informe a ordem da matriz: ");
		int x = Integer.valueOf(n);
		double[][] notas = new double[x][x];
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas.length; j++) {
				String valor = JOptionPane.showInputDialog("Posição: " + i + ", " + j + ": ");
				notas[i][j] = Double.valueOf(valor);
			}
		}
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas.length; j++) {
				System.out.println(notas[i][j] * 2);
			}
		}*/

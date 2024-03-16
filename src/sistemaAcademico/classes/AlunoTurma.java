package sistemaAcademico.classes;

import java.util.ArrayList;

public class AlunoTurma {
	private ArrayList<Aluno> alunos_matriculados;
	
	public ArrayList<Aluno> matricularAluno(String matricula, String nome, String email_academico) {
		this.alunos_matriculados.add(new Aluno(matricula, nome, email_academico));
		return this.alunos_matriculados;
	}
}

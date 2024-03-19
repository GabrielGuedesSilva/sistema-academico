package sistemaAcademico.classes;

import java.util.ArrayList;

public class AlunosTurma {
	private ArrayList<Aluno> alunos_matriculados;
	
	public AlunosTurma () {
		this.alunos_matriculados = new ArrayList<Aluno>();
	}
	
	public Aluno matricularAluno(Aluno aluno) {
		this.alunos_matriculados.add(aluno);
		return aluno;
	}
	
	public int quantidadeAlunos () {
		return this.alunos_matriculados.size();	
	}
	
	public ArrayList<Aluno> alunosMatriculados (){
		return this.alunos_matriculados;
	}
}

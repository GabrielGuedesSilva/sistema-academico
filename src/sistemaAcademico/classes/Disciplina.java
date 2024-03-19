package sistemaAcademico.classes;

import java.util.ArrayList;

public class Disciplina {
	private String id;
	private String nome;
	private ArrayList<Turma> turmas;
	
	public String getId() {
		return id;
	}

	public Disciplina (String id, String nome) {
		this.id = id;
		this.nome = nome;
		this.turmas =  new ArrayList<Turma>();
	}
	
	public Turma criarTurma(String sala) {
		Turma turma = new Turma(sala);
		this.turmas.add(turma);
		return turma;
	}
	
	public int numeroAlunos() {
		int numeroAlunos = 0;
		for (Turma turma: this.turmas) {
			numeroAlunos += turma.numeroAlunosTurma();
		}
		
		return numeroAlunos;
	}
	
	public ArrayList<Aluno> alunos () {
		ArrayList<Aluno> alunosDisciplina = new ArrayList<Aluno>();
		for (Turma turma: this.turmas) {
			for (Aluno aluno: turma.alunosMatriculados()) {
				alunosDisciplina.add(aluno);
			}
		}
		return alunosDisciplina;
	}
	
	@Override
	public String toString() {
		return this.nome + " ";
	}
}

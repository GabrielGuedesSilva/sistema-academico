package sistemaAcademico.classes;

import java.util.ArrayList;

public class SistemaAcademico {
	private ArrayList <Aluno> alunos = new ArrayList<>();
	private ArrayList <Professor> professores = new ArrayList<>();
	private ArrayList <Disciplina> disciplinas = new ArrayList<>();
	private ArrayList <Turma> turmas = new ArrayList<>();
	
	public void adicionarAluno (String matricula, String nome, String email_academico) {
		this.alunos.add(new Aluno(matricula, nome, email_academico));
	}
	
	public void adicionarProfessor(String id, String nome, String email_academico) {
		this.professores.add(new Professor(id, nome, email_academico));
	}
	
	public void adicionarDisciplina (String id, String nome) {
		this.disciplinas.add(new Disciplina(id, nome));
	}
	
	public void adicionarTurma (String id, String nome) {
		this.disciplinas.add(new Disciplina(id, nome));
	}
	
	
	
}

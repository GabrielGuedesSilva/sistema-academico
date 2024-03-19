package sistemaAcademico.classes;

import java.util.ArrayList;

public class SistemaAcademico {
	private ArrayList <Aluno> alunos = new ArrayList<>();
	private ArrayList <Professor> professores = new ArrayList<>();
	private ArrayList <Disciplina> disciplinas = new ArrayList<>();
	
	public Disciplina cadastrarDisciplina (String id, String nome) {
		Disciplina disciplina = new Disciplina(id, nome);
		this.disciplinas.add(disciplina);
		return disciplina;
	}
	
	public Aluno cadastrarAluno (String matricula, String nome, String email_academico) {
		Aluno aluno = new Aluno(matricula, nome, email_academico);
		this.alunos.add(aluno);
		return aluno;
	}
	
	public Professor cadastrarProfessor(String id, String nome, String email_academico) {
		Professor professor = new Professor(id, nome, email_academico);
		this.professores.add(professor);
		return professor;
	}
	
	public Disciplina buscarDisciplina(String id) {
		for (Disciplina disciplina : this.disciplinas) {
			if (disciplina.getId() == id) {
				return disciplina;
			}	
		}
		return null;
	}
	
	public Professor buscarProfessor(String id) {
		for (Professor professor : this.professores) {
			if (professor.getId() == id) {
				return professor;
			}	
		}
		return null;
	}
	
	public Aluno buscarAluno(String matricula) {
		for (Aluno aluno : this.alunos) {
			if (aluno.getMatricula() == matricula) {
				return aluno;
			}	
		}
		return null;
	}
	
	public ArrayList<Disciplina> disciplinasAluno (String matriculaAluno){
		ArrayList<Disciplina> disciplinasAluno = new ArrayList<Disciplina>();
		
		for (Disciplina disciplina: this.disciplinas) {
			for (Aluno aluno: disciplina.alunos()) {
				if (aluno.getMatricula() == matriculaAluno) {
					disciplinasAluno.add(disciplina);
				}
			}
		}
		return disciplinasAluno;
	}
	
	
	public ArrayList<Disciplina> disciplinasProfessor (String idProfessor){
		ArrayList<Disciplina> disciplinasAluno = new ArrayList<Disciplina>();
		
		for (Disciplina disciplina: this.disciplinas) {
			for (Aluno aluno: disciplina.alunos()) {
				if (aluno.getMatricula() == idProfessor) {
					disciplinasAluno.add(disciplina);
				}
			}
		}
		return disciplinasAluno;
	}
}

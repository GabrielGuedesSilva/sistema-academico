package sistemaAcademico.classes;

import java.util.ArrayList;

public class Turma {
	private String sala;
	private Horario horario1;
	private Horario horario2;
	private ProfessorTurma professor;
	private AlunosTurma alunos;
	
	public Turma(String sala) {
		this.sala = sala;
		this.alunos = new AlunosTurma();
	}
	
	public Horario definirPrimeiroHorario(int hora_inicio, int hora_fim, String dia) {
		Horario horario = new Horario(hora_inicio, hora_fim, dia);
		this.horario1 = horario;
		return horario;
	}
	
	public Horario definirSegundoHorario(int hora_inicio, int hora_fim, String dia) {
		Horario horario = new Horario(hora_inicio, hora_fim, dia);
		this.horario2 = horario;
		return horario;
	}
	
	public ProfessorTurma definirProfessor(Professor professor) {
		ProfessorTurma professorTurma = new ProfessorTurma(professor);
		this.professor = professorTurma;
		return professorTurma;
	}
	
	public void matricularAluno(Aluno aluno) {
		this.alunos.matricularAluno(aluno);
	}
	
	public int numeroAlunosTurma () {
		return this.alunos.quantidadeAlunos();
	}
	
	public Boolean buscarAluno(String matriculaAluno) {
		for (Aluno aluno: this.alunos.alunosMatriculados()) {
			if (aluno.getMatricula() == matriculaAluno){
				return true;
			}
			else {
				return false;
			}
		}
		return null;
	}
	
	public ArrayList<Aluno> alunosMatriculados (){
		return this.alunos.alunosMatriculados();
	}
	
}

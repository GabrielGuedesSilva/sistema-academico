package sistemaAcademico.classes;

public class Turma {
	private String sala;
	private Horario horario;
	private Disciplina disciplina;
	private ProfessorTurma professor;
	private AlunoTurma alunos;
	
	public Turma(String sala, Disciplina disciplina, ProfessorTurma professor, AlunoTurma alunos) {
		this.sala = sala;
	}
	
	public Horario definirHorario(int hora_inicio, int hora_fim, String dia) {
		this.horario = new Horario(hora_inicio, hora_fim, dia);
		return this.horario;
	}
	
	
}

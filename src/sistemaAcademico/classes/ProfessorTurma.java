package sistemaAcademico.classes;

public class ProfessorTurma {
	public Professor professor_matriculado;
	
	public Professor cadastrarProfessor (String id, String nome, String email_academico) {
		this.professor_matriculado = new Professor(id, nome, email_academico);
		return this.professor_matriculado;
	}
	

}

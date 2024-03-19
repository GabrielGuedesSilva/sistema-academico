package sistemaAcademico.classes;

public class Aluno {
	private String matricula;
	private String nome;
	private String email_academico;
	
	public Aluno (String matricula, String nome, String email_academico) {
		this.matricula = matricula;
		this.nome = nome;
		this.email_academico = email_academico;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	@Override
	public String toString() {
		return 
		"Matrícula: " + this.matricula + " | " +		
		"Aluno: " + this.nome + " | " +
		"Email: " + this.email_academico;
	}
	
}

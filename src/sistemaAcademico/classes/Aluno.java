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

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail_academico() {
		return email_academico;
	}

	public void setEmail_academico(String email_academico) {
		this.email_academico = email_academico;
	}
	
	@Override
	public String toString() {
		return 
		"Matrícula: " + this.matricula + " | " +		
		"Aluno: " + this.nome + " | " +
		"Email: " + this.email_academico + "\n";
	}
	
}

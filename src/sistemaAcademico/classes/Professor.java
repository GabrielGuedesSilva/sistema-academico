package sistemaAcademico.classes;

public class Professor {
	private String id;
	private String nome;
	private String email_academico;
	
	public Professor (String id, String nome, String email_academico) {
		this.id = id;
		this.nome = nome;
		this.email_academico = email_academico;
	}
	
	public String getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "Professor: " + this.nome + " | " +
		"Email: " + this.email_academico + " | " + "\n";
	}
}

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

	public void setId(String id) {
		this.id = id;
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
		return "Professor: " + this.nome + " | " +
		"Email: " + this.email_academico + " | " + "\n";
	}
}

package sistemaAcademico.classes;

import java.util.ArrayList;

public class Main {
	public static void main (String[] args) {
		SistemaAcademico sistemaAcademico = new SistemaAcademico();
		
		sistemaAcademico.adicionarAluno("12345", "Gabriel", "gabriel@uepb.br");
		
		sistemaAcademico.adicionarDisciplina("47827","Métodos avançados de Progamação");
		
		
		
	}
}

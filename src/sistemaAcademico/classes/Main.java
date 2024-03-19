package sistemaAcademico.classes;

public class Main {
	public static void main (String[] args) {
//		SISTEMA ACADÊMICO
		SistemaAcademico sistemaAcademico = new SistemaAcademico();
		
//		CRIAÇÃO ALUNOS
		Aluno aluno1 = sistemaAcademico.cadastrarAluno("14552", "Gabriel", "gabriel@uepb.br");
		Aluno aluno2 = sistemaAcademico.cadastrarAluno("14553", "Tassio", "tassio@uepb.br");	
		Aluno aluno3 = sistemaAcademico.cadastrarAluno("14554", "Lucas", "lucas@uepb.br");
		Aluno aluno4 = sistemaAcademico.cadastrarAluno("14554", "Antonio", "antonio@uepb.br");
		
//		CRIAÇÃO DISCIPLINAS	
		Disciplina metodosAvancados = sistemaAcademico.cadastrarDisciplina("47827", "Métodos avançados de Progamação");		
		Disciplina bancoDeDados = sistemaAcademico.cadastrarDisciplina("48629", "Banco de Dados");
		
//		CRIAÇÃO PROFESSORES
		Professor professor1 = sistemaAcademico.cadastrarProfessor("42932", "Sabrina", "sabrina@uepb.br");
		Professor professor2 = sistemaAcademico.cadastrarProfessor("42932", "Fabio", "fabio@uepb.br");
		
//		CRIAÇÃO TURMA MÉTODOS AVANÇADOS 1
		Turma turmaMetodosAvancados1 = metodosAvancados.criarTurma("107-B");
		turmaMetodosAvancados1.definirPrimeiroHorario(11, 13, "Terça");
		turmaMetodosAvancados1.definirSegundoHorario(11, 13, "Sexta");
		turmaMetodosAvancados1.definirProfessor(professor1);
		turmaMetodosAvancados1.matricularAluno(aluno1);
		turmaMetodosAvancados1.matricularAluno(aluno2);
		
//		CRIAÇÃO TURMA MÉTODOS AVANÇADOS 2
		Turma turmaMetodosAvancados2 = metodosAvancados.criarTurma("203-A");
		turmaMetodosAvancados2.definirPrimeiroHorario(7, 9, "Segunda");
		turmaMetodosAvancados2.definirSegundoHorario(9, 11, "Quarta");
		turmaMetodosAvancados2.definirProfessor(professor1);
		turmaMetodosAvancados2.matricularAluno(aluno3);
		turmaMetodosAvancados2.matricularAluno(aluno4);
		
		
		
		
		
		
//		NÚMERO DE ALUNOS DE UMA DISCIPLINA
		System.out.println("DISCIPLINA: " + metodosAvancados);
		System.out.println("Número de alunos: " + metodosAvancados.numeroAlunos());
		System.out.println("");
		
//		DISCIPLINAS ALUNO
		System.out.println("ALUNO: " + aluno1);
		System.out.println("Disciplinas: " + sistemaAcademico.disciplinasAluno("14552"));
		System.out.println("");
		
//		ALUNOS DE UMA DISCIPLINA
		System.out.println("DISCIPLINA: " + metodosAvancados);
		System.out.println(metodosAvancados.alunos());
		
		
	}
}

package sistemaAcademico.testes;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import sistemaAcademico.classes.Aluno;
import sistemaAcademico.classes.Disciplina;
import sistemaAcademico.classes.Professor;
import sistemaAcademico.classes.SistemaAcademico;

public class TestesSistemaAcademico {
	
	SistemaAcademico sistemaAcademico;
	Disciplina disciplinaEsperada;
	Professor professorEsperado;
	Aluno alunoEsperado;
	
	@Before
	public void inicializandoObjetos () {
		sistemaAcademico = new SistemaAcademico();
		disciplinaEsperada = sistemaAcademico.cadastrarDisciplina("55555", "Banco de Dados");
		professorEsperado = sistemaAcademico.cadastrarProfessor("099", "Sabrina", "sabrina@uepb.edu.br");
		alunoEsperado = sistemaAcademico.cadastrarAluno("425", "Gabriel Guedes", "gabriel@uepb.edu.br");
	}
	
	@Test
	public void testeCadastrarDisciplina () {
		Disciplina disciplina = sistemaAcademico.cadastrarDisciplina("12345", "Métodos Avançados de Progamação");
		
		assertNotNull(disciplina);
	}
	
	@Test
	public void testeCadastrarProfessor () {
		Professor professor = sistemaAcademico.cadastrarProfessor("100", "Fábio Diniz", "fabio@uepb.edu.br");
		
		assertNotNull(professor);
	}
	
	@Test
	public void testeCadastrarAluno () {
		Aluno aluno = sistemaAcademico.cadastrarAluno("426", "Tassio", "tassio@uepb.edu.br");
		
		assertNotNull(aluno);
	}
	
	@Test
	public void testeBuscarDisciplina () {
		Disciplina disciplinaRetornada = sistemaAcademico.buscarDisciplina("55555");
		
		assertEquals(disciplinaEsperada, disciplinaRetornada);
		
	}
	
	@Test
	public void testeBuscarProfessor () {
		Professor professorRetornado = sistemaAcademico.buscarProfessor("099");
		
		assertEquals(professorEsperado, professorRetornado);
	}
	
	@Test
	public void testeBuscarAluno () {
		Aluno alunoRetornado = sistemaAcademico.buscarAluno("425");
		
		assertEquals(alunoEsperado, alunoRetornado);
	}
	

	
}
package br.com.senior.proway.escola;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.senior.proway.escola.model.Aluno;
import br.com.senior.proway.escola.model.Boletim;
import br.com.senior.proway.escola.model.Materia;
import br.com.senior.proway.escola.model.Prova;

public class BoletimTest {

	static Boletim boletim;
	private static int periodoPadrao = 202105;
	
	@BeforeClass
	public static void createBoletim() {
		Aluno aluno = new Aluno();
		Integer periodo = periodoPadrao;
		boletim = new Boletim(aluno, periodo);
	}

	@Test
	public void testBoletim() {
		assertNotNull(boletim);
	}
	

	@Test
	public void testGetAluno() {
		assertNotNull(boletim.getAluno());
	}

	@Test
	public void testSetAluno() {
		Aluno alunoNovo = new Aluno();
		boletim.setAluno(alunoNovo);
		assertNotNull(boletim.getAluno());
	}

	@Test
	public void testGetPeriodo() {
		assertNotNull(boletim.getPeriodo());
	}

	@Test
	public void testSetPeriodo() {
		int periodoNovo = 202005;
		boletim.setPeriodo(periodoNovo);
		assertEquals(202005, (int) boletim.getPeriodo());
	}	

}

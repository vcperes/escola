package br.com.senior.proway.escola;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

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
	public void testCalcularMedia() throws Exception {
		boletim.removeTodasProvas();
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova2 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova3 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		prova.setNota(10.0);
		prova2.setNota(9.0);
		prova3.setNota(9.2);
		boletim.addProva(prova);
		boletim.addProva(prova2);
		boletim.addProva(prova3);
		assertEquals(9.4, (double) boletim.getMedia(), 0.1);
		
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

	@Test
	public void testGetMedia() throws Exception {
		boletim.removeTodasProvas();
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova2 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova3 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		prova.setNota(10.0);
		prova2.setNota(9.0);
		prova3.setNota(9.2);
		boletim.addProva(prova);
		boletim.addProva(prova2);
		boletim.addProva(prova3);
		assertEquals(9.4, (double) boletim.getMedia(), 0.1);
	}

	@Test
	public void testAddProva() {
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		boletim.addProva(prova);
		assertEquals(1, boletim.getProvas().size());
		boletim.removeTodasProvas();
	}

	@Test
	public void testRemoveProvas() {
		Materia materia = new Materia();
		Prova prova = new Prova(periodoPadrao, boletim.getAluno(), materia);
		boletim.addProva(prova);
		boletim.removeTodasProvas();
		assertFalse(boletim.getProvas().size() > 0);
	}
	@Test
	public void testRemoveProva() {
		boletim.removeTodasProvas();
		Materia materia = new Materia();
		Prova prova1 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova2 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		Prova prova3 = new Prova(periodoPadrao, boletim.getAluno(), materia);
		boletim.addProva(prova1);
		boletim.addProva(prova2);
		boletim.addProva(prova3);
		
		boletim.removeProva(1);
		
		assertEquals(2, boletim.getProvas().size());
		boletim.removeTodasProvas();
	}

}

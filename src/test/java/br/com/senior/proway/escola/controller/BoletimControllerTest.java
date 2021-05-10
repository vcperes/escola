package br.com.senior.proway.escola.controller;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.senior.proway.escola.model.Aluno;
import br.com.senior.proway.escola.model.Boletim;
import br.com.senior.proway.escola.model.Materia;
import br.com.senior.proway.escola.model.Prova;

public class BoletimControllerTest {

	static BoletimController controller;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Aluno aluno = new Aluno();
		Integer periodo = 202105;
		Boletim boletim = new Boletim(aluno, periodo);
		controller = new BoletimController(boletim);
		
	}

	@Test
	public void testBoletimController() {
		assertNotNull(controller);
	}

	@Test
	public void testAddProva() throws Exception {
		controller.removeTodasProvas();
		Materia materia = new Materia();
		Prova prova = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		prova.setNota(0.0);
		controller.addProva(prova);
		assertEquals(1, controller.getBoletim().getProvas().size());
	}

	@Test
	public void testCalcularMedia() throws Exception {
		controller.removeTodasProvas();
		Materia materia = new Materia();
		Prova prova = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		Prova prova2 = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		Prova prova3 = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		prova.setNota(10.0);
		prova2.setNota(9.0);
		prova3.setNota(9.2);
		controller.addProva(prova);
		controller.addProva(prova2);
		controller.addProva(prova3);
		assertEquals(9.4, (double) controller.getBoletim().getMedia(), 0.1);
		
	}

	@Test
	public void testRemoveProva() throws Exception {
		controller.removeTodasProvas();
		Materia materia = new Materia();
		Prova prova1 = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		Prova prova2 = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		Prova prova3 = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		prova1.setNota(0.0);
		prova2.setNota(10.0);
		prova3.setNota(5.5);
		controller.addProva(prova1);
		controller.addProva(prova2);
		controller.addProva(prova3);
		controller.removeProva(1);
		
		assertEquals(2, controller.getBoletim().getProvas().size());
	}

	@Test
	public void testRemoveProvas() throws Exception {
		Materia materia = new Materia();
		Prova prova = new Prova(controller.getBoletim().getPeriodo(), controller.getBoletim().getAluno(), materia);
		prova.setNota(0.5);
		controller.addProva(prova);
		controller.removeTodasProvas();
		assertFalse(controller.getBoletim().getProvas().size() > 0);
	}

}

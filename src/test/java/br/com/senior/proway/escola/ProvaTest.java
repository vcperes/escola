package br.com.senior.proway.escola;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ProvaTest {

	static Prova prova;
	static int periodoParam = 202105;
	
	@BeforeClass
	public static void CreateProva() {
		Integer periodo = periodoParam;
		Materia materia = new Materia();
		Aluno aluno = new Aluno();
		prova = new Prova(periodo, aluno, materia);
		
	}

	@Test
	public void testProva() {
		assertNotNull(prova);
	}
	@Test
	public void testGetNotaCorreto() {
		try {
			prova.setNota(9.0);
		}catch(Exception e) {
			fail(e.getMessage());
		}
		assertEquals(9.0, (double) prova.getNota(), 0.1);
	}

	@Test (expected = Exception.class)
	public void testSetNotaIncorreta() throws Exception {
		prova.setNota(-10.0);
	}

	@Test
	public void testGetPeriodo() {
		assertEquals(periodoParam, (int) prova.getPeriodo());
	}
	
	@Test
	public void testGetAluno() {
		assertNotNull(prova.getAluno());
	}
	@Test
	public void testeGetMateria() {
		assertNotNull(prova.getMateria());
	}
	

}

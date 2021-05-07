package br.com.senior.proway.escola;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlunoTest {

	@Test
	public void testeNomeComNumero() {
		Aluno aluno = new Aluno();
		try {
			aluno.setNome("132234");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertNull(aluno.getNome());
		
	}
	@Test
	public void testeNomeComCaractereProibido() {
		Aluno aluno = new Aluno();
		try {
			aluno.setNome("132234!%!¨#%!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		assertNull(aluno.getNome());
		
	}
	@Test
	public void testeNomeSemNumero() {
		Aluno aluno = new Aluno();
		try {
			aluno.setNome("Vitor");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertNotNull(aluno.getNome());
		
	}
	@Test
	public void testeSobrenomeComNumero() {
		Aluno aluno = new Aluno();
		try {
			aluno.setSobrenome("Peres124");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertNull(aluno.getSobrenome());
		
	}
	@Test
	public void testeSobrenome() {
		Aluno aluno = new Aluno();
		try {
			aluno.setSobrenome("Peres");
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertNotNull(aluno.getSobrenome());
		
	}
	
	@Test
	public void testeIdadeNegativa() {
		Aluno aluno = new Aluno();
		try {
			aluno.setIdade(-4);
		}catch(Exception e) {
			e.printStackTrace();
		}
		assertNull(aluno.getIdade());
	}
	@Test
	public void testeIdade() {
		Aluno aluno = new Aluno();
		try {
			aluno.setIdade(5);
		}catch(Exception e) {
			e.printStackTrace();
		}
		assertNotNull(aluno.getIdade());
	}
	@Test
	public void testeIdadeMaior() {
		Aluno aluno = new Aluno();
		try {
			aluno.setIdade(135);
		}catch(Exception e) {
			e.printStackTrace();
		}
		assertNull(aluno.getIdade());
	}

}

package br.com.senior.proway.escola.model;

import utils.Validators;

/**
 * Pessoa que estuda na escola.
 * 
 * Um aluno é uma pessoa que estuda na escola. O aluno frequenta uma
 * {@link Turma}, tem {@link Nota} e {@link Boletim}.
 * 
 * @author Vitor Peres <vitorperes1104@gmail.com>
 * @see Nota
 * @see Boletim
 * @see Turma
 */
public class Aluno {

	private String nome;

	private String sobrenome;

	private Integer idade;

	/**
	 * Primeiro nome do aluno.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define primeiro nome do aluno.
	 * 
	 * Utilizar apenas caracteres alfabéticos.
	 * 
	 * @param String nome
	 * @throws Exception Não utilize números ou caracteres especiais no nome do
	 * aluno.
	 * 
	 */
	public void setNome(String nome) throws Exception {
		if (!Validators.onlyValidchars(nome)) {
			throw new Exception("Não utilize números ou caracteres especiais.");
		}
		this.nome = nome;
	}

	/**
	 * Último sobrenome do aluno.
	 */
	public String getSobrenome() {
		return sobrenome;
	}

	/**
	 * Define sobrenome do aluno.
	 * 
	 * Utilizar somente caracteres alfabéticos.
	 * 
	 * @param String sobrenome
	 * @throws Exception Não utilize números ou caracteres especiais.
	 */
	public void setSobrenome(String sobrenome) throws Exception {
		if(!Validators.onlyValidchars(sobrenome)) {
			throw new Exception("Não utilize números ou caracteres especiais.");
		}
		this.sobrenome = sobrenome;
	}

	/**
	 * Idade do aluno.
	 */
	public Integer getIdade() {
		return idade;
	}

	/**
	 * Define idade do aluno.
	 * 
	 * Idade em anos. Deve ser um número entre 0 e 130.
	 * @param Integer idade
	 */
	public void setIdade(Integer idade) throws Exception{
		if(idade < 0 || idade > 130) {
			throw new Exception("Idade menor que 0 ou maior que 130");
		}
		this.idade = idade;
	}
}
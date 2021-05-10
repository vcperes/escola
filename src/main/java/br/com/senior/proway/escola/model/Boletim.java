package br.com.senior.proway.escola.model;

import java.util.ArrayList;

/**
 * Reúne as {@link Prova}s de um {@link Aluno}.
 * 
 * O boletim possui uma lista de {@link Prova}s e é referente a um período de um
 * {@link Aluno}. Para cada período é calculada a média das provas que resulta na
 * nota do Boletim.
 * 
 * Correção commit
 * @author Vitor Peres
 * 
 */
public class Boletim {
	private Integer id;
	private Aluno aluno;
	private Integer periodo;
	private Double media;
	private ArrayList<Prova> provas;

	/**
	 * Cria um novo Boletim
	 * 
	 * O Boletim é criado a partir de um aluno e um período. Conforme as provas são adicionadas,
	 * realiza-se o cálculo da média
	 * @param aluno
	 * @param periodo
	 * @param media
	 */
	public Boletim(Aluno aluno, Integer periodo) {
		this.aluno = aluno;
		this.periodo = periodo;
		this.media = 0.0;
		this.provas = new ArrayList<Prova>();
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * Aluno do Boletim.
	 * 
	 * @return Aluno aluno
	 */
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	/**
	 * Período no formato YYYY/mm
	 * @return
	 */
	public Integer getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}
	/**
	 * Retorna media das provas atualizada.
	 * @return
	 */
	public Double getMedia() {
		return media;
	}

	public void setMedia(Double mediaRecebida) {
		this.media = mediaRecebida;
	}
	/**
	 * Retorna todas as provas.
	 * 
	 * @return ArrayList<Prova>
	 */
	public ArrayList<Prova> getProvas() {
		return this.provas;
	}
	
	
	
}

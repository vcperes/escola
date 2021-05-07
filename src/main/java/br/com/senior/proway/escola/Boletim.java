package br.com.senior.proway.escola;

import java.util.ArrayList;

/**
 * Reúne as {@link Prova}s de um {@link Aluno}.
 * 
 * O boletim possui uma lista de {@link Prova}s e é referente a um período de um
 * {@link Aluno}. Para cada período é calculada a média das provas que resulta na
 * nota do Boletim.
 * 
 * @author Vitor Peres
 * 
 */
public class Boletim {
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
	
	/**
	 *Calcula a média ponderada das provas. 
	 */
	public void calcularMedia(){
		
		this.media = 0.0;
		for (Prova prova : provas) {
			this.media += prova.getNota();
		}
		this.setMedia(this.media/provas.size());
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
		this.calcularMedia();
		return media;
	}
	
	public void setMedia(Double mediaRecebida) {
		this.media = mediaRecebida;
	}
	/**
	 * Adiciona uma avaliação ao boletim.
	 * @param prova
	 */
	public ArrayList<Prova> getProvas() {
		return this.provas;
	}
	
	public void addProva(Prova prova) {
		provas.add(prova);
	}
	
	/**
	 * Remove uma avaliação do Boletim.
	 * 
	 * Ao remover a Prova, a média é recalculada.
	 * @param index
	 */
	public void removeProva(int index) {
		provas.remove(index);
	}
	/**
	 * Remove todas as avaliações do Boletim.
	 * 
	 * Ao remover
	 */
	public void removeTodasProvas() {
		provas.clear();
	}

}

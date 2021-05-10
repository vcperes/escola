package br.com.senior.proway.escola.model;

/**
 * A avaliação do desempenho do {@link Aluno} em uma Matéria.
 * 
 * A prova registra uma avaliação realizada pelo {@link Aluno} relativo ao
 * conhecimento de uma matéria. O {@link Aluno} poderá realizar várias
 * avaliações da mesma matéria. A média ponderada das notas das Provas é
 * registrada no {@link Boletim} e verifica se o aluno foi aprovado.
 * 
 * @author senior
 * @see Aluno
 * @see Boletim
 */
public class Prova {

	
	private Integer periodo;
	private Aluno aluno;
	private Materia materia;
	private Double nota;
	
	/**
	 * Avaliação de desempenho do aluno.
	 * 
	 * No contrutor da prova 
	 * @param periodo
	 * @param aluno
	 * @param materia
	 * @param nota
	 * @throws Exception 
	 */
	public Prova(Integer periodo, Aluno aluno, Materia materia){
		this.periodo = periodo;
		this.aluno = aluno;
		this.materia = materia;
		
	}
	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota)throws Exception {
		if(nota < 0.0 || nota > this.materia.notaMaxima) {
			throw new Exception("Nota menor que 0 ou maior que 10.");
		}
		this.nota = nota;
	}

	public Integer getPeriodo() {
		return periodo;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public Materia getMateria() {
		return materia;
	}

}

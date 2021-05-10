package br.com.senior.proway.escola.controller;

import java.util.ArrayList;

import br.com.senior.proway.escola.model.Boletim;
import br.com.senior.proway.escola.model.Prova;

public class BoletimController {
	private Boletim boletim;
	
	public BoletimController (Boletim boletimEntrada) {
		this.boletim = boletimEntrada;
	}
	
	/**
	 * Adiciona uma avaliação ao boletim.
	 * @param prova
	 */
	public void addProva(Prova prova) {
		ArrayList<Prova> provas = boletim.getProvas();
		provas.add(prova);
		this.calcularMedia();
	}
	
	/**
	 *Calcula a média ponderada das provas. 
	 */
	public void calcularMedia(){

		Double total = 0.0;
		for (Prova prova : boletim.getProvas()) {
			total += prova.getNota();
		}
		boletim.setMedia(total/boletim.getProvas().size());
	}
	/**
	 * Remove uma avaliação do Boletim.
	 * 
	 * Ao remover a Prova, a média é recalculada.
	 * @param index
	 */
	public void removeProva(int index) {
		ArrayList<Prova> provas = boletim.getProvas();
		provas.remove(index);
	}
	/**
	 * Remove todas as avaliações do Boletim.
	 * 
	 */
	public void removeTodasProvas() {
		ArrayList<Prova> provas = boletim.getProvas();
		provas.clear();

	}
	
	public Boletim getBoletim() {
		return this.boletim;
	}
	
}

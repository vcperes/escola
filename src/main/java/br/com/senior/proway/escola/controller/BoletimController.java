package br.com.senior.proway.escola.controller;

import java.util.ArrayList;

import br.com.senior.proway.escola.model.Boletim;
import br.com.senior.proway.escola.model.Prova;
import br.com.senior.proway.escola.model.ProvaDAO;

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
		ProvaDAO provaDao = new ProvaDAO(boletim);
		provaDao.add(prova);
		this.calcularMedia();
	}
	
	/**
	 * Remove uma avaliação do Boletim.
	 * 
	 * Ao remover a Prova, a média é recalculada.
	 * @param index
	 */
	public void removeProva(int index) {
			ProvaDAO provaDao = new ProvaDAO(boletim);
			provaDao.remove(index);
	}
	/**
	 * Remove todas as avaliações do Boletim.
	 * 
	 */
	public void removeTodasProvas() {
		ProvaDAO provaDao = new ProvaDAO(boletim);
		provaDao.removeTodas();
	}
	
	public Boletim getBoletim() {
		return this.boletim;
	}
	/**
	 *Calcula a média ponderada das provas. 
	 *
	 *Percorre arraylist de provas, soma todas as notas, divide pelo tamanho da lista
	 *e seta média do resultado.
	 */
	public void calcularMedia(){
		Double total = 0.0;
		for (Prova prova : boletim.getProvas()) {
			total += prova.getNota();
		}
		boletim.setMedia(total/boletim.getProvas().size());
	}
}

package br.com.senior.proway.escola.model;

import java.util.ArrayList;

public class ProvaDAO {
	
	Boletim boletim;
	
	public ProvaDAO(Boletim boletim) {
		this.boletim = boletim;
	}

	public void add(Prova prova) {
		ArrayList<Prova> provas = boletim.getProvas();
		provas.add(prova);
		
	}

	public void remove(int index) {
		try {
			ArrayList<Prova> provas = boletim.getProvas();
			provas.remove(index);	
		}catch(Exception e) {
			System.out.println("Prova não existe, erro: " + e.getMessage());
		}
	}

	public void removeTodas() {
		ArrayList<Prova> provas = boletim.getProvas();
		provas.clear();
	}

	
}

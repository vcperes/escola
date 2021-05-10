package br.com.senior.proway.escola.model;

import java.util.ArrayList;

import br.com.senior.proway.escola.persistence.ArrayListPersistenceBoletim;

public class BoletimDAO {
	
	ArrayListPersistenceBoletim db;

	public BoletimDAO(ArrayListPersistenceBoletim dbBoletim) {
		this.db = dbBoletim;
	}

	public void removeAll() {
		db.removeAll();
	}

	public void remove(Integer index) {
		db.remove(index);	
	}

	public Boletim add(Boletim boletim) {
		return db.add(boletim);
	}
	
	public Boletim get(int index) {
		return db.get(index);
	}
	
	public ArrayList<Boletim> getAll(){
		return db.getAll();
	}


}

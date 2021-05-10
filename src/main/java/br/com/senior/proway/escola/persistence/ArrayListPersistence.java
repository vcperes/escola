package br.com.senior.proway.escola.persistence;

import java.util.ArrayList;

public abstract class ArrayListPersistence<T> {
	

	ArrayList<T> dados;
	
	abstract boolean removeAll();
	
	abstract boolean remove(Integer indexItem);
	
	abstract T add(T item);
	
	abstract T get(Integer index);
	
	abstract ArrayList<T> getAll();

}

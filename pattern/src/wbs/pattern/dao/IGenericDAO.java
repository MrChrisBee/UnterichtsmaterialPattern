package wbs.pattern.dao;

import java.io.Serializable;
import java.util.List;

/*
 * Deklariert Methoden die in geeigneter Weise grundlegende Operationen auf Datenbanken umsetzen (crud: create read update delete)
 * 
 * E typ der entity (Adresse, Lottoschen, ...)
 * P typ des primary key
 * 
 * Returntype nicht benötigt wir werfen hier unchecked Exceptions
 */


public interface IGenericDAO<P,E extends Serializable> {
	public void save(E entity);
	public void delete(E entity);
	public void update(E entity);
	public E findById(P primaryKey);
	public List<E> findAll();
}
 
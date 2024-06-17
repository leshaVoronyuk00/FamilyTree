package ru.GeekBrains.Voronyuk00.Family;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/**
 * Класс для создания семейного дерева
 */
public class FamilyTree implements Serializable, Iterable<Human>{
	
	private List<Human> familyList;
	private int humansId;
	/**
	 * Конструктор для создания семейного дерева
	 */
	public FamilyTree(){
		familyList = new ArrayList<>();
	}
	
	public void addPerson(Human h) {
		 if(!familyList.contains(h)) {
			familyList.add(h);
			h.setId(humansId++);
		 }
			
	}
	
	public void setWidding(int id1, int id2) {
		
		if(checkId(id1) && checkId(id2)) {
			if(getById(id1).getSpouse() == null && getById(id2).getSpouse() == null) {
				getById(id1).setSpouse(getById(id2));
				getById(id2).setSpouse(getById(id2));
			}
		}else {
			return;
		}
	}
	
	/**
	 * 
	 * @param name имя человека
	 * @param surname фамилия человека
	 * @return информация о человеке
	 */
	public Human searchPerson(String name, String surname) {
		for(Human h : familyList) {
			if(h.getName().equalsIgnoreCase(name) && h.getSurname().equalsIgnoreCase(surname)) {
				return h;
			}
		}
		return null;
		
	}
	
	public Human getById(int id) {
		for(Human h : familyList) {
			if(h.getId() == id) {
				return h;
			}
		}
		return null;
	}
	
	private boolean checkId(int id) {
		return id>= 0 && id < humansId;
	}
	
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == this) {
			return true;
		}
		if(!(obj instanceof Human)) {
			return false;
		}
		Human human = (Human) obj;
		return human.getId() != humansId;
	}
	
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		for(Human h : familyList) {
			str.append(h);
			str.append("\n");
		}
		return str.toString();
		
	}

	@Override
	public Iterator<Human> iterator() {
		// TODO Auto-generated method stub
		return new FamilyTreeIterator(familyList);
	}
	
	public void sortByName() {
		Collections.sort(familyList);
	}
	
	public void sortByBirthDate() {
		Collections.sort(familyList ,new HumanComparatorByBirthDate());
	}
	
	
}

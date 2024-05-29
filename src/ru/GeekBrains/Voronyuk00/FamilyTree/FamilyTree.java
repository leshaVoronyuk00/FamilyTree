package ru.GeekBrains.Voronyuk00.FamilyTree;

import java.util.ArrayList;
import java.util.List;
/**
 * Класс для создания семейного дерева
 */
public class FamilyTree {
	
	private List<Human> familyList;
	/**
	 * Конструктор для создания семейного дерева
	 */
	public FamilyTree(){
		familyList = new ArrayList<>();
	}
	
	public void addPerson(Human h) {
		familyList.add(h);
	}
	/**
	 * 
	 * @param name имя человека
	 * @param surname фамилия человека
	 * @return информация о человеке
	 */
	public void searchPerson(String name, String surname) {
		boolean hasPerson = false;
		for(Human h : familyList) {
			if(h.getName().equalsIgnoreCase(name) && h.getSurname().equalsIgnoreCase(surname)) {
				System.out.println(h);
				hasPerson = true;
			}
		}
		if(!hasPerson) {
			System.out.print("Такого человека нет");
		}
	}
}


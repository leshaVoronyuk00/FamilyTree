package ru.GeekBrains.Voronyuk00.FamilyTree;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
/**
 * Класс для создания человека
 */
public class Human {
	
	private String name;
	private String surname;
	private LocalDate dob, dod;
	Gender gender;
	List<Human> children;
	Human father, mother;
	/**
	 * Конструктор для создания человека
	 * @param name - имя человека
	 * @param surname - фамилия человека
	 * @param year - год рождения человека
	 * @param month - месяц рождения человека
	 * @param day - день рождения человека
	 * @param gender - пол человека
	 */
	Human(String name, String surname, int year, int month,int day,Gender gender){
		this.name = name;
		this.surname = surname;
		this.dob = LocalDate.of(year, month, day);
		this.gender = gender;
		children = new ArrayList<>();
	}
	/**
	 * Конструктор для создания человека
	 * @param name - имя человека
	 * @param surname - фамилия человека
	 * @param year - год рождения человека
	 * @param month - месяц рождения человека
	 * @param day - день рождения человека
	   @param year2 - год смерти человека
	 * @param month2 - месяц смерти человека
	 * @param day2 - день смерти человека
	 * @param gender - пол человека
	 */
	Human(String name, String surname, int year, int month,int day,int year2, int month2, int day2,Gender gender){
		this.name = name;
		this.surname = surname;
		this.dob = LocalDate.of(year, month, day);
		this.dod = LocalDate.of(year2, month2, day2);
		this.gender = gender;
		children = new ArrayList<>();
	}
	
	/**
	 * Метод для получения имени
	 * @return имя
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * Метод для получения фамилии
	 * @return фамилия
	 */
	public String getSurname() {
		return this.surname;
	}
	
	/**
	 * Добавление матери человека
	 * @param h - мать человека
	 */
	public void addMother(Human h) {
		this.mother = h;
	}
	/**
	 * Добавление отца человека
	 * @param h - отец человека
	 */
	public void addFather(Human h) {
		this.father = h;
	}
	/**
	 * Метод для вывода матери человека
	 * @return мать человека
	 */
	public Human showMother() {
		return this.mother;
	}
	/**
	 * Метод для вывода отца человека
	 * @return отец человека
	 */
	public Human showFather() {
		return this.mother;
	}
	/**
	 * Метод для получения возраста
	 * @return возраст
	 */
	public int getAge() {
		if(dod == null) {
			return Period.between(this.dob, LocalDate.now()).getYears(); 
		}
		else {
			return Period.between(dob, dod).getYears();
		}
	}
	
	public Gender getGender() {
		return this.gender;
	}
	
	/**
	 * Метод для добавления ребенка
	 * @param child - добавляемый ребёнок
	 */
	public void addChild(Human child) {
		children.add(child);
	}
	/**
	 * Метод для демонстрации детей
	 */
	public void showChildren() {
		boolean hasChildren = false;
		for(Human h : children) {
			System.out.println(h);
			hasChildren = true;
		}
		
		if(!hasChildren) {
			System.out.println("Нет детей");
		}
	}
	@Override
	public String toString() {
		return "Имя = " + name + ", фамилия = " + surname + ", дата рождения = " + dob  + ", пол = " + gender ;
	}
	
	
	
	
}

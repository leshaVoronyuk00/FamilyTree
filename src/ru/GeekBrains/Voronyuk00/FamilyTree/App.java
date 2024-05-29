package ru.GeekBrains.Voronyuk00.FamilyTree;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human person1  = new Human("Анна", "Воронюк",1971,7,29,Gender.female);
		Human person2 = new Human("Евгений","Воронюк",1967,5,9,Gender.male);
		Human person3 = new Human("Алексей","Воронюк",2000,4,12,Gender.male);
		Human person4 = new Human("Марина", "Воронюк",2000,10,5,Gender.female);
		Human person5 = new Human("Галина","Агафонова", 1940,8,14,2017,9,11,Gender.female);
		
		// Создание семейного дерева
		FamilyTree familyList = new FamilyTree();
		familyList.addPerson(person1);
		familyList.addPerson(person2);
		familyList.addPerson(person3);
		familyList.addPerson(person4);
		familyList.addPerson(person5);
		
		person1.addChild(person3);
		person1.addChild(person4);
		person2.addChild(person3);
		person2.addChild(person4);
		
		person3.addFather(person1);
		person3.addMother(person2);
		person4.addFather(person1);
		person4.addMother(person2);
		person1.addMother(person5);
		
		System.out.println(person5 + " Возраст " + person5.getAge());
		
		person5.addChild(person1);
		person5.showChildren();
		
		familyList.searchPerson("Алексей","Воронюк");
		familyList.searchPerson("Иван","Высоцкий");
		
		
	}

}

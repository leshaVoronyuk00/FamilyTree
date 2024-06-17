package ru.GeekBrains.Voronyuk00.Family;

import java.util.Comparator;

public class HumanComparatorByBirthDate implements Comparator<Human>{

	@Override
	public int compare(Human o1, Human o2) {
		// TODO Auto-generated method stub
		return o1.getBirthDate().compareTo(o2.getBirthDate());
	}
	
}

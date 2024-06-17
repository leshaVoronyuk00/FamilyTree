package ru.GeekBrains.Voronyuk00.Family;

import java.util.Iterator;
import java.util.List;

public class FamilyTreeIterator implements Iterator<Human>{

	private int familyId;
	private List<Human> familyList;
	
	public FamilyTreeIterator(List<Human> familyList) {
		this.familyList = familyList;
	}
	@Override
	public boolean hasNext() {
		return familyList.size() > familyId;
	}

	@Override
	public Human next() {
		// TODO Auto-generated method stub
		return familyList.get(familyId++);
	}
	

}

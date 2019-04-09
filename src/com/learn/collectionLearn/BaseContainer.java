package com.learn.collectionLearn;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Set HashSet存的内容，没有顺序，不可重复
 * 
 * @author Admin
 *
 */
public class BaseContainer {

	public static void main(String[] args) {
		Collection c = new HashSet();
		c.add("hello");
		c.add(new String("股票"));
		c.add(new Integer(100));
		c.add(100);
		c.remove("hello");
		Iterator i = c.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			System.out.println(o);
		}
		System.out.println(c.size());
		System.out.println(c);
		
		System.out.println("-------------------------------");
		
		List l1 = new LinkedList();
		l1.add(new Name("Karl","M"));
		l1.add(new Name("Steven","Lee"));
		l1.add(new Name("John","O"));
		l1.add(new Name("Tom","M"));
		System.out.println(l1);
		Collections.sort(l1);
		System.out.println(l1);
	}
}


@SuppressWarnings("rawtypes")
class Name implements Comparable {

	private String firstName;
	private String lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String toString() {
		return firstName + " " + lastName;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Name) {
			Name name = (Name) obj;
			return (firstName.equals(name.firstName) && lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}

	public int hashCode() {
		return firstName.hashCode();
	}

	@Override
	public int compareTo(Object o) {
		Name n = (Name) o;
		int lastCmp = lastName.compareTo(n.lastName);
		return (lastCmp != 0 ? lastCmp : firstName.compareTo(n.firstName));
	}

}

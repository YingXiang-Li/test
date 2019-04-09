package com.learn.collectionLearn;

import java.util.ArrayList;
import java.util.Collection;

/**
 * List 存的内容，有顺序，可重复
 * 
 * @author Admin
 *
 */
public class ListTest {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("hello");
		c.add(new String("股票"));
		c.add(new Integer(100));
		System.out.println(c.size());
		System.out.println(c);
	}
}

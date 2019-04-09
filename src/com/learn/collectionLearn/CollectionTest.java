package com.learn.collectionLearn;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合的使用
 * 
 * @author Admin
 *
 */
public class CollectionTest {

	public static void main(String[] args) {
		// 使用父类的引用指向子类的对象
		Collection c = new ArrayList();
		//可以放入不同类型的对象
		c.add("hello");
		c.add(new Integer(100));
		c.add(100);
		System.out.println(c.size());
		System.out.println(c);
	}

}

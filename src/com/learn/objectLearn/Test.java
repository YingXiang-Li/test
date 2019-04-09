package com.learn.objectLearn;

public class Test {

	public static void main(String[] args) {
		A a = new A(1);
		Object o = new A(1);
		System.out.println(o.toString());
		System.out.println(a.toString());
		System.out.println(a.equals(o));
	}
}

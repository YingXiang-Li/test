package com.main;
public class Order {
	public static String order(String words) {
		String[] ws = words.split(" ");
		String newString = "";
		for (int i = 1; i <= ws.length; i++) {
			for (int j = 0; j <= ws.length - 1; j++) {
				if (ws[j].contains(String.valueOf(i))) {
					newString += ws[j];
					if (i != ws.length) {
						newString += " ";
					}
					break;
				}
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.println(Order.order("is2 Thi1s T4est 3a"));
		System.out.println(Order.order("4of Fo1r pe6ople g3ood th5e the2"));
	}
}
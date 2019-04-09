package com.learn.control;

public class BreakTest {

	public static void main(String[] args) {
		Object obj = new Object();
		boolean flag = true;
		first: {
			second: {
				third: {
					System.out.println("这是第三层！执行break之前");
					if (flag) {
						break second;
					}
					System.out.println("这里不会被执行！");
				}
				System.out.println("这里是第二层，也不会被执行！");
			}
			System.out.println("这是第一层！");
		}
	}
}

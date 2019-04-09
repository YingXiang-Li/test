package com.learn.array;

/**
 * 一维数组和二维数组
 * 
 * @author Administrator
 *
 */
public class TestArray {

//	int b[3];  //非法定义数组
	int[] a = { 1, 2, 3 }; // 一维数组的定义
	int[] b = new int[5]; // 正确定义
	int[] c; // 声明但没有定义

	int[][] array = { { 1, 2 }, { 3, 4 }, { 5, 6 } };// 二维数组的定义
	//合法
	int[][] y = new int[3][];

	//非法定义
//	int[][] z = new int[][3];

	public static void main(String[] args) {

		int[] a = { 2, 4, 6, 7, 3, 5, 1, 9, 8 };

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ";");
		}
		System.out.println();
		System.out.println("-----------");
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i] + ",");
		}
	}
}

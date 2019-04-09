package com.learn.array;

/**
 * 一维数组排序
 * 
 * @author liyingxiang
 *
 */
public class NumberSort {

	public static void main(String[] args) {

		int[] b = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			b[i] = Integer.parseInt(args[i]);
		}

		int[] a = { 2, 4, 6, 7, 3, 5, 1, 9, 8 };
		
		System.out.println(a.length);
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i];
		}
		print(a);
		selectionSort(a);
		// betterSelectionSort(a);
		print(a);
	}

	private static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "；");
		}
		System.out.println();
	}

	/*
	 * 优化后的选择排序(每次内循环只做一次交换，效率比普通选择排序快)
	 */
	public static void betterSelectionSort(int[] a) {
		int k;
		int temp;
		for (int i = 0; i < a.length; i++) {
			k = i;
			for (int j = k + 1; j < a.length; j++) {
				if (a[j] < a[k]) {
					k = j;
				}
			}
			if (k != i) {
				temp = a[i];
				a[i] = a[k];
				a[k] = temp;
			}
		}
	}

	/*
	 * 从小到大，选择排序(最慢，每次内循环有可能有多次交换，所以效率慢)
	 */
	private static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	/*
	 * 冒泡排序
	 */
	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				int temp;
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

}

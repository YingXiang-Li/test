package com.learn.array;

public class TestSearch {
	public static void main(String[] args) {
		int a[] = { 1, 3, 6, 8, 9, 10, 12, 18, 20, 35 };
		int i = 12;
		int b = binarySearch(a, i);
		System.out.println(b);
	}

	/**
	 * 普通查找
	 * 
	 * @param a
	 * @param num
	 * @return
	 */
	public static int search(int[] a, int num) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == num)
				return i;
		}
		return -1;
	}

	/**
	 * 二分法查找
	 * 
	 * @param a
	 * @param num
	 * @return
	 */
	public static int binarySearch(int[] a, int num) {
		if (a.length == 0) {
			return -1;
		}

		int startPos = 0;
		int endPos = a.length - 1;
		int m = (startPos + endPos) / 2;
		while (startPos <= endPos) {
			if (num == a[m]) {
				return m;
			}
			if (num > a[m]) {
				startPos = m + 1;
			}
			if (num < a[m]) {
				endPos = m - 1;
			}
			m = (startPos + endPos) / 2;
		}
		return -1;
	}
}

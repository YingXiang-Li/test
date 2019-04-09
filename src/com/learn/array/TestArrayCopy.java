package com.learn.array;

/**
 * 数组的拷贝
 * 
 * @author Admin
 *
 */
public class TestArrayCopy {

	public static void main(String[] args) {
		String[] s = { "小李", "小明", "小东" };
		String[] sCopy = new String[6];
		//数组的复制
		System.arraycopy(s, 0, sCopy, 0, s.length);

		for (int i = 0; i < sCopy.length; i++) {
			System.out.println(sCopy[i] + ";");
		}
	}

}

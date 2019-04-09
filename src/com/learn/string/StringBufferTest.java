package com.learn.string;

public class StringBufferTest {

	public static void main(String[] args) {
		String s = "Mircosoft";
		char[] c = { 'a', 'b', 'c' };
		StringBuffer sb = new StringBuffer(s);
		sb.append('/').append("IBM").append('/').append("Sun");
		System.out.println(sb);

		StringBuffer sb2 = new StringBuffer("数字");
		for (int i = 0; i <= 9; i++) {
			sb2.append(i);
		}
		System.out.println(sb2);
		sb2.delete(8, sb2.length()).insert(0, c);
		System.out.println(sb2);
		System.out.println(sb2.reverse());//字符串调换
	}
}

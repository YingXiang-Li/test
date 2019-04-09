package com.learn.string;

public class StringTest {

	public static void main(String[] args) {

//		String studentName = "小东";
//		String name = new String("小东");

		/*
		 * 查看一串字符串的大写字母个数、小写字母个数和其他字母个数。
		 */
		String s = "AAaaaBBdfaad&*%#@%daffsadCokkOFA98652379_hA";
		int lowCount = 0, uCount = 0, otherCount = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				lowCount++;
			} else if (c >= 'A' && c <= 'Z') {
				uCount++;
			} else {
				otherCount++;
			}
		}
		System.out.println("小写字母：" + lowCount + "个；大写字母：" + uCount + "；其他字符：" + otherCount);

		/*
		 * 求此字符串中java字符串出现的次数
		 */
		String myStr = "sunjavahpppjavaokjavaphpjavaraerncladfaoljava";
		String sToFind = "java";
		int count = 0;
		// 第一次出现java的位置
		int index = myStr.indexOf(sToFind);
		if (index != -1) {
			count++;
		} else {

		}

		myStr = myStr.substring(index + sToFind.length());// 截取除了第一次出现java字符串后面的字符串

		while (myStr.indexOf(sToFind) != -1) {
			index = myStr.indexOf(sToFind);
			myStr = myStr.substring(index + sToFind.length());
			count++;
		}

		System.out.println(count);
		
		

	}

}

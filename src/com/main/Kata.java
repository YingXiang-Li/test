package com.main;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.regex.Pattern;

public class Kata {
	public static int TripleDouble(long num1, long num2) {
		char[] n1 = String.valueOf(num1).toCharArray();
		char[] n2 = String.valueOf(num2).toCharArray();
		char t = 0;
		int count1 = 0;
		for (int i = 0; i <= n1.length - 1; i++) {
			if (n1[i] != t) {
				if (count1 == 3) {
					break;
				}
				count1 = 1;
				t = n1[i];
			} else {
				count1++;
			}
		}
		int count2 = 0;
		for (int i = 0; i <= n2.length - 1; i++) {
			if (n2[i] != t) {
				if (count2 == 2) {
					break;
				}
				count2 = 1;
				t = n2[i];
			} else {
				count2++;
			}
		}
		if (count1 == 3 && count2 == 2) {
			return 1;
		} else {
			return 0;
		}
	}

	public static int getLengthOfMissingArray(Object[][] arrayOfArrays) {
		if (arrayOfArrays == null || arrayOfArrays.length == 0 || arrayOfArrays[0] == null
				|| arrayOfArrays[0].length == 0) {
			return 0;
		}
		int min = arrayOfArrays[0].length;
		for (int i = 1; i <= arrayOfArrays.length - 1; i++) {
			if (arrayOfArrays[i] == null || arrayOfArrays[i].length == 0) {
				return 0;
			}
			if (min > arrayOfArrays[i].length) {
				min = arrayOfArrays[i].length;
			}
		}
		int index = min;
		boolean h = false;
		while (true) {
			h = false;
			for (int i = 0; i <= arrayOfArrays.length - 1; i++) {
				if (arrayOfArrays[i].length == index) {
					h = true;
					index++;
					break;
				}
			}
			if (!h) {
				break;
			}
		}
		return index;
	}

	public static boolean validPhoneNumber(String phoneNumber) {
		String pattern = "^\\((\\d{3})\\) (\\d{3})-(\\d{4})$";
		return Pattern.matches(pattern, phoneNumber);
	}

	public static double findUniq(double arr[]) {
		boolean isUniq = true;
		for (int i = 0; i <= arr.length - 1; i++) {
			isUniq = true;
			for (int j = 0; j <= arr.length - 1; j++) {
				if (i == j) {
					continue;
				}
				if (arr[i] == arr[j]) {
					isUniq = false;
					break;
				}
			}
			if (isUniq) {
				return arr[i];
			}
		}
		return 0;
	}

	public static String encrypt(final String text, final int n) {
		if(text==null||text==""){
			return text;
		}
		StringBuffer sb = new StringBuffer(text);
		char[] d;
		for (int i = 0; i <= n - 1; i++) {
			d = sb.toString().toCharArray();
			sb = new StringBuffer();
			for (int j = 1; j <= d.length - 1; j += 2) {
				sb.append(d[j]);
			}
			for (int j = 0; j <= d.length - 1; j += 2) {
				sb.append(d[j]);
			}
		}
		return sb.toString();
	}

	public static String decrypt(final String encryptedText, final int n) {
		if(encryptedText==null||encryptedText==""){
			return encryptedText;
		}
		StringBuffer sb = new StringBuffer(encryptedText);
		char[] d;
		for (int i = 0; i <= n - 1; i++) {
			d = sb.toString().toCharArray();
			sb = new StringBuffer();
			int index = d.length / 2;
			for (int j = index; j <= d.length - 1; j++) {
				sb.append(d[j]);
				if (j - index < index) {
					sb.append(d[j - index]);
				}
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(Kata.encrypt(null, 0));
		System.out.println(Kata.decrypt(null, 0));
		// System.out.println(Kata.validPhoneNumber("(1111)555 2345"));
		// System.out.println(Kata.validPhoneNumber("(098) 123 4567"));

	}
}

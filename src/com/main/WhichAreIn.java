package com.main;
import java.util.ArrayList;
import java.util.Arrays;

public class WhichAreIn {
	public static String[] inArray(String[] array1, String[] array2) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i <= array1.length - 1; i++) {
			for (int j = 0; j <= array2.length - 1; j++) {
				if (array2[j].contains(array1[i])) {
					list.add(array1[i]);
					break;
				}
			}
		}
		list.sort(null);
		return list.toArray(new String[0]);
	}

	public static void main(String[] args) {
		String a[] = new String[] { "arp", "live", "strong" };
		String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
		System.out.println(Arrays.toString(inArray(a, b)));
	}
}

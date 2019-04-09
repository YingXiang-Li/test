package com.main;
public class DuplicateEncoder {
	static String encode(String word) {
		char[] w = word.toCharArray();
		String a = "";
		String b="";
		for (int i = 0; i <= w.length - 1; i++) {
			String t=String.valueOf(w[i]).toLowerCase();
			if(a.contains(t)){
				b+=t;
			}else{
				a+=t;
			}
		}
		String newString="";
		for (int i = 0; i <= w.length - 1; i++) {
			String t=String.valueOf(w[i]).toLowerCase();
			if(b.contains(t)){
				newString+=")";
			}else{
				newString+="(";
			}
		}
		return newString;
	}

	public static void main(String[] args) {
		System.out.println(encode("din"));
		System.out.println(encode("recede"));
		System.out.println(encode("Success"));
		System.out.println(encode("(( @"));
	}
}

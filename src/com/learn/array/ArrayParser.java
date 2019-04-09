package com.learn.array;

/*
 * 数组解析器，二维数组遍历
 */
public class ArrayParser {

	public static void main(String[] args) {
		double[][] array;
		String a = "1,2;3,4,5;6,7,8";
		String[] first = a.split(";");
		array = new double[first.length][];
		
		for (int i = 0; i < first.length; i++) {
			System.out.println(first[i]);
			String[] second = first[i].split(",");
			array[i] = new double[second.length];
			
			for (int j = 0; j < second.length; j++) {
				array[i][j] = Double.parseDouble(second[j]);
				System.out.println(second[j]);
			}
		}
		
		System.out.println("---------分割线---------");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+"；");
			}
			System.out.println();
		}
	}
}

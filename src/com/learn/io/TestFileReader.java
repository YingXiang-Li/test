package com.learn.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	public static void main(String[] args) {
		FileReader fr = null;
		int c = 0;
		try {
			fr = new FileReader("D:\\eclipse-workspace\\test\\src\\com\\learn\\io\\TestFileReader.java");
			while ((c = fr.read()) != -1) {
				System.out.print(((char) c));
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("找不到文件！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

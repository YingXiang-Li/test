package com.learn.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("D:\\eclipse-workspace\\test\\TestFileWriter.java");
			for (int c = 0; c <= 500; c++) {
				fw.write(c);
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件写入错误！");
			System.exit(-1);
		}
	}
}

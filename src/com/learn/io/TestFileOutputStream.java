package com.learn.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {

	public static void main(String[] args) {
		int b = 0;
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("D:\\eclipse-workspace\\test\\src\\com\\learn\\io\\TestFileOutputStream.java");
			out = new FileOutputStream("D:\\eclipse-workspace\\test\\TestFileOutputStream.java");
			while ((b = in.read()) != -1) {
				out.write(b);
			}
			in.close();
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("找不到指定文件！");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("文件复制错误！");
			e.printStackTrace();
		}
		System.out.println("文件已复制！");
	}
}

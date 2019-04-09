package com.learn.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 按字节读、写：InputStream、OutputStream 按字符（两个字节、主要用于文字）读、写：Reader、Writer
 * 
 * @author Admin
 */
public class TestFileInputStream {

	public static void main(String[] args) {
		
		int b = 0;
		FileInputStream in = null;
		try {
			in = new FileInputStream("D:\\eclipse-workspace\\test\\src\\com\\learn\\io\\TestFileInputStream.java");
		} catch (FileNotFoundException e) {
			System.out.println("找不到指定文件！");
			System.exit(-1);
			e.printStackTrace();
		}

		try {
			long num = 0;
			// (b = in.read()) != -1 代表文件未读到结尾
			while ((b = in.read()) != -1) {
				System.out.print((char) b);
				num++;
			}
			in.close();
			System.out.println();
			System.out.println("共读取了" + num + "个字节！");
		} catch (IOException e) {
			System.out.println("文件读取错误！");
			System.exit(-1);
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				System.out.println("关闭资源有误！");
				e.printStackTrace();
			}
		}

	}
}

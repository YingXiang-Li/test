package com.learn.file_test;

import java.io.File;
import java.io.IOException;

/**
 * 文件File测试
 * @author Admin
 *
 */
public class FileTest {

	public static void main(String[] args) {
		String separator = File.separator;
		String fileName = "myfile.txt";
		String directory = "mydir1" + separator + "mydir2";
		File f = new File(directory, fileName);
		if (f.exists()) {
			System.out.println("文件名：" + f.getAbsolutePath());
			System.out.println("文件大小：" + f.length());
		} else {
			//创建在路径中的一系列目录
			f.getParentFile().mkdirs();
			try {
				//通过file对象创建空文件或目录
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

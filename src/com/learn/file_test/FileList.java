package com.learn.file_test;

import java.io.File;

/**
 * 递归打印文件目录下的所有目录列表和文件
 * 
 * @author Admin
 *
 */
public class FileList {

	public static void main(String[] args) {
		File f = new File("D:/eclipse-workspace/test/A");
		System.out.println(f.getName());
		treeFile(f, 1);
	}

	private static void treeFile(File f, int level) {

		//文件夹的层次
		String preStr = "";
		for (int i = 0; i < level; i++) {
			preStr += "     ";
		}

		File[] childs = f.listFiles();
		for (int i = 0; i < childs.length; i++) {
			System.out.println(preStr + childs[i].getName());
			if (childs[i].isDirectory()) {
				treeFile(childs[i], level + 1);
			}
		}
	}
}

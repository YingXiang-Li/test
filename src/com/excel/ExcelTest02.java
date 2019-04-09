package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;


public class ExcelTest02 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			FileInputStream is1 = new FileInputStream("E:\\workspaceLiYingXiang\\test\\file\\文件1.xls");
			FileInputStream is2 = new FileInputStream("E:\\workspaceLiYingXiang\\test\\file\\文件2.xls");

			HSSFWorkbook workbook1 = new HSSFWorkbook(is1);
			HSSFSheet sheet1 = workbook1.getSheetAt(0);
			
			HSSFWorkbook workbook2 = new HSSFWorkbook(is2);
			HSSFSheet sheet2 = workbook2.getSheetAt(0);
			
			for(int i=1; i<=sheet1.getLastRowNum(); i++){
				Row row1 = sheet1.getRow(i);
				boolean flag = false;
				for(int a=0; a<=sheet2.getLastRowNum(); a++){
					Row row2 = sheet2.getRow(a);
					String targetStr = row2.getCell(1).toString();
					if(row1.getCell(0).toString().equals(targetStr)){
						flag = true;
						break;
					}
				}
				if(!flag){
					sheet1.removeRow(row1);
				}
			}
			
			FileOutputStream os = new FileOutputStream("E:\\workspaceLiYingXiang\\test\\file\\two.xls");
			os.flush();
			workbook1.write(os);
			is1.close();
			is2.close();
			os.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("操作成功！");
	}
}

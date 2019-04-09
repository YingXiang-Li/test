package com.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;


public class ExcelTest01 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		try {
			FileInputStream is = new FileInputStream("E:\\workspaceLiYingXiang\\test\\file\\文件1.xls");
			
			HSSFWorkbook workbook = new HSSFWorkbook(is);
			HSSFSheet sheet = workbook.getSheetAt(0);
			
			System.out.println("总行数："+sheet.getLastRowNum()+1);
			
			for(int i=0; i<=sheet.getLastRowNum(); i++){
				Row row = sheet.getRow(i);
				for(int j=0;j<row.getLastCellNum(); j++ ){
					if(row.getCell(j).toString().equals("0.0")){
						System.out.println("第"+(i+1)+"行，第"+(j+1)+"列");
						sheet.removeRow(row);
						break;
					}
				}		
			}
			FileOutputStream os = new FileOutputStream("E:\\workspaceLiYingXiang\\test\\file\\ceshi.xls");
			os.flush();
			workbook.write(os);
			is.close();
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("操作成功！");
	}
}

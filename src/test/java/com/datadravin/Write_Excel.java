package com.datadravin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Excel {
	public static void main(String[] args) throws IOException {
		
File f = new File(".\\Excel\\book1.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb=new XSSFWorkbook();
		Sheet createSheet = wb.createSheet("July_Student");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("Project Batch");
	
		
		wb.getSheet("July_Student").createRow(1);
		wb.getSheet("July_Student").createRow(2);
		wb.getSheet("July_Student").createRow(3);
		wb.getSheet("July_Student").createRow(4);
				
		wb.getSheet("July_Student").getRow(1).createCell(0).setCellValue("vinoth");
		wb.getSheet("July_Student").getRow(2).createCell(0).setCellValue("rajesh");
		wb.getSheet("July_Student").getRow(3).createCell(0).setCellValue("kumar");
		wb.getSheet("July_Student").getRow(4).createCell(0).setCellValue("vicky");
		
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
				
				
				
	}

}

package com.file.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class WriteFileTest {
	public static void main(String args[]){
		txtMethod();
		pdfMethod();
		wordMethod();
		excelMethod();
	}
	public static void txtMethod(){
		try{
			FileOutputStream fout=new FileOutputStream("D:\\JavaWrite\\testout.txt");    
            String s="Welcome to javaTpoint hey bro there is nothing to do.";    
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);    
            fout.close();    
            System.out.println("createparagraph.txt written successfully");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void pdfMethod(){
		
	      try
	      {
	    	  Document document = new Document();
	         PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("D:\\JavaWrite\\HelloWorld.pdf"));
	         document.open();
	         document.add(new Paragraph("A Hello World PDF document. It have more than enough."));
	         document.close();
	         writer.close();
	         System.out.println("createparagraph.pdf written successfully");
	      } catch (DocumentException e)
	      {
	         e.printStackTrace();
	      } catch (FileNotFoundException e)
	      {
	         e.printStackTrace();
	      }
	}
	public static void wordMethod(){
		
		try{
			XWPFDocument document= new XWPFDocument(); 
		      //Write the Document in file system
		      FileOutputStream out = new FileOutputStream(new File("createparagraph.docx"));
		        
		      //create Paragraph
		      XWPFParagraph paragraph = document.createParagraph();
		      XWPFRun run=paragraph.createRun();
		      run.setText("At tutorialspoint.com, we strive hard to " +
		         "provide quality tutorials for self-learning " +
		         "purpose in the domains of Academics, Information " +
		         "Technology, Management and Computer Programming Languages.");
		         
					
		      document.write(out);
		      out.close();
		      System.out.println("createparagraph.docx written successfully");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void excelMethod(){
		try{
			XSSFWorkbook workbook = new XSSFWorkbook();
	        XSSFSheet sheet = workbook.createSheet("Java Books");
	         
	        Object[][] bookData = {
	                {"Head First Java", "Kathy Serria", 79},
	                {"Effective Java", "Joshua Bloch", 36},
	                {"Clean Code", "Robert martin", 42},
	                {"Thinking in Java", "Bruce Eckel", 35},
	        };
	 
	        int rowCount = 0;
	         
	        for (Object[] aBook : bookData) {
	            Row row = sheet.createRow(++rowCount);
	             
	            int columnCount = 0;
	             
	            for (Object field : aBook) {
	                Cell cell = row.createCell(++columnCount);
	                if (field instanceof String) {
	                    cell.setCellValue((String) field);
	                } else if (field instanceof Integer) {
	                    cell.setCellValue((Integer) field);
	                }
	            }
	             
	        }
	         
	         
	        try (FileOutputStream outputStream = new FileOutputStream("D:\\JavaWrite\\JavaBooks.xlsx")) {
	            workbook.write(outputStream);
	        }
	        System.out.println("createparagraph.xlsx written successfully");
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}

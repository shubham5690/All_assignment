package com.app.WordFileReaders;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;




public class WordFileReader {
	public static void main(String[] args) throws IOException {
		//read the file
        FileInputStream fis = new FileInputStream("target//sample.docx");
     // create an XWPFDocument object from the file input stream
        XWPFDocument doc = new XWPFDocument(fis);
     // iterate over the paragraphs in the document
        for (XWPFTable tbl : doc.getTables()) {
            for (XWPFTableRow row : tbl.getRows()) {
            	
                for (XWPFTableCell cell : row.getTableCells()) {
                    String text = cell.getText();
                    
                    System.out.print(text + "\t");
                }
               
                System.out.println();
            }
        }
        doc.close();
    }


}

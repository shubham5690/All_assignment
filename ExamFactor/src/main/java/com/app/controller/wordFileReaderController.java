package com.app.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFPictureData;
import org.apache.poi.xwpf.usermodel.XWPFTable;
import org.apache.poi.xwpf.usermodel.XWPFTableCell;
import org.apache.poi.xwpf.usermodel.XWPFTableRow;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class wordFileReaderController {

	@GetMapping("/")
	public String showTableData(Model model) throws IOException {
        FileInputStream fis = new FileInputStream("target//sample.docx");
        XWPFDocument doc = new XWPFDocument(fis);
        List<List<String>> tableData = new ArrayList<>();
        for (XWPFTable tbl : doc.getTables()) {
            for (XWPFTableRow row : tbl.getRows()) {
                List<String> rowData = new ArrayList<>();
               for (XWPFTableCell cell : row.getTableCells()) {
                    rowData.add(cell.getText());
                }
                tableData.add(rowData);
            }
        }
        model.addAttribute("tableData", tableData);
        doc.close();
       return "index";
    }
	
	
	
	

}

package com.aitew.Manager.controller;

import java.awt.print.Book;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintException;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.ServiceUI;
import javax.print.SimpleDoc;
import javax.print.attribute.DocAttributeSet;
import javax.print.attribute.HashDocAttributeSet;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.Sides;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPrintable;
import org.apache.pdfbox.printing.Scaling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/print")
public class PrintContoller {
	
//打印入党申请人基础信息
	@RequestMapping("/base_details")
	public void printWord( String name) {
		DocFlavor flavor = DocFlavor.INPUT_STREAM.AUTOSENSE;
		PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
		PrintService []pservices = PrintServiceLookup.lookupPrintServices(flavor, aset);
		PrintService defaultService = PrintServiceLookup.lookupDefaultPrintService();
		PrintService service = ServiceUI.printDialog(null, 200, 200, pservices,
		defaultService, flavor, aset);
		if(service != null){
		try {
		DocPrintJob pj =service.createPrintJob();
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\"+name);//打印文档。"
		DocAttributeSet das = new HashDocAttributeSet();
		Doc doc = new SimpleDoc(fis, flavor, das);
		pj.print(doc, aset);
		} catch (FileNotFoundException fe) {
		fe.printStackTrace();
		} catch (PrintException e) {
		e.printStackTrace();
		}
		}else {
		System.out.println("打印失败");
		}
	}

 
}

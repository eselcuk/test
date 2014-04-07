/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.essa;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFRow;
 
public class ReadExcel {
 
    public static void main( String [] args ) {
        try {
    
             InputStream input = new BufferedInputStream(
                        new FileInputStream("sample.xls"));
            POIFSFileSystem fs = new POIFSFileSystem( input );
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            HSSFSheet sheet = wb.getSheetAt(0);
             
             
            Iterator rows = sheet.rowIterator();
            while( rows.hasNext() ) {  
                HSSFRow row = (HSSFRow) rows.next();
                System.out.println("\n");
                Iterator cells = row.cellIterator();
                while( cells.hasNext() ) {
                     
                    HSSFCell cell = (HSSFCell) cells.next();
                    if(HSSFCell.CELL_TYPE_NUMERIC==cell.getCellType())
                    System.out.print( cell.getNumericCellValue()+"     " );
                    else
                    if(HSSFCell.CELL_TYPE_STRING==cell.getCellType())
                        System.out.print( cell.getStringCellValue()+"     " );
                    else
                        if(HSSFCell.CELL_TYPE_BOOLEAN==cell.getCellType())
                        System.out.print( cell.getBooleanCellValue()+"     " );
                        else
                            if(HSSFCell.CELL_TYPE_BLANK==cell.getCellType())
                                System.out.print( "BLANK     " );
                                else
                            System.out.print("Unknown cell type");
                   
                }
                 
                 
            }
            
             
        } catch ( IOException ex ) {
            ex.printStackTrace();
        }
    }
     
}


//Read more: http://mrbool.com/reading-excel-file-with-java/24562#ixzz2xjozy4Zx
package com.theTestingSDET.ex17_DataDrivenTesting_POI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;

public class UtilExcel {

    static Workbook book;
    static Sheet sheet;
//C:\Users\AiswaryaGopal\IdeaProjects\LearningSelenium_SDET - This is the user directory
    public static String SHEET_PATH = System.getProperty("user.dir")+"src/test/resources/MOCK_DATA.xlsx";
    public static Object[][] getTestDataFromExcel(String sheetName){

    FileInputStream fileInputStream = null;
    try {
        fileInputStream = new FileInputStream(SHEET_PATH);
        book = WorkbookFactory.create(fileInputStream);
        sheet = book.getSheet(sheetName);
    }catch(IOException e){
        System.out.println("Either File Not Found! or workbook not created!");
    }



    public static Object[][] getTestDataFeomExcel(String sheetName){
        return null;
    }
}

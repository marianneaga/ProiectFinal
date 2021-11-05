package com.Proiect.ProiectFinal.ExcelForm;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class GetData {

    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public GetData(String excelPath,String sheetName) throws IOException {
        workbook = new XSSFWorkbook(excelPath);
        sheet = workbook.getSheet("W1");
    }

    public void getCellData(int rowNum, int colNum) {

        DataFormatter formatter = new DataFormatter();
        Object value = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
        System.out.println(value);
    }
}

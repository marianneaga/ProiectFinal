package com.Proiect.ProiectFinal.services;

import com.Proiect.ProiectFinal.models.Test;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class DataService {

    private XSSFWorkbook workbook;
    private XSSFSheet sheet;

    public DataService() throws IOException {
        workbook = new XSSFWorkbook("C:\\Users\\marian.neaga\\IdeaProjects\\ProiectFinal\\ProiectFinal\\src\\main\\resources\\data\\Proiect Final.xlsx");
        sheet = workbook.getSheet("W1");
    }

    public double calculate(Test test){
        sheet.getRow(14).getCell(2).setCellValue(test.getTencuialaInterioara());
        sheet.getRow(15).getCell(2).setCellValue(test.getTencuialaExterioara());
        sheet.getRow(16).getCell(2).setCellValue(test.getZidarieDeCalcar());
        sheet.getRow(17).getCell(2).setCellValue(test.getPlaciDeCheramzitobeton());
        sheet.getRow(18).getCell(2).setCellValue(test.getPereteDinCaramidaPlina());
        sheet.getRow(19).getCell(2).setCellValue(test.getPereteCaramidaCuGoluri());
        sheet.getRow(20).getCell(2).setCellValue(test.getBetonArmat());
        sheet.getRow(21).getCell(2).setCellValue(test.getGazbeton());
        sheet.getRow(22).getCell(2).setCellValue(test.getBlocDeBeton());
        sheet.getRow(23).getCell(2).setCellValue(test.getPiatraBut());
        sheet.getRow(24).getCell(2).setCellValue(test.getAdeziv());
        XSSFFormulaEvaluator formulaEvaluator =
                workbook.getCreationHelper().createFormulaEvaluator();

        for (int i=14; i<=33; i++) {
            formulaEvaluator.evaluateFormulaCell(sheet.getRow(i).getCell(5));
        }
        return sheet.getRow(33).getCell(5).getNumericCellValue();


    }
}

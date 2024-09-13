package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Admin\\Downloads\\Book1.xlsx"; // Replace with the path to your Excel fil

        try (FileInputStream fis = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            // Get the first sheet
            Sheet sheet //= workbook.getSheetAt(0);
                        = workbook.getSheet("Sheet1");

            // Iterate through each row
            for (Row row : sheet) {
                Cell user = row.getCell(0);
                Cell pwd = row.getCell(1);



                if(user.getStringCellValue().equalsIgnoreCase("Run"))
                {
                    System.out.println(pwd.getStringCellValue());
                    System.out.println(pwd.getColumnIndex());
                }
                // Iterate through each cell in the current row
                /*for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            System.out.print(cell.getStringCellValue() + "\t");
                            break;
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case BOOLEAN:
                            System.out.print(cell.getBooleanCellValue() + "\t");
                            break;
                        case FORMULA:
                            System.out.print(cell.getCellFormula() + "\t");
                            break;
                        default:
                            System.out.print("UNKNOWN" + "\t");
                    }
                }*/
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

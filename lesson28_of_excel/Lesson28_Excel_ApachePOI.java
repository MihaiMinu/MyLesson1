package lesson28_of_excel;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import static org.apache.poi.ss.usermodel.CellType.*;
import static org.apache.poi.ss.usermodel.CellType.NUMERIC;

public class Lesson28_Excel_ApachePOI {
    public static void main(String[] args) throws Exception  {
        try {
            FileInputStream file = new FileInputStream(new File(("c:\\Excell.xlsx")));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<org.apache.poi.ss.usermodel.Row> rowIterator = sheet.iterator();

            while (rowIterator.hasNext()){
                Row row = (Row) rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()){
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()){
                        case NUMERIC:
                            System.out.printf("%.0f", cell.getNumericCellValue());
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue()+"\t\t");
                            break;
                    }
                }
                System.out.println();
            }
            file.close();
        }
        catch (Exception e) {
            System.out.println("Aleooo rezolva");
        }
    }
}

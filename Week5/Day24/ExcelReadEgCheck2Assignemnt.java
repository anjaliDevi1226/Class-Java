package com.excelEg;

/*
 * Modify given program such that ,cell 1b always shows number of executions of the program  
 */
 

import java.io.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//https://codefile.io/f/qExPjogFfx
public class ExcelReadEgCheck2Assignemnt {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// open file
		FileInputStream fis = new FileInputStream("./firstexcel.xlsx");

		// read workbook
		Workbook wbook = new XSSFWorkbook(fis);

		System.out.println("No. of sheets" + wbook.getNumberOfSheets());

		int no_of_sheets = wbook.getNumberOfSheets();
		
		double value = 0;

		int no_of_rows = 0;
		Sheet st = null;
		for (int k = 0; k < no_of_sheets; k++) {
			// read sheet
			st = wbook.getSheetAt(k);

			no_of_rows = st.getPhysicalNumberOfRows();

			for (int i = 0; i < no_of_rows; i++) {
				// read rows
				Row row = st.getRow(i);

				int no_of_cols = row.getLastCellNum();

				for (int j = 0; j < no_of_cols; j++) {
					// read cells
					Cell cell = row.getCell(j);

					value = value + cell.getNumericCellValue();
				}
			}
		}
		System.out.println("sum is "+value);
		
		fis.close();
		

		FileOutputStream fos = new FileOutputStream("./firstexcel.xlsx");
		
		Row row = st.createRow(no_of_rows);
		System.out.println("Created row..."+(no_of_rows));
		Cell cell = row.createCell(0);
		cell.setCellValue(value);

		
		// Update cell 1B with execution count
        Row headerRow = st.getRow(0);
        if (headerRow == null) {
            headerRow = st.createRow(0);
        }
        Cell executionCell = headerRow.getCell(1);
        if (executionCell == null) {
            executionCell = headerRow.createCell(1);
            executionCell.setCellValue(0); // Initialize with 0 if cell is null
        }
        
        double executionCount = executionCell.getNumericCellValue();
      //set above increment value in cell 1b//step 3
        executionCount++;
      //set above increment value in cell 1b//step 3
        executionCell.setCellValue(executionCount);

        // Write changes to file
        wbook.write(fos);
        fos.close();

        // Close workbook and input stream
        wbook.close();
        fis.close();

	}
}

package php.crm.vtiger.project101.genericUtitlity;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String fetchDataFromExcelFile(String sheetName,int rowNo,int cellNo) throws EncryptedDocumentException, IOException  {
		FileInputStream fis = new FileInputStream("./src/test/resources/manualTestCaseProject.xsls");
		Workbook workbook = WorkbookFactory.create(fis);
		return workbook.getSheet(sheetName).getRow(rowNo).getCell(cellNo).toString();

		
	}

}

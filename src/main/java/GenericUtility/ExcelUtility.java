package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 

{

	public String readDataFromExcel(String sheetName,int rowNo,int cellNo) throws Throwable, IOException
	{
		
		FileInputStream fis= new FileInputStream("C:\\Users\\Meghana\\Desktop\\HRM_Data.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String value=wb.getSheet(sheetName).getRow(rowNo).getCell(cellNo).getStringCellValue();
		return value;
		
	}
	
	
}

package projectp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadFromExcel {
	
	public void readexcel(String filepath,String fileName,String sheetName) throws IOException
	{
		File file =    new File(filepath+"\\"+fileName);
		FileInputStream inputStream = new FileInputStream(file);
		
		Workbook demo = null;
		demo = new XSSFWorkbook(inputStream);
		
	}
	
	@DataProvider(name="userdata")

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		ReadFromExcel exe= new ReadFromExcel();
		
		String filepath = System.getProperty("user.dir") + "\\src\\main\\java\\projectp\\Data.xlsx";
		exe.readexcel(filepath,"Data.xlsx","DataSheet");
		
		

	}

}

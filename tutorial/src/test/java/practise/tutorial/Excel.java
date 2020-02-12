package practise.tutorial;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excel {
	static Properties prop;

	@Test
	public static void Data() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream(".\\Data.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("fil"));
		XSSFWorkbook wb = new XSSFWorkbook(prop.getProperty("fil"));
		int sheets = wb.getNumberOfSheets();
		System.out.println(sheets);
		for (int i = 0; i < sheets; i++) {
			if (wb.getSheetName(i).equalsIgnoreCase("Sheet3")) {
				XSSFSheet sheet = wb.getSheetAt(i);
				
				
			}
		}

//		File file=new File(prop.getProperty("fil"));
//		System.out.println(file);
//		FilterInputStream fis=new FilterInputStream(file);
	}

}

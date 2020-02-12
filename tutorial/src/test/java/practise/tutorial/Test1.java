package practise.tutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.qameta.allure.Attachment;

public class Test1 {
	static WebDriver driver;
	static ExtentReports report;
	static ExtentTest test;
	static Properties prop=new Properties();
	@Test
	public static void toTestSomething() throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\clicservices\\eclipse-workspace\\tutorial\\Data.properties");
		prop.load(fis);
		report = new ExtentReports(prop.getProperty("ExtentReports"));
		test = report.startTest("for time");
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver78.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/search?rlz=1C1PRFG_enIN864IN864&ei=6bczXqb7CdmyytMPo6O0uAU&q=how+to+generate+allure+report+in+selenium&oq=allure+reports&gs_l=psy-ab.1.3.0i71l8.0.0..361673...0.2..0.0.0.......0......gws-wiz.z0YR3nEFrXs");
		String name=driver.getTitle();
		System.out.println(driver.getClass());
		String URl=driver.getCurrentUrl();
	String page=	driver.getPageSource();
	System.out.println(page);
		System.out.println(name);
		System.out.println(URl);
		test.log(LogStatus.PASS, "Navigated to the required URL");
		driver.close();	
	report.endTest(test);
	report.flush();
	
	}
	
	
}

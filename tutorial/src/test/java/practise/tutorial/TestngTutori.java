package practise.tutorial;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.qameta.allure.Attachment;

public class TestngTutori {
	static WebDriver driver;
	@Test()
	public static void first() {
		String greetings = "hi";
		System.out.println(greetings);
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver78.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/search?rlz=1C1PRFG_enIN864IN864&ei=6bczXqb7CdmyytMPo6O0uAU&q=how+to+generate+allure+report+in+selenium&oq=allure+reports&gs_l=psy-ab.1.3.0i71l8.0.0..361673...0.2..0.0.0.......0......gws-wiz.z0YR3nEFrXs");
		String name=driver.getTitle();
		System.out.println(driver.getClass());
		String URl=driver.getCurrentUrl();
	}

	@Test(dependsOnMethods = "first")
	public static void second() {
System.out.println("tom");
	}

	 @Attachment(type = "image/png")
	    public static byte[] screenshot(WebDriver driver)/* throws IOException */ {
	        try {
	            File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	            return Files.toByteArray(screen);
	        } catch (IOException e) {
	            return null;
	        }
	    }
	 
}

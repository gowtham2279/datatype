package datatypes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver d;

	public static void launchBrowser(String url) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SONY\\eclipse-workspace\\gowtham\\base\\driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.get(url);
	}

	public static void type(WebElement l, String s) {
		l.sendKeys(s);

	}

	public static void click(WebElement l) {
		l.click();

	}

	public static void closeBrowser() {
		d.quit();
	}

}





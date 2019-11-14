package datatypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewBase extends BaseClass {
	public static void main(String[] args) {
		launchBrowser("https://www.facebook.com/login.php");
		WebElement w = d.findElement(By.xpath("//input[@name='email']"));
		type(w,"gowtham");
		WebElement f = d.findElement(By.xpath("//input[@name='pass']"));
		type(f,"gow");
		WebElement g = d.findElement(By.xpath("//button[@name='login']"));
		click(g);
		closeBrowser();
	}

}




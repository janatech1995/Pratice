package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BassClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   	  ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
  	    driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
}

package Maven_Test.Maven_Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class First {

	@Test
	
	public void check() {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","D:/amit/geckodriver-v0.20.1-win32/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		driver.get("https://www.gmail.com");

	}

}

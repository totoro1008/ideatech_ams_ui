package commons;

import org.openqa.selenium.chrome.ChromeDriver;

public class Releaser {

	public static Initializer initializer;
	
	public Releaser() {
		initializer.driver.close();
		initializer.driver.quit();
	}
}

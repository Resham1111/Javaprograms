import java.util.ArrayList;


import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo2 {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");//launches the chrome
		
		
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.amazon.in/");//....loading the url
		//Thread.sleep(2000);
		Set<String> win =driver.getWindowHandles();
		System.out.println(win.getClass());

	}
}

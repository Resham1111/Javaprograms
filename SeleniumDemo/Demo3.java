



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Demo3 {

	public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");//launches the chrome
		
		
		WebDriver driver=new ChromeDriver();//launching the browser
		driver.manage().window().maximize();//maximize the window
		driver.get("https://www.facebook.com/");//....loading the url
		
		driver.get("https://www.flipkart.com/");
		//driver.quit();
		driver.get("https://www.mindvalley.com/");
		//driver.quit();
		driver.get("https://www.headspace.com/");
		//driver.quit();
		driver.get("https://www.amazon.in/");
		driver.quit();
	}
}

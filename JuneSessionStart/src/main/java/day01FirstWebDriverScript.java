import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day01FirstWebDriverScript {

	public static void main(String[] args) throws InterruptedException {
		// show the path of chrome driver path
		System.setProperty("webdriver.chrome.driver", "C:\\selDrivers\\chromedriver.exe");
		
		// to launch chrome browser  -- chrome driver is a class already avaibale in selenium class
		WebDriver driver  = new ChromeDriver();
		// Here ChromeDriver is a child class referred by a parent class interface WEbDriver
		/*Webdriver is an Interface. ChromeDriver is a class implementing it and driver is a reference variable
		we can not create WebDriver driver = new WebDriver(); as WebDriver is an interface and java..
			...does not allow creating objects of Interfaces. So we have to use a child class like 
			.....ChromeDriver to create object reference driver.*/
		
		// to use the url
		driver.get("http://automationpractice.com/index.php");
		
		//to get the title and verify for the correct one
		String pageTitle = driver.getTitle(); // to get the title of the page
		System.out.println("Page Title is : "+pageTitle);
		
		//Validation the page title
		if (pageTitle.equals("My Store")) {
			System.out.println("Correct title");
		} else {
			System.out.println("Wrong title");
		}
		
		Thread.sleep(5000);  // to keep the browser wait for 5 seconds
		
		driver.quit();   // to close the browser at the end. ( used to close a browser with one tab
		//driver.close(); // will be used to close the browser if it has multiple tabs

	}

}

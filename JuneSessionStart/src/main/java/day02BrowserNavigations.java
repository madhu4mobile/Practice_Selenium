import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day02BrowserNavigations {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\selDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Target is to open chrome with www.google.com then to navigate to rediff.com and then to yahoo.com
				// then move forward from google to yahoo and back to rediff.
		driver.get("https://www.google.com");;
		//now to navigate to next page www.rediff.com   --- then to yahoo
		driver.navigate().to("http://www.rediff.com");
		driver.navigate().to("http://www.yahoo.com");
		
		//now to back to rediff
		driver.navigate().back();  // by one step to reach rediff 
		if (driver.getTitle().contains("Rediff.com")) {// checks if the title has "Rediff.com" in it.Case sensitive
			System.out.println("Reached successfully to Rediff from yahoo page");
		}else {
			System.out.println("Coundnot reach to Rediff from yahoo page - Something is wrong");
		}
		/*******************Other options in Navigate class ******************/
		System.out.println(driver.navigate().getClass());// to get the class name
		driver.navigate().refresh();// to refresh the page
		//driver.navigate().notify(); // what is the notify do?
		/*
		 * The other way of using refresh is using action classes
		 * public void testRefreshPage() {
		
		driver= new FirefoxDriver();
		driver.navigate().to("http://google.com");
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
	}
		 * 
		 * */
		
		Thread.sleep(5000);
		driver.close();
	}
	
	

}

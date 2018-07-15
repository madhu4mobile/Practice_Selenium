import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day03AletPopUps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");  // navigate to rediff mail in chrome browser
		
		driver.findElement(By.name("proceed")).click();  // to locate the ok button and then to click
		
//		// to get the text on alet pop-up
//		String myText = driver.switchTo().alert().getText();
//			System.out.println(myText);
//		// To click on Okay button on the alert after a wait of 5 sec
//		Thread.sleep(5000);
//		
//		driver.switchTo().alert().accept();  // for accepting
//		//driver.switchTo().alert().dismiss(); // for cancelleing -- equivalent to esc key.
		
		// a wise way to use the above is to create an object reference for the alert and then to call it
		
		Alert alert = driver.switchTo().alert(); // the ref var alert will be equal to the series driver.switchTo().alert();
		
		System.out.println(alert.getText()); // to print the text on alert message
		Thread.sleep(5000);
		alert.accept(); // to click on Okay button / accept the alert message
		
		
		
		
		
		
		

	}

}

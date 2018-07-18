import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day06BrowserPopUp {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\selDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");  // URL

		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[2]")).click(); // Click on link
		
		Thread.sleep(3000);  // wait for 3 sec
		
		Set <String> handles = driver.getWindowHandles();  // this is to start ref vaiable for Set class from window Handles
		
		System.out.println(handles); // the possible window handles will be generated and printed
		// The first handle fir the main page and the second one is for the pop-up page
		
		Iterator <String> it = handles.iterator(); // the iterator is used to iterate among handles items.
		
		//At the beginning, it will show the starting location where a null value is there. So we need to go to next
		
		String parentWindowId = it.next(); // iterator is at the first handle
		System.out.println("The parent window ID is : "+parentWindowId);
		
		String childWindowId = it.next(); // to move to next handle and assign it to childWindowId
		System.out.println("The PopUp window ID is :"+childWindowId);
		
		// If we want to move control to pop-up window,
		driver.switchTo().window(childWindowId);
		//Now print the title of the POP-UP window and close
		System.out.println("Title of the POP-UP window is :"+driver.getTitle());
		driver.close(); // close closes only the focussed browser. Quit closes all
		
		//now need to switchTo the parentWindow
		driver.switchTo().window(parentWindowId);
		System.out.println("Title of the Parent window is :"+driver.getTitle());
		Thread.sleep(3000);
		driver.quit(); // Quit closes all
		
		
		
		
	}

}

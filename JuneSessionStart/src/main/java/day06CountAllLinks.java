import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day06CountAllLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.com/goodpopups.html");  // URL
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		System.out.println(link.size());  // to print number of links
		
		// to iterate between all links
		for (int i=0; i<link.size();i++) {
			
			String s = link.get(i).getText();
			
			if (s.isEmpty()) {// isEmpty to check if the string returns blank
				System.out.println("The link has empty text as link text");
			}else {
				System.out.println(s);  // to read the text of the links
				//link.get(i) will return the address of Parent webpage	
			}
			
		}

		driver.close();
	}                                 

}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day06BrowserPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\selDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.popuptest.googpopup.html");


	}

}

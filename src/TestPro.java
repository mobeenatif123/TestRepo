import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestPro {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://Users/Mobeen Atif/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver;
		driver=new ChromeDriver();
		driver.get("https://www.google.com.pk/");
		
		

	}

}

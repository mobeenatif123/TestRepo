import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	
	public WebDriver drivers;
  @Test(priority=0)
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C://Users/Mobeen Atif/Downloads/chromedriver_win32/chromedriver.exe");
		drivers=new ChromeDriver();
		drivers.get("https://globalportal.mtbc.com/login/Login");
		drivers.manage().window().maximize(); 
  }
  @Test(priority=1)
  public void login(){
	  
	    drivers.findElement(By.id("username")).sendKeys("MA330");
		drivers.findElement(By.id("password")).sendKeys("change@123");
		drivers.findElement(By.xpath("//*[@id='LoginForm']/div[3]/input")).click();
	   
  }
  @Test(priority=3)
  public void employeesletters(){
	  
	  
	  
  }
  @Test(priority=4)
  public void quit(){
	  
	  drivers.quit();
  }
  
}

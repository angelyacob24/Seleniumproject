package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.Keralapageclass;

public class Keralabaseclass {
	
	public static WebDriver driver;
	 
	public static Keralapageclass keralaobj;
	
	@BeforeTest
	public void browsersetup()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void keralaobjmthd()
	{
		keralaobj=new Keralapageclass(driver);
	}

}

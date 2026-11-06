package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Keralapageclass {
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"ulogin\"]") WebElement username;
	@FindBy(xpath="//*[@id=\"upass\"]") WebElement password;
	@FindBy(xpath="//*[@id=\"sub_logbtn\"]") WebElement loginbtn;
	
	public Keralapageclass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public String titleverificationmthd()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public void loginmthd(String usn,String paw)
	{
		username.sendKeys(usn);
		password.sendKeys(paw);
		loginbtn.click();
	}
	

}

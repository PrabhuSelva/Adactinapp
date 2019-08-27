import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObject extends BasePage {
	
	
	
	@FindBy(id="username")
	private WebElement usrname;
	
	@FindBy(id="password")
	private WebElement pasword;
	
	@FindBy(id="login")
	private WebElement login;
	
	public HomePageObject()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void getlogin()
	{
		usrname.sendKeys("VickiDivi");
		pasword.sendKeys("vickidivi");
		login.click();
	}

}

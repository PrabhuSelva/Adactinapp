import org.testng.annotations.Test;

public class HomePageTest {
	
	BasePage bp;
	HomePageObject homepage;
	
	public HomePageTest()
	{
		bp= new BasePage();
		homepage= new HomePageObject();
	}
	
	
	@Test
	public void verifylogin()
	{
		homepage.getlogin();
	}
	

}

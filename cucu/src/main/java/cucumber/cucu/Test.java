package cucumber.cucu;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test 
{
	
	WebDriver driver;
	@Given ("^Launch Chrome$")
	public void launch(){
		System.setProperty("webdriver.chrome.driver","D:\\sellenium workspace\\chromedriver.exe");
		//Launching the browser
		driver = new ChromeDriver();
			
	
	}
	@When("^Launch Hms site$")
	public void launchhms()
	{
		driver.get("http://192.168.1.102/HMS/");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@Then("^Enter userid as \"(.*)\" and password as \"(.*)\"$")
	public void login(String userid,String password)
	{
		driver.findElement(By.id("txtUserName")).sendKeys(userid);
		driver.findElement(By.id("txtPwd")).sendKeys(password);
		driver.findElement(By.id("btnSignIn")).click();
	}
	/*@And("^open Tree for Registrtion$")
	public void opentree(){
        driver.switchTo().frame ("left");
		
		driver.findElement(By.id("TreeView1n1")).click();
		driver.findElement(By.id("TreeView1n2")).click();
		driver.findElement(By.id("TreeView1t3")).click();
	}
	@And("^Enter registration details$")
	public void registration(){
		driver.switchTo().defaultContent();
		driver.switchTo().frame ("display");
		driver.findElement(By.id("hypnew")).click();
		driver.findElement(By.id("txtName")).sendKeys("firstpatient");
		driver.findElement(By.id("txtAge")).sendKeys("54");
		WebElement e1 = driver.findElement(By.id("ddlSex"));
        Select S = new Select(e1);
		S.selectByVisibleText("MALE");
		driver.findElement(By.id("txtMobile")).sendKeys("1234567890");
		driver.findElement(By.id("txtAddress1")).sendKeys("54");
		WebElement e2 = driver.findElement(By.id("ddlaspState"));
		S = new Select(e2);
		S.selectByVisibleText("AP");
		driver.findElement(By.id("txtDoctorName")).sendKeys(Keys.F2);
		driver.switchTo().alert().accept(); 
		ArrayList<String> wh = new ArrayList<> (driver.getWindowHandles ());
		
		driver.switchTo ().window (wh.get (1).toString ());
		
		driver.findElement(By.xpath("//*[@id='gvDoctorCode']/tbody/tr[7]/td[1]/a")).click();
		driver.findElement(By.id("btnClose")).click();
		
		//driver.switchTo().defaultContent();
		driver.switchTo ().window (wh.get (0).toString ());
		driver.switchTo().frame ("display");
		driver.findElement(By.id("btnSubmit")).click();
	}
	@And ("^click on logout$")
	public void logout(){
		driver.switchTo().defaultContent();
		driver.switchTo().frame("bottomFrame");
		driver.findElement(By.xpath("//*[@id='frmHeader']/table[1]/tbody/tr/td[2]/table/tbody/tr[1]/td[8]/a/img")).click();
	}
	@And("^close site$")
	public void close(){
		driver.close();
	}


}
*/

}

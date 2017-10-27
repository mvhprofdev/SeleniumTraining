
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

		WebElement register = driver.findElement(
				By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a"));

		register.click();

		driver.findElement(By.name("firstName")).sendKeys("Anntje");
		;

		driver.findElement(By.name("lastName")).sendKeys("Schevernels");

		driver.findElement(By.name("phone")).sendKeys("9293939393");
		// email
		driver.findElement(By.name("userName")).sendKeys("anntje@test.com");

		driver.findElement(By.name("address1")).sendKeys("adrezefsf");

		driver.findElement(By.name("address2")).sendKeys("Part2");

		driver.findElement(By.name("city")).sendKeys("Berlaar");
		driver.findElement(By.name("state")).sendKeys("Antwerpen");
		driver.findElement(By.name("postalCode")).sendKeys("2590");

		Select dropdown = new Select(driver.findElement(By.name("country")));
		dropdown.selectByValue("17");

		driver.findElement(By.name("email")).sendKeys("anntje@test.com");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.name("confirmPassword")).sendKeys("test");

		WebElement submit = driver.findElement(By.name("register"));
		submit.click();
		
		if((driver.findElement(By.xpath("//b[.=' Note: Your user name is anntje@test.com.']")) != null)) {
			System.out.println("Test OK");
		}

		
				
			try {
				if((driver.findElement(By.xpath("//b[.=' Note: Your name is anntje@test.com.']")) != null))
					System.out.println("Test Failed");
			}
			catch(Exception e) {
			}
			finally {
				// Close the browser
				driver.quit();
			}

			driver.quit();
			
		}
		


		
		
		


	}

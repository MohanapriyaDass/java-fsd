
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumweb {
	public static void main(String[] args) throws InterruptedException {
		//register the chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\95\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		//maximize the screen
		wd.manage().window().maximize();
		//any website or any localhost
		wd.get("https://codingbat.com/java");
		
		wd.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/a[2]")).click();
		wd.findElement(By.name("uname")).sendKeys("theengineer2022@gmail.com");
		wd.findElement(By.name("pw1")).sendKeys("Monika@18");
		Thread.sleep(10000);
		wd.findElement(By.name("dosavecreate")).click();
		wd.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td/a")).click();
		wd.findElement(By.name("uname")).sendKeys("theengineer2022@gmail.com");
		
		wd.findElement(By.name("pw")).sendKeys("Monika@18");
		Thread.sleep(10000);
		wd.findElement(By.name("dologin")).click();
	}

}




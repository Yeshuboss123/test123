import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Combox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Yeshwanth\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		Actions y = new Actions(driver);
		WebElement yeshu1 = driver.findElement(By.cssSelector("div[class='ui-widget-content ui-draggable ui-draggable-handle']"));
		WebElement yeshu2 = driver.findElement(By.id("droppable"));
		y.dragAndDrop(yeshu1, yeshu2).build().perform();
		
		
		
		

	}

}

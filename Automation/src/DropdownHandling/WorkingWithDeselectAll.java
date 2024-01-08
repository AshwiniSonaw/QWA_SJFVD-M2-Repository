package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDeselectAll {

	public static void main(String[] args) throws InterruptedException {
		// launch browser
		WebDriver driver = new ChromeDriver();
		// maximize window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// to open web application
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");
		// to store location of multiselect dropdown
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));
		// to select option use select class and create object for select class
		Select s = new Select(dropdown);
		// select multiple option of dropdown by selectByVisibleText
		s.selectByVisibleText("India");
		s.selectByVisibleText("Australia");
		s.selectByVisibleText("Japan");
		Thread.sleep(2000);
		// deselect multiple option of dropdown by deselectAll
		s.deselectAll();
	}

}

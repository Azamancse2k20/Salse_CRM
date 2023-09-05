package SalseCRM.CRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;


public class adding_Account_record {
	
	public static WebDriver driver;
	public static String baseURL = "https://web.cloudapper.com";
	
	@BeforeSuite
	public void Test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@BeforeTest
	public static void login() throws InterruptedException {
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[3]/div/input")).sendKeys("m2sysqa.05+11@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/form/div[4]/div/input")).sendKeys("M2qatest@1");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/form/div[6]/div/button")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	 @BeforeClass
	 public static void ContactManager() throws InterruptedException {
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-home/div/div[2]/app-console/div/div/div/app-list/div/div/a/div")));
		 Thread.sleep(10000);
		 
	 }

	@Test
 public static void addRecord() throws InterruptedException {
	 
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[1]/div[2]/div[1]/app-menu/dx-menu/div/ul/li[2]/div/div/img")));
	 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[1]/div[2]/div[1]/app-menu/dx-menu/div/ul/li[2]/div/div/img")).click();
	 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[1]/div[2]/div[2]/div/div[1]/app-list-view/div[1]/div[2]/app-data-grid-toolbar/div/div[1]/div[1]/dx-drop-down-button/div/div/div[1]/div/span")).click();
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[1]/app-text-control/div/div/dx-text-box/div/div[1]/input")).sendKeys("ahad@gmail.com");
	 
	 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[2]/app-multivalue-control/div/div/dx-select-box/div[1]/div/div[2]/div/div/div")).click();
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[6]/div")).click();
	
	 //
	 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[3]/app-multivalue-control/div/div/dx-select-box/div/div/div[2]/div/div/div")).click();
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[7]/div")));
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[7]/div")).click();
	 
	 // website link
	 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[4]/app-text-control/div/div/dx-text-box/div/div[1]/input")).sendKeys("www.m2sys.com");
	 Thread.sleep(2000);
	 
	 //linkelIn link
	 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[5]/app-text-control/div/div/dx-text-box/div/div[1]/input")).sendKeys("https://www.LinkedIn.com/ar85/");
	 Thread.sleep(2000);
	 
	 // address
	 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[6]/app-text-area/div/div/dx-text-area/div/div[1]/textarea")).sendKeys("Mohakhali, Dhaka");
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[2]/div/dx-button[2]/div")).click();
	 
	 Thread.sleep(5000);
 }

	
	@AfterTest
	public static void TestEnd() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[1]/div[2]/div[1]/app-menu/dx-menu/div/ul/li[1]/div/div/img")));
		driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[1]/div[2]/div[1]/app-menu/dx-menu/div/ul/li[1]/div/div/img")).click();
		 Thread.sleep(10000);
	}
	
	
	@AfterSuite
	 public static void teardown() {
		  driver.close();
		 driver.quit();
	 }

}

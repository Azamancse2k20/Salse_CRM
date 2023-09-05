package SalseCRM.CRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class adding_Oportunities_List extends adding_Contact_List {
	
	
	@Test
	 public static void AddOportunitiesList() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(120, 1));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[1]/div[2]/div[1]/app-menu/dx-menu/div/ul/li[4]/div/div/img")));
		 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[1]/div[2]/div[1]/app-menu/dx-menu/div/ul/li[4]/div/div/img")).click();
		 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[1]/div[2]/div[2]/div/div[1]/app-list-view/div[1]/div[2]/app-data-grid-toolbar/div/div[1]/div[1]/dx-drop-down-button/div/div/div[1]/div/span")).click();
		 Thread.sleep(2000);
		 
		 // account
		 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/app-parent-selection/div[2]/div/div[2]/div/app-browse-control/div/div/div/div[1]/dx-lookup/div[1]/div[1]")).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/span")));
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/div[2]/div[1]/div/div[1]/div[2]/div[1]/div/div/div/div")).click();
		 Thread.sleep(2000);
		 
		 //Opportunity name
		 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[1]/app-text-control/div/div/dx-text-box/div[1]/div[1]/input")).click();
		 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[1]/app-text-control/div/div/dx-text-box/div[1]/div[1]/input")).sendKeys("DBMS");
		 Thread.sleep(2000);
		 
		 //status
		 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[2]/app-multivalue-control/div/div/dx-select-box/div[1]/div/div[2]/div/div/div")).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div")));
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[2]/div")).click();
		 Thread.sleep(2000);
		 
		 //priority
		 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[3]/app-multivalue-control/div/div/dx-select-box/div/div/div[2]/div/div/div")).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[3]/div")));
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[3]/div")).click();
		 Thread.sleep(2000);
		 
		 //Scroll element
		 WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[6]/app-multivalue-control/div/div/dx-select-box/div/div/div[2]/div/div/div"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
		 Thread.sleep(2000);
		 
		 //estimate value
		 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[4]/app-text-control/div/div/dx-text-box/div/div[1]/input")).click();
		 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[4]/app-text-control/div/div/dx-text-box/div/div[1]/input")).sendKeys("501 - 1000");
		 Thread.sleep(2000);
		 
		 // date
		 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[5]/app-date-control/div/div/dx-date-box/div[1]/div/div[2]/div/div")).click();
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div/span")));
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[3]/div[1]/div/div/div/span")).click();
		 Thread.sleep(2000);
		 
		 //primary contact
		 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[1]/dx-accordion/div/div/div[2]/div/app-section/div/div/div/div/div/app-column/div[6]/app-multivalue-control/div/div/dx-select-box/div/div/div[2]/div/div/div")).click();
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div[1]/div[2]/div[1]/div")).click();
		 Thread.sleep(2000);

		 driver.findElement(By.xpath("/html/body/app-root/app-app-launch/dx-drawer/div/div[2]/div/div/div/form-add-ui/div[1]/dx-scroll-view/div[1]/div/div/div[2]/form/dx-validation-group/div[2]/div/dx-button[2]/div")).click();
		 
		 Thread.sleep(5000);
	}

	
}

package seleniumdemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.lang.Thread;

public class seleniumclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\\\seleniumfiles\\\\chromedriverfiles\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.trukky.com/door-to-door-goods-delivery");

        // Check if landed on the correct page
        String expectedTitle = "Door To Door Delivery - Goods Delivery Service | Trukky";
        if (driver.getTitle().equals(expectedTitle)) {
            System.out.println("Landed on the correct page.");
        } else {
            System.out.println("Landed on the wrong page.");
        }

        // Print URL and Title
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        
        Thread.sleep(4000);

        // Enter Pickup City
        WebElement pickupCityInput = driver.findElement(By.xpath("//input[@placeholder='Enter pickup city']"));
        pickupCityInput.sendKeys("Hyderabad");
        
        Thread.sleep(4000);

        // Select Pickup City from dropdown
        WebElement pickupCityOption = driver.findElement(By.xpath("//div[@class='tabs']//li[1]"));
        pickupCityOption.click();
        
        Thread.sleep(2000);

        // Enter Drop City
        WebElement dropCityInput = driver.findElement(By.xpath("//input[@placeholder='Enter drop city']"));
        dropCityInput.sendKeys("Delhi");
        
        Thread.sleep(4000);

        // Select Drop City from dropdown
        WebElement dropCityOption = driver.findElement(By.xpath("//li[1]//div[1]//span[2]"));
        dropCityOption.click();
        
        Thread.sleep(2000);

        // Click on Check Price
        WebElement checkPriceButton = driver.findElement(By.xpath("//button[@type='submit']"));
        checkPriceButton.click();
        
        Thread.sleep(2000);

        // Click on Personal service type
        WebElement personalServiceType = driver.findElement(By.xpath("//li[2]//div[1]"));
        personalServiceType.click();
        
        Thread.sleep(2000);
        
        //click on few picked items
        WebElement personalServiceType1 = driver.findElement(By.xpath("//li[1]//div[1]"));
        personalServiceType1.click();
        
        Thread.sleep(2000);

        

        // Click on Add Material
        WebElement addMaterialButton = driver.findElement(By.xpath("//body/div[@id='__next']/div[@class='pageLayout']/main[@class='jsx-1905266029']/div[@class='jsx-1905266029 content']/div[@class='jsx-1905266029 addMaterialContent']/div[1]"));
        addMaterialButton.click();
        
        Thread.sleep(2000);

        // Select Material from dropdown
        Select materialDropdown = new Select(driver.findElement(By.xpath("//select[@class='jsx-1905266029']")));
        materialDropdown.selectByVisibleText("Window AC");
        
        Thread.sleep(1000);

        // Enter Number of Items
        WebElement noItemsInput = driver.findElement(By.xpath("//form[@id='form_0']//input[@placeholder='Enter No. of item']"));
        noItemsInput.sendKeys("2");
        
        Thread.sleep(1000);

        // Click on forward button
        WebElement forwardButton = driver.findElement(By.xpath("//form[@id='form_0']//button[@class='jsx-1905266029 nextBtn']"));
        forwardButton.click();

        // Click on Next button
        WebElement nextButton = driver.findElement(By.xpath("//button[normalize-space()='Next']"));
        nextButton.click();
        
        Thread.sleep(2000);
        
     // Click on date
        WebElement date = driver.findElement(By.xpath("//abbr[@aria-label='1693161000000']"));
        date.click(); 
        
        Thread.sleep(2000);
    


        // Click on Next button
        nextButton = driver.findElement(By.xpath("//button[@type='submit']"));
        nextButton.click();

       
        Thread.sleep(2000);
        
        //enter mobile number
        WebElement numberInput = driver.findElement(By.xpath("//input[@placeholder='Whatsapp no. recommended']"));
        numberInput.sendKeys("9908428119");


        // Click on Get Price Button
        WebElement getPriceButton = driver.findElement(By.xpath("//button[normalize-space()='Get price']"));
        getPriceButton.click();
        
        Thread.sleep(30*1000);
        
        
        // click proceed
        WebElement proceed = driver.findElement(By.xpath("//button[@class='jsx-1905266029 nextBtn']"));
        proceed.click();
        
        Thread.sleep(15*1000);
         

  //    Close the browser
        driver.quit();
        System.out.println("Testing completed successfully");
		
	}

}

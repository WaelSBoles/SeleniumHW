package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        WebElement fname=driver.findElement(By.xpath("//input[@name='first_name']"));

        fname.sendKeys("Wael");

        WebElement lastName=driver.findElement(By.xpath("//input[@name='last_name']"));

        lastName.sendKeys("Boles");

        WebElement email=driver.findElement(By.xpath("//input[@name='email']"));

        email.sendKeys("waelsaviour3@yahoo.com");
        WebElement phone=driver.findElement(By.xpath("//input[@data-bv-field='phone']"));

        phone.sendKeys("843-300-5234");
        WebElement address=driver.findElement(By.xpath("//input[@data-bv-field='address']"));

        address.sendKeys("1605 Raleigh north");
        Thread.sleep(2000);

        WebElement city=driver.findElement(By.xpath("//input[@placeholder='city']"));

        city.sendKeys("Raleigh");

        WebElement state=driver.findElement(By.xpath("//select[@name='state']"));

        state.click();
        //*********Very important : to get the dropdown list
        WebElement DropDownMenu= driver.findElement(By.name("state"));
        Select dropdown =new Select((DropDownMenu));
        dropdown.selectByIndex(34);
       // dropdown.selectByValue("North Carolina");
       // dropdown.selectByVisibleText("California");
        //************
        Thread.sleep(2000);
        WebElement zip=driver.findElement(By.xpath("//input[@name='zip']"));

        zip.sendKeys("27604");
        WebElement website=driver.findElement(By.xpath("//input[@placeholder='Website or domain name']"));

        website.sendKeys("http://practice.syntaxtechs.net/");

        WebElement hosting=driver.findElement(By.xpath("//input[@value='yes']"));

        hosting.click();

        WebElement comment=driver.findElement(By.xpath("//textarea[@name='comment']"));


        comment.sendKeys("Selenium is fun");

        WebElement submit=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        submit.click();
        Thread.sleep(2000);

        driver.quit();







    }
}
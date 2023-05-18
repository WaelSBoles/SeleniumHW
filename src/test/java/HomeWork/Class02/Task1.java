package HomeWork.Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com/");
        driver.manage().window().maximize();
        // Syntax // tagname[@attribute="value"]   ===  input[@id="heelo"]=====
        //tagname[text()="valeOFText"]
        // hi tagName five me the attribute that is his value heelo
        WebElement createBtn=driver.findElement(By.xpath("//a[text()='Create new account']"));
        createBtn.click();
        Thread.sleep(2000);
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Wael");
        WebElement lastName=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        lastName.sendKeys("Boles");
        WebElement email=driver.findElement(By.xpath("//input[@name=\"reg_email__\"]"));
        email.sendKeys("waelsaviour3@yahoo.com");
        WebElement confirmEmail=driver.findElement(By.xpath("//input[@name=\"reg_email_confirmation__\"]"));
        confirmEmail.sendKeys("waelsaviour3@yahoo.com");

        WebElement createPass=driver.findElement(By.xpath("//input[@id=\"password_step_input\"]"));
        createPass.sendKeys("Wael15893");
        WebElement month= driver.findElement(By.xpath("//select[@id=\"month\"]"));
        month.sendKeys("February");
        WebElement day= driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));
        day.sendKeys("20");
        WebElement year= driver.findElement(By.xpath("//select[@title=\"Year\"]"));
        year.sendKeys("1978");
        WebElement gender= driver.findElement(By.xpath("//label[text()=\"Male\"]"));
        gender.click();
        Thread.sleep(3000);
        WebElement submit= driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
        submit.click();
        Thread.sleep(3000);

        driver.quit();









    }
}

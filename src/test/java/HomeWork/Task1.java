package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {


/* HW1:
navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
fill out the form
close the browser */


        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
            driver.manage().window().maximize();

            driver.findElement(By.id("customer.firstName")).sendKeys("Wael");
            driver.findElement(By.name("customer.lastName")).sendKeys("Boles");
            driver.findElement(By.name("customer.address.street")).sendKeys("1900 Raleigh");
            driver.findElement(By.id("customer.address.city")).sendKeys("Raleigh");
            driver.findElement(By.name("customer.address.state")).sendKeys("NC");
            driver.findElement(By.id("customer.address.zipCode")).sendKeys("27604");
            driver.findElement(By.name("customer.phoneNumber")).sendKeys("123549845");
            driver.findElement(By.id("customer.ssn")).sendKeys("25646513");
            driver.findElement(By.name("customer.username")).sendKeys("waelsaviour3@yahoo.com");
            driver.findElement(By.name("customer.password")).sendKeys("fgfgfdg");
            driver.findElement(By.name("repeatedPassword")).sendKeys("fgfgfdg");

        /*driver.findElement(By.name("username")).sendKeys("waelsaviour3@yahoo.com");
        driver.findElement(By.name("password")).sendKeys("fgfgfdg");*/
            Thread.sleep(3000);
            driver.close();



        }
    }



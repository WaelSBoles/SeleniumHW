package Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%E2%80%9D");
        driver.manage().window().maximize();
        WebElement username=driver.findElement(By.cssSelector("input#txtUsername"));
        username.sendKeys("Admin");
        WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@id, 'Login')]"));
        loginBtn.click();



    }
}
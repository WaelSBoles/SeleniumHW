package Class6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Task2 extends CommonMethods {
    public static void main(String[] args) {
        String url=" http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement newUserBtn= driver.findElement(By.xpath("//button[text()='Get New User']"));
        newUserBtn.click();
       WebElement fname= driver.findElement(By.xpath("//p[contains(text(),'First Name ')]"));

        System.out.println(fname.getText());
        WebElement lname= driver.findElement(By.xpath("//p[contains(text(),'Last Name ')]"));
        System.out.println(lname.getText());
    }
}

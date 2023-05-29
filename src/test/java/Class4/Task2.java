package Class4;
/*hw2:
goto facebook.com
 click on create account
and select the your  date of birth using select class*/

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="https://www.facebook.com";
        String browser="chrome";
        openBrowserAndLaunchApplication("https://www.facebook.com","chrome");
        WebElement createAccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createAccount.click();
        Thread.sleep(2000);
        WebElement month=driver.findElement(By.xpath("//Select[@name='birthday_month']"));
        Select mon=new Select(month);
        mon.selectByIndex(1);


        WebElement day=driver.findElement(By.xpath("//Select[@name='birthday_day']"));
        Select da=new Select(day);
        da.selectByValue("20");


        WebElement year=driver.findElement(By.xpath("//Select[@name='birthday_year']"));
        Select yea=new Select(year);
        yea.selectByVisibleText("1978");

        driver.close();





    }
}

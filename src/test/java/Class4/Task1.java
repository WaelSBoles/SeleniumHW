package Class4;
/*HW1:
goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
select , tuesday, thursday and friday one by one*/

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Task1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php","chrome");
        WebElement dp=driver.findElement(By.xpath("//Select[@id='select-demo']"));

        Select days=new Select(dp);
        days.selectByVisibleText("Tuesday");
        Thread.sleep(1000);
        days.selectByIndex(5);
        Thread.sleep(1000);
        days.selectByValue("Friday");
        Thread.sleep(1000);
        driver.quit();








    }
}

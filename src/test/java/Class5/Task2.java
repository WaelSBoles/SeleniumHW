package Class5;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
/*HW2:
goto https://chercher.tech/practice/frames
click on check box
then select bay cat from drop down
then enter text in text box */


public class Task2 extends CommonMethods {
    public static void main(String[] args) {
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication("https://chercher.tech/practice/frames","chrome");
        driver.switchTo().frame(1);
        WebElement animal=driver.findElement(By.xpath("//b[text()='Animals :']"));
        System.out.println(animal.getText());
        WebElement dropDown= driver.findElement(By.xpath("//select[@id=\"animals\"]"));
        Select sel=new Select(dropDown);
        sel.selectByVisibleText("Baby Cat");
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame1");
        WebElement txtBox = driver.findElement(By.xpath("//input"));
        txtBox.sendKeys("Wael");
        WebElement frame3=driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.id("a")).click();

    }
}


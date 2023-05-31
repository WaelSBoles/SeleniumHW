package Class5;
/*http://practice.syntaxtechs.net/javascript-alert-box-demo.php
click on the last alert
send keys and accept it

Note: dont worry if the text u send doesnt appears up in the textbox*/

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Task1 extends CommonMethods{
    public static void main(String[] args) throws InterruptedException {


            String url = "http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
            String browser = "chrome";
            openBrowserAndLaunchApplication("http://practice.syntaxtechs.net/javascript-alert-box-demo.php", "chrome");
            WebElement alert1BTN = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
            alert1BTN.click();
            Thread.sleep(2000);
            Alert confirmAlert1 = driver.switchTo().alert();
            confirmAlert1.accept();

            WebElement alert2BTN = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
            alert2BTN.click();
            Thread.sleep(2000);
            Alert confirmAlrat2 = driver.switchTo().alert();
            confirmAlrat2.dismiss();
            // click on the last alert
            //send keys and accept it
            WebElement alert3BTN = driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
            alert3BTN.click();
            Thread.sleep(2000);
            Alert comfirmAlert3 = driver.switchTo().alert();
            comfirmAlert3.sendKeys("Open up Sesame");
            Thread.sleep(2000);
            comfirmAlert3.accept();


        }
    }
package classfile;

//import gherkin.lexer.Ja;
//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
//import jdk.jfr.Enabled;
//import org.apache.hc.core5.reactor.Command;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class DemoQA {
     WebDriver driver;

    public void LOGIN() throws AWTException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUCHGR\\Downloads\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/elements");
        driver.findElement(By.id("item-0")).click();
        JavascriptExecutor ja = ((JavascriptExecutor) driver);
        Robot r = new Robot();
        for (int i = 0; i < 20; i++) {
            r.keyPress(KeyEvent.VK_DOWN);
            r.keyRelease(KeyEvent.VK_DOWN);
        }
        driver.findElement(By.id("userName")).sendKeys("SUCHITRA");
        driver.findElement(By.id("userEmail")).sendKeys("suchitragr123@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("suchitragr d/o ramachandrappa");
        driver.findElement(By.id("permanentAddress")).sendKeys("suchitra gr chitradurga.");
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        JS.executeScript("window.scrollBy(0,500)", "");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        JavascriptExecutor JE=(JavascriptExecutor) driver;
        JE.executeScript("window.scrollBy(0,-5000)","");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//li[@class=\"btn btn-light active\"]")).click();
    }
//public void checkbox() throws InterruptedException {
      //  Thread.sleep(2000);
       // JavascriptExecutor JE=(JavascriptExecutor) driver;
      //  JE.executeScript("window.scrollBy(0,-5000)","");
//}

    }






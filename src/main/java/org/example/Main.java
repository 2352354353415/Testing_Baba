package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void ele_click(String locetor) {
        WebDriver driver = null;
//        WebDriver driver = new ChromeDriver();
        driver.findElement(By.xpath(locetor)).click();
    }
}
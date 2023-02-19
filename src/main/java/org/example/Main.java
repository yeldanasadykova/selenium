package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://petstore.octoperf.com/actions/Catalog.action");

        WebElement signin = driver.findElement(By.xpath("//html/body/div[1]/div[2]/div/a[2]"));
        signin.click();

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("Sda123");

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.clear();
        password.sendKeys("D6J4s6&V");

        Thread.sleep(5000);
        WebElement login = driver.findElement(By.xpath("//input[@name='signon']"));
        login.click();

    }
}
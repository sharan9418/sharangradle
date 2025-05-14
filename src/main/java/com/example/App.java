package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main(String[] args) 
    {
        // Set the path to your ChromeDriver if needed
        // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/login");
        driver.manage().window().maximize();

        // Basic wait — better to use WebDriverWait for reliability
        try { Thread.sleep(3000); } catch (InterruptedException e) { e.printStackTrace(); }

        WebElement username = driver.findElement(By.id("login_field"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys("your_github_username");
        password.sendKeys("your_github_password");

        driver.findElement(By.name("commit")).click();

        // Optional: wait and then close the browser
        try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }
        driver.quit();
    }
}


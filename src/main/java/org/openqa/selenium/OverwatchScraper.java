package org.openqa.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OverwatchScraper {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver");


        FirefoxOptions options = new FirefoxOptions();

        WebDriver driver = new FirefoxDriver(options);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://overwatch.blizzard.com/es-es/heroes/");

        WebElement heroElement = driver.findElement(By.className("Hero"));
        String heroName = heroElement.findElement(By.className("Hero-name")).getText();
        String heroRol = heroElement.findElement(By.className("data-filter-role")).getText();
        String heroDescription = heroElement.findElement(By.className("blz-header")).getText();

        System.out.println("Hero Name: " + heroName);
        System.out.println("Hero Rol: " + heroRol);
        System.out.println("Hero Description: " + heroDescription);


        driver.quit();
    }
}

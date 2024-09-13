package com.example.tests; // Make sure this matches the package name you created

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GloboTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path for the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.globo.com");
    }

    @Test
    public void testHomePageTitle() {
        String expectedTitle = "Globo.com - Notícias, vídeos, esportes, entretenimento";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Homepage title does not match.");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

package waitlessons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class seleniumWait {

    @Test
    public void implicitWait() {
        //1. Initialization
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://jayjay.co/");

        //Web Element
        //src\gambar\contohWebElement.png
        String text = driver.findElement(By.className("btn-kursus")).getText();
        assertEquals("Kursus",text);

        //Methods
        driver.quit();

    }
    @Test
    public void explicitWait() {

    }
    @Test
    public void fluentWait() {

    }    
}

package basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class selenium {

    @Test
    public void helloJayJay() {
        //System.out.println("Test");
        WebDriver driver = WebDriverManager.chromedriver().create();
        driver.get("https://jayjay.co/");
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String text = driver.findElement(By.className("btn-kursus")).getText();
        assertEquals("Kursus",text);

    }
}

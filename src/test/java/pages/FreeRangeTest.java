package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class FreeRangeTest {
    public static final String URL = "https://www.freerangetesters.com";
    WebDriver driver = new ChromeDriver();

    @Test
    public void test1() {
        // Navegar a página web
        driver.get(URL);

        // Encontrar elemento pelo seu ID
        WebElement elementoPorId = driver.findElement(By.id("idDelElemento"));
        elementoPorId.click();
    }

    @Test
    public void test2() {
        // Navegar a página web
        driver.get(URL);

        // Encontrar elemento pelo seu ID
        WebElement elementoPorId = driver.findElement(By.id("idDelElemento"));
        elementoPorId.click();
    }

    @Test
    public void test3() {
        // Navegar a página web
        driver.get(URL);

        // Encontrar elemento pelo seu ID
        WebElement elementoPorId = driver.findElement(By.id("idDelElemento"));
        elementoPorId.click();
    }

    @AfterMethod
    public void tearDown() {
        // Encerrar o navegador depois do teste
        driver.quit();
    }

}

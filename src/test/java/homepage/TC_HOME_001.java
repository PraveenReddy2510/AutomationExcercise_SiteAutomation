package homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TC_HOME_001 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

        Assert.assertEquals(driver.getTitle(), "Automation Exercise");

        Assert.assertTrue(driver.findElement(By.cssSelector("div.logo")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//a[text()=' Home']")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//a[text()=' Products']")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//a[text()=' Cart']")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//a[text()=' Signup / Login']")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//a[text()=' Test Cases']")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//a[text()=' API Testing']")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//a[text()=' Video Tutorials']")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//a[text()=' Contact us']")).isDisplayed());

        Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Category']")).isDisplayed());



        driver.quit();
    }
}

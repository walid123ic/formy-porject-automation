import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Learning\\Seleinum Automation\\Ex_Files_Selenium_EssT\\Ex_Files_Selenium_EssT\\Exercise Files\\Resources\\Tools\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.purchasingprogramsaudi.com/Index.cfm");

        WebElement name = driver.findElement(By.id("j_username"));
        name.click();
        name.sendKeys("MOH-C1035");
        WebElement password = driver.findElement(By.id("j_password"));
        password.sendKeys("");
        password.click();
        password.sendKeys("Nm@12345");
        WebElement login = driver.findElement(By.id("btnLogin"));
        login.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement admit = driver.findElement(By.linkText("Admitted Requests"));
        admit.click();





        //driver.quit();
    }
}

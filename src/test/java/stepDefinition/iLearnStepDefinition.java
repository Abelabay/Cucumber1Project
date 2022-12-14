package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class iLearnStepDefinition {
    static WebDriver driver;
    static String randomAlphanumeric;
    @Given("launch chrome browser")
    public void launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();

    }

    @When("open iLearn webpage")
    public void open_i_learn_webpage() {

        driver.manage().window().maximize();
        driver.get("https://ilearn-dev.netlify.app/");
        Assert.assertEquals(driver.getTitle(), "iLearn Employees");

    }

    @Then("verify sign in button")
    public void verify_sign_in_button() {
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/main/div/form/button")).click();

    }

    @Then("close browser")
    public void close_browser() {
        driver.close();

    }
}

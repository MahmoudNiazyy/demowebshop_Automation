import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static com.fasterxml.jackson.databind.jsonFormatVisitors.JsonValueFormat.EMAIL;

public class TestLogin extends TestBase{


    protected LogInPage logInPage;
    protected HomePage homePage;

    @Test(priority = 1)
    public void validLogIn_WithOUT_RememberMe()  {

        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        logInPage = homePage.ClickOnLoginButton();

        logInPage.LohInPage_Data(ConfigrationFile.EMAIL, ConfigrationFile.PASSWORD);

        logInPage.ClickLogIn();


        String actual = newDriver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();

        String expect = ConfigrationFile.EMAIL;

        Assert.assertTrue(actual.contains(expect) );

        try {
            Thread.sleep(500);
            newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


    @Test(priority = 2)
    public void validLogIn_With_RememberMe() throws InterruptedException {

        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        logInPage = homePage.ClickOnLoginButton();

        logInPage.LohInPage_Data(ConfigrationFile.EMAIL, ConfigrationFile.PASSWORD);

        logInPage.ClickRememberMe();

        logInPage.ClickLogIn();


        String actual = newDriver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();


        String expect = ConfigrationFile.EMAIL;


        Assert.assertTrue(actual.contains(expect));


        try {
            Thread.sleep(500);
            newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



    @Test(priority = 3)
    public void INvalidLogIn_With_RememberMe_EmailField_Empty() throws InterruptedException {

        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        logInPage = homePage.ClickOnLoginButton();

        logInPage.LohInPage_Data("", ConfigrationFile.PASSWORD);

        logInPage.ClickRememberMe();

        logInPage.ClickLogIn();


        String actual = newDriver.findElement(By.xpath("//div[@class = \"validation-summary-errors\"]")).getText();


        String expect = "No customer account found";


        Assert.assertTrue(actual.contains(expect));


        try {
            Thread.sleep(500);
             newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

        @Test(priority = 4)
        public void INvalidLogIn_With_RememberMe_PassField_Empty() {

            String newUrl = oldUrl;
            WebDriver newDriver = new ChromeDriver();

            // Navigate the new driver to the old URL
            newDriver.get(newUrl);

            homePage = new HomePage(newDriver);
            logInPage = homePage.ClickOnLoginButton();

            logInPage.LohInPage_Data(ConfigrationFile.EMAIL, "");

            logInPage.ClickRememberMe();

            logInPage.ClickLogIn();


            String actual = newDriver.findElement(By.xpath("//div[@class = \"validation-summary-errors\"]")).getText();


            String expect = "Login was unsuccessful. Please correct the errors and try again.";


            Assert.assertTrue(actual.contains(expect));


            try {
                Thread.sleep(500);
                 newDriver.quit();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

    }


    @Test(priority = 5)
    public void INvalidLogIn_With_RememberMe_PassFieldError() {

        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        logInPage = homePage.ClickOnLoginButton();

        logInPage.LohInPage_Data(ConfigrationFile.EMAIL, "12345789");

        logInPage.ClickRememberMe();

        logInPage.ClickLogIn();


        String actual = newDriver.findElement(By.xpath("//div[@class = \"validation-summary-errors\"]")).getText();


        String expect = "Login was unsuccessful. Please correct the errors and try again.";


        Assert.assertTrue(actual.contains(expect));


        try {
            Thread.sleep(500);
             newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



    @Test(priority = 6)
    public void INvalidLogIn_With_RememberMe_EmailFieldError() {

        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        logInPage = homePage.ClickOnLoginButton();

        logInPage.LohInPage_Data("mahmoud@gmail.com", ConfigrationFile.PASSWORD);

        logInPage.ClickRememberMe();

        logInPage.ClickLogIn();


        String actual = newDriver.findElement(By.xpath("//div[@class = \"validation-summary-errors\"]")).getText();


        String expect = "Login was unsuccessful. Please correct the errors and try again.";


        Assert.assertTrue(actual.contains(expect));


        try {
            Thread.sleep(500);
             newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }




    @Test(priority = 7)
    public void INvalidLogIn_Without_RememberMe_EmailField_Empty() throws InterruptedException {

        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        logInPage = homePage.ClickOnLoginButton();

        logInPage.LohInPage_Data("", ConfigrationFile.PASSWORD);


        logInPage.ClickLogIn();


        String actual = newDriver.findElement(By.xpath("//div[@class = \"validation-summary-errors\"]")).getText();


        String expect = "No customer account found";


        Assert.assertTrue(actual.contains(expect));


        try {
            Thread.sleep(500);
            newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test(priority = 8)
    public void INvalidLogIn_Without_RememberMe_PassField_Empty() {

        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        logInPage = homePage.ClickOnLoginButton();

        logInPage.LohInPage_Data(ConfigrationFile.EMAIL, "");


        logInPage.ClickLogIn();


        String actual = newDriver.findElement(By.xpath("//div[@class = \"validation-summary-errors\"]")).getText();


        String expect = "Login was unsuccessful. Please correct the errors and try again.";


        Assert.assertTrue(actual.contains(expect));


        try {
            Thread.sleep(500);
            newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }


    @Test(priority = 9)
    public void INvalidLogIn_Without_RememberMe_PassFieldError() {

        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        logInPage = homePage.ClickOnLoginButton();

        logInPage.LohInPage_Data(ConfigrationFile.EMAIL, "12345789");

        logInPage.ClickLogIn();


        String actual = newDriver.findElement(By.xpath("//div[@class = \"validation-summary-errors\"]")).getText();


        String expect = "Login was unsuccessful. Please correct the errors and try again.";


        Assert.assertTrue(actual.contains(expect));


        try {
            Thread.sleep(500);
            newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



    @Test(priority = 10)
    public void INvalidLogIn_Without_RememberMe_EmailFieldError() {

        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        logInPage = homePage.ClickOnLoginButton();

        logInPage.LohInPage_Data("mahmoud@gmail.com", ConfigrationFile.PASSWORD);


        logInPage.ClickLogIn();


        String actual = newDriver.findElement(By.xpath("//div[@class = \"validation-summary-errors\"]")).getText();


        String expect = "Login was unsuccessful. Please correct the errors and try again.";


        Assert.assertTrue(actual.contains(expect));


        try {
            Thread.sleep(500);
            newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }




}

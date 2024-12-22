import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.time.Duration;

public class TestRegister extends TestBase{

  protected RegisterPage registerPage;
  protected HomePage homePage;

  @Test(priority = 1)
    public void validData_With_Male() throws InterruptedException {

      String newUrl = oldUrl;
      WebDriver newDriver = new ChromeDriver();

      // Navigate the new driver to the old URL
      newDriver.get(newUrl);

     homePage = new HomePage(newDriver);
     registerPage = homePage.ClickOnRegisterButton();

     registerPage.RegisterPage_Data("mahmoud","niazy","enDDg.l2iHZSKGG653d@gmail.com","test123","test123","male");
     registerPage.CLICKCRegisterBuTTON();

      String actual = newDriver.findElement(By.xpath("//div[@class = \"result\"]")).getText();
      String expect = "Your registration completed";


      Assert.assertTrue(actual.contains(expect));
      try {
          Thread.sleep(500);
          newDriver.quit();
      } catch (InterruptedException e) {
          throw new RuntimeException(e);
      }


  }

    @Test(priority = 2)
    public void validData_With_Female()
    {


        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        registerPage = homePage.ClickOnRegisterButton();

        registerPage.RegisterPage_Data("mahmoud","niazy","k88JKYG657YUTT,IId@gmail.com","test123","test123","Female");
        registerPage.CLICKCRegisterBuTTON();

        String actual = newDriver.findElement(By.xpath("//div[@class = \"result\"]")).getText();
        String expect = "Your registration completed";


        Assert.assertTrue(actual.contains(expect));


        try {
            Thread.sleep(500);
            newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    @Test(priority = 3)
    public void validData_same_Email()
    {


        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        registerPage = homePage.ClickOnRegisterButton();

        registerPage.RegisterPage_Data("mahmoud","niazy","k88JKYG657YUTT,IId@gmail.com","test123","test123","Female");
        registerPage.CLICKCRegisterBuTTON();

        String actual = newDriver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[1]/div/ul/li")).getText();
        String expect = "The specified email already exists";


        Assert.assertTrue(actual.contains(expect));


        try {
            Thread.sleep(500);
            newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    @Test(priority = 4)
    public void Invalid_pass_less_6Digite()
    {


        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        registerPage = homePage.ClickOnRegisterButton();

        registerPage.RegisterPage_Data("mahmoud","niazy","eDDDFSDGZSng.kjWQA@gmail.com","t123","test123","Female");
        registerPage.CLICKCRegisterBuTTON();

        String actual = newDriver.findElement(By.xpath("//span[@for = \"Password\"]")).getText();
        String expect = "The password should have at least 6 characters.";


        Assert.assertTrue(actual.contains(expect));


        try {
            Thread.sleep(500);
            newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

    @Test(priority = 5)
    public void INvalidData_With_Male_NAME_ONE_Character() throws InterruptedException {

        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        registerPage = homePage.ClickOnRegisterButton();

        registerPage.RegisterPage_Data("m","niazy","oZsGDSFDSD4l4YFDS41d@gmail.com","test123","test123","male");
        registerPage.CLICKCRegisterBuTTON();

        String actual = newDriver.findElement(By.xpath("//div[@class =\"result\"]")).getText();
        String expect = "Your registration completed";


        Assert.assertFalse(actual.contains(expect));
        try {
            Thread.sleep(500);
            newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }







    }

    @Test(priority = 6)
    public void INvalidData_With_Female_NAME_ONE_Character()
    {


        String newUrl = oldUrl;
        WebDriver newDriver = new ChromeDriver();

        // Navigate the new driver to the old URL
        newDriver.get(newUrl);

        homePage = new HomePage(newDriver);
        registerPage = homePage.ClickOnRegisterButton();

        registerPage.RegisterPage_Data("m","niazy","e12nFSDFSDGSCLLDg.y97kd@gmail.com","test123","test123","Female");
        registerPage.CLICKCRegisterBuTTON();

        String actual = newDriver.findElement(By.xpath("//div[@class =\"result\"]")).getText();
        String expect = "Your registration completed";


        Assert.assertTrue(actual.contains(expect));


        try {
            Thread.sleep(500);
            newDriver.quit();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }


//    @Test(priority = 7)
//    public void INvalid_Empty_Field() {
//        String newUrl = oldUrl;
//        WebDriver newDriver = new ChromeDriver();
//
//        // Navigate the new driver to the old URL
//        newDriver.get(newUrl);
//
//        homePage = new HomePage(newDriver);
//        registerPage = homePage.ClickOnRegisterButton();
//
//        registerPage.RegisterPage_Data("", "niazy", "eng.y7kd@gmail.com", "test123", "test123", "Female");
//
//
//        // Use findElements to get a list of required indicators
//        List<WebElement> links = newDriver.findElements(By.xpath("//span[@class='required']"));
//        String expectREQ = "*";
//
//        // Check that each required indicator has the expected text
//        for (WebElement link : links) {
//            softAssert.assertEquals(link.getText(), expectREQ);
//        }
//
//        // Use WebDriverWait instead of Thread.sleep if needed
//        // WebDriverWait wait = new WebDriverWait(newDriver, Duration.ofSeconds(10));
//        // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='required']")));
//
//        // Quit the driver once
//        newDriver.quit();
//    }

}

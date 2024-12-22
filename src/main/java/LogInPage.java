import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class LogInPage extends BasePage{


    public LogInPage(WebDriver driver)
    {
        super(driver);
    }
    protected By Email = By.xpath("//input[@class =\"email\"]");

    protected By Password = By.xpath("//input[@class =\"password\"]");

    protected By SLogInButton = By.xpath("//input[contains(@class ,' login-button')]");
    protected By RememberButton = By.xpath("//input[contains(@id,'RememberMe')]");

    WebElement EmailElement;
    WebElement PasswordElement;
    WebElement SignInButtonElement;
    WebElement RememberButtonElement;

    public void EnterEmail(String Text)
    {
         EmailElement = driver.findElement(Email);
        EnterText(EmailElement,Text);
    }


    public void EnterPASSWORD(String password)
    {
        PasswordElement = driver.findElement(Password);
        EnterText(PasswordElement,password);
    }

    public void ClickLogIn()
    {
        SignInButtonElement = driver.findElement(SLogInButton);
        clicking(SignInButtonElement);
    }


    public void ClickRememberMe()
    {
        RememberButtonElement = driver.findElement(RememberButton);
        clicking(RememberButtonElement);
    }




    public void LohInPage_Data(String Email , String Pass )
    {

        EnterEmail(Email);
        EnterPASSWORD(Pass);


    }



}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver)
    {
        super(driver);
    }


    By RegisterButton = By.className("ico-register");


    By LoginButton = By.className("ico-login");

    WebElement RegisterButtonElement ;
    WebElement LoginButtonElement ;



    public RegisterPage ClickOnRegisterButton()
    {
        RegisterButtonElement = driver.findElement(RegisterButton);
        clicking(RegisterButtonElement);

        return new RegisterPage(driver);
    }

    public LogInPage ClickOnLoginButton()
    {
        LoginButtonElement = driver.findElement(LoginButton);
        clicking(LoginButtonElement);
        return new LogInPage(driver);
    }
}






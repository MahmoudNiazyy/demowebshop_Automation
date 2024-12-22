import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class RegisterPage extends BasePage {



    public RegisterPage(WebDriver driver) {

        super(driver);
    }


    protected By FName = By.id("FirstName");
    protected By LName = By.id("LastName");
    protected By Email = By.xpath("//input[@name = \"Email\"]");
    protected By Pass = By.xpath("//input[@id= \"Password\"]");
    protected By ConfirmPass = By.xpath("//input[@id= \"ConfirmPassword\"]");
    protected By MaleGender = By.xpath("//input[@id= \"gender-male\"]");
    protected By FemaleGender = By.xpath("//input[@id= \"gender-female\"]");
    protected By RegisterButton = By.xpath("//input[@id= \"register-button\"]");


    WebElement FemaleGenderElement ;
    WebElement MaleGenderElement ;

    WebElement FNameElement ;
    WebElement LNameElement ;
    WebElement EmailElement ;

    WebElement PassElement ;
    WebElement ConfirmPassElement ;

    WebElement RegisterButtonElement ;




    public void CheckmaleElement()
    {
        MaleGenderElement = driver.findElement(MaleGender);
        clicking(MaleGenderElement);
    }

    public void CheckFemaleElement()
    {
        FemaleGenderElement = driver.findElement(FemaleGender);
        clicking(FemaleGenderElement);
    }




    public void EnterFristName(String name)
    {
        FNameElement = driver.findElement(FName);
        EnterText(FNameElement,name);
    }

    public void EnterLastName(String name)
    {
        LNameElement = driver.findElement(LName);
        EnterText(LNameElement,name);
    }



    public void EnterEmail(String email)
    {
        EmailElement = driver.findElement(Email);
        EnterText(EmailElement,email);
    }


    public void EnterPass(String pass)
    {

        PassElement = driver.findElement(Pass);
        EnterText(PassElement,pass);
    }

    public void EnterConfirmPass(String pass)
    {

        ConfirmPassElement = driver.findElement(ConfirmPass);
        EnterText(ConfirmPassElement,pass);
    }


    public void CLICKCRegisterBuTTON()
    {
        RegisterButtonElement = driver.findElement(RegisterButton);
        clicking(RegisterButtonElement);
    }

    public void RegisterPage_Data(String FName , String LName, String Email, String pass,String Confirm_Pass , String Gender )
    {

        if(Objects.equals(Gender, "Male"))
        {
            CheckmaleElement() ;
        }
        else
        {
            CheckFemaleElement() ;
        }
        EnterFristName(FName);
        EnterLastName(LName);
        EnterEmail(Email);
        EnterPass(pass);
        EnterConfirmPass(Confirm_Pass);


    }

}



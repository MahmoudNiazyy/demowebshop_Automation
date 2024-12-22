import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {


    //protected to inherit in another class
    protected WebDriver driver;
    public BasePage()
    {
        // default constructor
    }
    public BasePage(WebDriver driver)
    {
        this.driver=driver;
    }


    public static void clicking(WebElement click_button)
    {
        click_button.click();
    }


    public static void EnterText(WebElement TextField, String Text)
    {
        TextField.sendKeys(Text);
    }

}


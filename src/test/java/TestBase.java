import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.net.URL;
import java.util.Objects;

public class TestBase {



    // ADD AFTER AND BEFORE TEST


    protected String oldUrl;





    @BeforeTest
    public void setup()
    {


        oldUrl =ConfigrationFile.Basic_Url;





    }


    @AfterTest
    public void close()
    {


        //  driver.quit();

    }


}

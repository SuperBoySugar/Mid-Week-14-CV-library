package uk.co.library.testbase;

import uk.co.library.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import uk.co.library.propertyreader.PropertyReader;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod (alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod (alwaysRun = true)
    public void tearDown(){
//        closeBrowser();
    }
}

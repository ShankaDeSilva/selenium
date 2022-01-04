import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize(); //Open chrome browser as maximize
        driver.get("https://en.wikipedia.org/wiki/Sri_Lanka");

        //Working with Tables-------------------------------------------------------------------------------
        System.out.println(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr/td/table/tbody/tr[1]/td[1]")).getText());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr/td/table/tbody/tr[2]/td[1]")).getText());

        List<WebElement> listOfWebElements = driver.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr/td/table/thead/tr"));

        for (WebElement element : listOfWebElements){
            System.out.println(element.getText());
        }

        //====================================================================================================

//        //Send text to a WebPage.---------------------------------------------------------------------------
//        WebElement searchBox = driver.findElement(By.id("searchInput"));
//        String searchStr = "Sri Lanka";
//        searchBox.sendKeys(searchStr);
//
//        WebElement searchButton = driver.findElement(By.cssSelector("#search-form > fieldset > button"));
//        searchButton.click();

        //====================================================================================================

//        //Clicking on a WebPage--------------------------------------------------------------------
//        WebElement englishButton = driver.findElement(By.id("js-link-box-en"));
//
//        englishButton.click();
//
//        String expectedTitle = "Welcome to Wikipedia,";
//        WebElement titleOfEnglishPage = driver.findElement(By.id("mp-welcome"));
//
//        if (expectedTitle.equals(titleOfEnglishPage.getText())){
//            System.out.println("Test Passed, Page is English one");
//        } else {
//            System.out.println("Test Failed, click() is not Successful");
//        }
//
//        //=====================================================================================================

//        //--------------------Get text from website---------------------------
//        WebElement titleOfWebPage = driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span"));
//
//        String titleText = titleOfWebPage.getText();
//        String expectedText = "Wikipedia";
//
//        if (titleText.equals(expectedText)){
//            System.out.println("Test is Passed");
//        } else {
//            System.out.println("Test is Failed");
//            driver.close();
//            throw new Exception();
//        }
//
//        //=======================================================================

        //------------Selectors--------------------------------------------
        //locators
        //id
//        Long start = System.currentTimeMillis();
//        driver.findElement(By.id("js-link-box-en"));
//        Long stop = System.currentTimeMillis();
//
//        System.out.println("ID : " + (stop - start));
//
//        //xpath
//        start = System.currentTimeMillis();
//        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]/div[2]"));
//        stop = System.currentTimeMillis();
//
//        System.out.println("Xpath : " + (stop - start));
//
//        //cssSelector
//        start = System.currentTimeMillis();
//        driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-featured > div.central-featured-lang.lang3"));
//        stop = System.currentTimeMillis();
//
//        System.out.println("cssSelector : " + (stop - start));

        //===================================================================================================================

        driver.close();
    }
}

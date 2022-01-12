import com.google.common.base.Function;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverManager;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize(); //Open chrome browser as maximize
        driver.get("https://www.wikipedia.org/");


//        //Using JavaScript Executor-------------------------------------------------------------------------------
//        WebElement englishButton = driver.findElement(By.cssSelector("#js-link-box-en > strong"));
//        //Clicking with JavaScriptExecutor
//        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", englishButton);
//
//        //Setting up timeouts
//        ((JavascriptExecutor)driver).executeAsyncScript("window.setTimeout(arguments[arguments.length-1],1000)");
//
//        //Changing the webpage
//        ((JavascriptExecutor)driver).executeScript("window.location = 'https://www.youtube.com/'");
//        ((JavascriptExecutor)driver).executeAsyncScript("window.setTimeout(arguments[arguments.length-1],1000)");
//
//        //Scroll the webpage
//        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1800)");
//        ((JavascriptExecutor)driver).executeAsyncScript("window.setTimeout(arguments[arguments.length-1],1000)");
//
//        //========================================================================================================
//
//
////        System.out.println(driver.getTitle());
////
////        //Explicit Wait
////        WebDriverWait wait = new WebDriverWait(driver, 10);
////        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("js-link-box-si"))));
////
////        //Fluent Wait
////        Wait fluentWait = new FluentWait<WebDriver>(driver)
////                .withTimeout(15,TimeUnit.SECONDS)
////                .pollingEvery(5,TimeUnit.SECONDS)
////                .ignoring(NoSuchElementException.class);
////
////        fluentWait.until(new Function<WebDriver, WebElement>(){
////           public WebElement apply(WebDriver driver){
////               return driver.findElement(By.id("js-link-box-si"));
////           }
////        });
//
////        //Working with Tables-------------------------------------------------------------------------------
////        System.out.println(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr/td/table/tbody/tr[1]/td[1]")).getText());
////        System.out.println(driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr/td/table/tbody/tr[2]/td[1]")).getText());
////
////        List<WebElement> listOfWebElements = driver.findElements(By.xpath("//*[@id=\"mw-content-text\"]/div[1]/table[4]/tbody/tr/td/table/thead/tr"));
////
////        for (WebElement element : listOfWebElements){
////            System.out.println(element.getText());
////        }
////
////        //====================================================================================================
//
////        //Send text to a WebPage.---------------------------------------------------------------------------
////        WebElement searchBox = driver.findElement(By.id("searchInput"));
////        String searchStr = "Sri Lanka";
////        searchBox.sendKeys(searchStr);
////
////        WebElement searchButton = driver.findElement(By.cssSelector("#search-form > fieldset > button"));
////        searchButton.click();
//
//        //====================================================================================================
//
////        //Clicking on a WebPage--------------------------------------------------------------------
////        WebElement englishButton = driver.findElement(By.id("js-link-box-en"));
////
////        englishButton.click();
////
////        String expectedTitle = "Welcome to Wikipedia,";
////        WebElement titleOfEnglishPage = driver.findElement(By.id("mp-welcome"));
////
////        if (expectedTitle.equals(titleOfEnglishPage.getText())){
////            System.out.println("Test Passed, Page is English one");
////        } else {
////            System.out.println("Test Failed, click() is not Successful");
////        }
////
////        //=====================================================================================================
//
////        //--------------------Get text from website---------------------------
////        WebElement titleOfWebPage = driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-textlogo > h1 > span"));
////
////        String titleText = titleOfWebPage.getText();
////        String expectedText = "Wikipedia";
////
////        if (titleText.equals(expectedText)){
////            System.out.println("Test is Passed");
////        } else {
////            System.out.println("Test is Failed");
////            driver.close();
////            throw new Exception();
////        }
////
////        //=======================================================================
//
//        //------------Selectors--------------------------------------------
//        //locators
//        //id
////        Long start = System.currentTimeMillis();
////        driver.findElement(By.id("js-link-box-en"));
////        Long stop = System.currentTimeMillis();
////
////        System.out.println("ID : " + (stop - start));
////
////        //xpath
////        start = System.currentTimeMillis();
////        driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[2]/div[2]"));
////        stop = System.currentTimeMillis();
////
////        System.out.println("Xpath : " + (stop - start));
////
////        //cssSelector
////        start = System.currentTimeMillis();
////        driver.findElement(By.cssSelector("#www-wikipedia-org > div.central-featured > div.central-featured-lang.lang3"));
////        stop = System.currentTimeMillis();
////
////        System.out.println("cssSelector : " + (stop - start));
//
//        //===================================================================================================================

        driver.close();
    }
}

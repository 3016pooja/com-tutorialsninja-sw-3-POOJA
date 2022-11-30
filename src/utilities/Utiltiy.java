package utilities;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Utiltiy extends BaseTest {
    public void clickOnElement(By by) {

        WebElement loginLink = driver.findElement(by);
        loginLink.click();
    }

    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    /**
     * This method will send text on element
     */
    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }
    //**************************Method to verify element or text****************
    public void verifyText(String expectedMessage,By by){
        WebElement actualMessageText = driver.findElement(by);
        String actualMessage=actualMessageText.getText();
        Assert.assertEquals("Not as expected",actualMessage,expectedMessage);

    }


//************************* Alert Methods *****************************************************

    /**
     * This method will switch to alert
     */
    public void switchToAlert() {
        driver.switchTo().alert();
    }

    // Homework 4 Method acceptAlert,dismissAlert,  String getTextFromAlert, sendTextToAlert(String text)

    //************************** Select Class Methods ***********************************************

    /**
     *  This method will select option by visible text
     */
    public void selectByVisibleTextFromDropDown(By by, String text) {
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);
    }

    public void sendToElement(By by ,String text) {
        WebElement emailField = driver.findElement(by);
        emailField.sendKeys(text);
    }


    /**
     * This method will select the option by value
     */

    /**
     * This method will select the option by index
     */

    /**
     * This method will select the option by contains text
     */

    //***************************** Window Handle ************************************
    //***************************** Action Class *************************************
// mouseHoverToElement(By by), mouseHoverToElementAndClick(By by)
    public void mouseHover(By by){
        Actions actions = new Actions(driver);
        WebElement hover = driver.findElement(by);
        actions.moveToElement(hover).build().perform();
    }
}

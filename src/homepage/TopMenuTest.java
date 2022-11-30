package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Utiltiy;

public class TopMenuTest extends Utiltiy {
    String baseUrl="http://tutorialsninja.com/demo/index.php?";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    public void selectMenu(String menu) {
        clickOnElement(By.linkText(menu));
    }

    @Test
   public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        //1.1Mouse hover on “Desktops” Tab and click
        Actions actions = new Actions(driver);
        WebElement hoverDesktops = driver.findElement(By.xpath("//a[text()='Desktops']"));
        actions.moveToElement(hoverDesktops).build().perform();
        //1.2 call selectMenu method and pass the menu = “Show All Desktops”
        selectMenu("Show All Desktops");
       // 1.3 Verify the text ‘Desktops’
        verifyText("Desktops",By.xpath("//h2[contains(text(),'Desktops')]"));

   }
   @Test
   public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        //2.1 Mouse hover on “Laptops & Notebooks” Tab and click
       Actions actions = new Actions(driver);
       WebElement laptopAndNotebooks = driver.findElement(By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]"));
       actions.moveToElement(laptopAndNotebooks).click().build().perform();
       //call selectMenu method and pass the menu = Show All Laptops & Notebooks
       selectMenu("Show All Laptops & Notebooks");
       //Verify the text ˜Laptops & Notebooks
       verifyText("Laptops & Notebooks",By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]"));
   }
   @Test
   public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
//3.1 Mouse hover on Components Tab and click
       Actions actions = new Actions(driver);
       WebElement Components = driver.findElement(By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]"));
       actions.moveToElement(Components).click().build().perform();
       //3.2 call selectMenu method and pass the menu = Show All Components
       selectMenu("Show All Components");
       //3.3 Verify the text Components
       verifyText("Components",By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]"));
   }


   @After
    public void tearDown(){
        //closeBrowser();
   }
}


package Web;

import Web.WebElements.MyWebElementIsWrongException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.SortedMap;

import static Web.Driver.getDriver;
import static Web.WebElements.MyWebElements.*;

public class TestSteplerim extends ClassObjectlerim {


    //STEP1 Launch Browser and GoTo amazon.ca
    public void goToUrl() {
        try {
            System.out.println("Step1 ");
            getDriver().get(Constants.URL);
            System.out.println("Step1 is done");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Step 1, There  is an error");
        }

    }

    //STEP 2 Locate web element searchbox on amazon.ca

    public static void sendKeysToSearchEngine() {
        try {
            System.out.println("Step 2 has started");
            (searchbox = getWebElement("searchbox")).sendKeys(Constants.SEARCHITEM);
            System.out.println(" Step 2 has done");


        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("There is an error in Step 2");

        }

       /* Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);*/

        //Step 3 Click Enter to search the item


    }

    public void enter() {
        try {
            System.out.println("Step 3 has started");
            searchbox.sendKeys(Keys.ENTER);
            System.out.println("Step 3:enter has clicked");
        } catch (Exception e) {
            System.out.println("There is an error in Step3");
        }
    }
   //Step 4 locate the web element in desired time

    public void LocateTheItem() {
        try {
            System.out.println("Step 4 has stated");
            waitUtil.webDriverWait(kitapAdi=getWebElement("kitapAdi"),"visibility");//implicitywait
            kitapAdi.click();
            System.out.println("Step4:kitap adi has been located");

        }catch (Exception e){
            System.out.println("There is an error in Step 4");
        }
    }
    //Step 5 find and click add to card button
    public void addToCard() {
        try {
            System.out.println("Step 5 has started");
            waitUtil.webDriverWait(addToCard=getWebElement("addToCard"),"clickability");//implicity wait
            addToCard.click();
            System.out.println("Step 5 has done");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("There is an error in Step 5");
        }
    }
   //Step 6 Go to check out
    public void GoToCheckOut() {
        try {
            System.out.println("Step 6 has started");
            waitUtil.webDriverWait(checkout=getWebElement("checkout"),"clickability");
            checkout.click();
            System.out.println("Step 6 has done");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("There is an error in Step 6");
        }

    }

    //Step 7 find email box and send key
    public void sendEmail() {
        try{
            System.out.println("Step 7 has started");
            (emailBox=getWebElement("emailBox")).sendKeys(Constants.EMAIL);
            getWebElement("emailBoxContinue").click();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("There is an error in Step 7");
        }
    }
    //Step 8 Password box a key gonderme
    public void sendPassword() {
        try {
            System.out.println("Step 8 has started");
            (passwordBox=getWebElement("passwordBox")).sendKeys(Constants.PASSWORD);
            getWebElement("signInButton").click();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("There is an error in Sterp 8");
        }
    }
}
package Web.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Web.Driver.getDriver;


    public class MyWebElements {

        static public WebElement searchbox;
        static public WebElement kitapAdi;
        static public WebElement addToCard;
        static public WebElement checkout;

        static public WebElement emailBox;

        static public WebElement emailBoxContinue;

        static public WebElement passwordBox;

        static public WebElement signInButton;

        public static WebElement getWebElement(String webElement) throws MyWebElementIsWrongException {
            WebElement element = null;

            switch (webElement) {
                case "searchbox":
                    element = getDriver().findElement(By.id("twotabsearchtextbox"));
                    element = getDriver().findElement(By.cssSelector("input#twotabsearchtextbox"));
                    element = getDriver().findElement(By.cssSelector("input.nav-input[name='field-keywords']"));
                    element = getDriver().findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
                    element = getDriver().findElement(By.name("field-keywords"));
                    break;

                case "kitapAdi":
                    //element = getDriver().findElement(By.linkText("Joy Jots: Exercises for a Happy Heart - Second Edition"));
                    element = getDriver().findElement((By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[2]/span/a/div/img")));
                    //element = getDriver().findElement(By.className("s-product-image-container aok-relative s-image-overlay-grey s-text-center s-padding-left-small s-padding-right-small puis-spacing-small s-height-equalized"));
                    break;


                case "addToCard":
                   // element = getDriver().findElement(By.id("add-to-cart-button"));
                    //element = getDriver().findElement(By.name("submit.add-to-cart"));
                    element = getDriver().findElement(By.xpath("//*[@id='add-to-cart-button']"));
                   // element = getDriver().findElement(By.className("a-button-text"));
                    //element = getDriver().findElement(By.cssSelector("#add-to-cart-button"));
                    break;

                case "checkout":
                    // element = getDriver().findElement(By.name("proceedToRetailCheckout"));
                    //element = getDriver().findElement(By.className("a-button-input"));
                    element = getDriver().findElement(By.xpath("//*[@id='sc-buy-box-ptc-button']/span/input"));//element = getDriver().findElement(By.id("proceed-to-checkout-action"));
                    //element = getDriver().findElement(By.cssSelector("#proceed-to-checkout-action"));
                    break;

                case "emailBox":
                    // element = getDriver().findElement(By.cssSelector("input[type=email"));
                    //element = getDriver().findElement(By.id("ap_email"));
                    element = getDriver().findElement(By.xpath("//*[@id='ap_email']"));
                    break;

                case "emailBoxContinue":
                    element = getDriver().findElement(By.xpath("//*[@id='continue']"));
                    break;

                case "passwordBox":
                    element = getDriver().findElement(By.xpath("//*[@id=\"ap_password\"]"));
                    //element=getDriver().findElement(By.cssSelector("input#ap_password"));
                   // element=getDriver().findElement(By.id("ap_password"));


                    break;

                case "signInButton":
                    element = getDriver().findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
                    //element=getDriver().findElement(By.className("a-button-input"));
                    //element=getDriver().findElement(By.id("signInSubmit"));
                    break;


                default:
                    throw new MyWebElementIsWrongException("String Parameter Is Wrong");


            }
            return element;
        }
    }

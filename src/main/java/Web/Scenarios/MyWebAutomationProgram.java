package Web.Scenarios;

import Web.ClassObjectlerim;
import Web.TestSteplerim;

public class MyWebAutomationProgram extends ClassObjectlerim {

    public static void main(String[] args) throws InterruptedException{

        //Step1 LaunchBrowser
        testStepMethodlari.goToUrl();

        //Step2 sendKeysToSearchEngine
        testStepMethodlari.sendKeysToSearchEngine();

        //Step 3 enter
        testStepMethodlari.enter();

        //Step4 locate the item
        testStepMethodlari.LocateTheItem();

        //Step 5 add to card
        testStepMethodlari.addToCard();

        //Step 6 go to checkout
        testStepMethodlari.GoToCheckOut();

        //Step 7 send email to the emailbox
        testStepMethodlari.sendEmail();

        //Step 8 Sendpassword to the password box

        testStepMethodlari.sendPassword();



    }


}

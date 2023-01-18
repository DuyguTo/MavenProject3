package Web;

import Web.ReusableMethods.WaitUtility;
import org.openqa.selenium.interactions.Actions;

import static Web.Driver.getDriver;

public class ClassObjectlerim {
    public static TestSteplerim testStepMethodlari = new TestSteplerim();
    public static WaitUtility waitUtil = new WaitUtility();
    public static Actions actions=new Actions(getDriver());
}
//PROJEMDE BELLI CLASSLARIM VAR.
//HER CLASSIN KENDINE GORE BIR AMACI/GOREVI VAR.
//EGER BIR CLASSIN ICINDEKI METHOD YA DA DEGISKENE OBJE ILE ERISMEM GEREKIYORSA TUM HAZIR OBJELERIMI BURADA DEPOLARIM
//IHTIYAC DUYDUKCA "ClassObjectlerim" CLASSINI EXTENDS EDIP BURADAKI OBJECTLERIMI KULLANIRIM.
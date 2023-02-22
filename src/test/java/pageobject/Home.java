package pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;


public class Home extends PageObject {
    @FindBy(xpath = "//a[@id='btn-make-appointment']")
    public WebElementFacade btnSacarCita;

    public void clicSacarCita(){
        btnSacarCita.click();
    }
}
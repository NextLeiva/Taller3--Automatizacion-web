package pageobject;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;



public class Login extends PageObject {
    @FindBy(id = "txt-username")
    public WebElementFacade userTxt;

    @FindBy(id = "txt-password")
    public WebElementFacade passwordTxt;

    @FindBy(id = "btn-login")
    public WebElementFacade btnLogin;

    public void insertUser(String user){
        userTxt.type(user);
    }
    public void insertPassword(String password){
        passwordTxt.type(password);
    }
    public void clicLogin(){
        btnLogin.click();
    }
}

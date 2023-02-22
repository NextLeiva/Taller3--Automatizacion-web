package pageobject;

import actions.SelectOptions;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Appointment extends PageObject {


    @FindBy(id = "combo_facility")
    public WebElementFacade facilityTxt;

    @FindBy(xpath = "//label[@class='checkbox-inline']")
    public WebElementFacade checkboxHospital;
    /*  private static final String chkHospitalReadmission = "//div/label[contains(text(),'";

      public void checkHospital(String chkHospital) {
         // checkboHospital.click();
          getDriver().findElement(By.xpath(chkHospitalReadmission + chkHospital + "')]")).click();
      }
  */
    @FindBy(xpath = "//label[@class='radio-inline']/input")
    public List<WebElementFacade> rdPrograms;
    @FindBy(xpath = "//input[@name='visit_date']")
    public WebElementFacade dtpVisit;
    @FindBy(id = "txt_comment")
    public WebElementFacade commentTxt;
    @FindBy(xpath = "//button[@id='btn-book-appointment']")
    public WebElementFacade btnBookApp;
    @FindBy(xpath = "//*[contains(@id,'facility')]")
    public WebElementFacade txtFacility;
    @FindBy(xpath = "//*[contains(@id,'program')]")
    public WebElementFacade txtProgram;
    @FindBy(xpath = "//*[contains(@id,'visit_date')]")
    public WebElementFacade txtVisitDate;
    @FindBy(xpath = "//*[contains(@id,'comment')]")
    public WebElementFacade txtComment;


    public void selectFacility(String facility) {
        Select elementFacility = new Select(facilityTxt);
        elementFacility.selectByVisibleText(facility);
    }

    public void checkHospital() {
        checkboxHospital.click();
    }

    public void chkPrograms(String programs) {
        SelectOptions.in(rdPrograms, programs);
    }

    public void insertFecha(String fecha) {
        dtpVisit.type(fecha);
    }

    public void insertComment(String comment) {
        commentTxt.type(comment);
    }

    public void clicBook() {
        btnBookApp.click();
    }

    public void validate(String facility, String program, String date, String comment) {
        Assert.assertEquals(txtFacility.getText(), facility);
        Assert.assertEquals(txtProgram.getText(), program);
        Assert.assertEquals(txtVisitDate.getText(), date);
        Assert.assertEquals(txtComment.getText(), comment);
    }

}

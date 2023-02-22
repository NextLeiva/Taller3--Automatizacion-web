package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import pageobject.Appointment;
import pageobject.Home;
import pageobject.Login;

public class LoginKatalonStepDefinitions {

    @Steps
    Home home;
    @Steps
    Login login;
    @Steps
    Appointment appointment;

    @Given("^que el usuario ingresa a la web Cura Healthcare$")
    public void que_el_usuario_ingresa_a_la_web_cura_healthcare() {
        home.open();
    }

    @And("^presiona el boton para concretar una cita$")
    public void presiona_el_boton_para_concretar_una_cita() {

        home.clicSacarCita();
    }

    @And("^ingresa el usuario (.*)$")
    public void ingresa_el_usuario(String usuario) {
        login.insertUser(usuario);
    }

    @And("^ingresa el password (.*)$")
    public void ingresa_el_password(String contrasena) {
        login.insertPassword(contrasena);
    }

    @And("^presiona el boton login para concertar datos$")
    public void presiona_el_boton_login_para_concertar_datos() {
       login.clicLogin();
    }

    @And("^seleccionar una instalacion (.*)$")
    public void seleccionar_una_instalacion(String instalacion) {
        appointment.selectFacility(instalacion);
    }

    @And("^marcar para la readmisnion$")
    public void marcar_para_la_readmisnion() {
        appointment.checkHospital();
    }

    @And("^seleccionar un programa (.*)$")
    public void seleccionar_un_programa(String programa) {
        appointment.chkPrograms(programa);
    }

    @And("^seleccionar una fecha (.*)$")
    public void seleccionar_una_fecha(String fecha) {
        appointment.insertFecha(fecha);
    }

    @And("^ingresa un comentario (.*)$")
    public void ingresa_un_comentario(String comentario) {
        appointment.insertComment(comentario);
    }

    @And("^confirma la reserva$")
    public void confirma_la_reserva() {
        appointment.clicBook();
    }

    @Then("^validar que los datos sean ingresados correctamente (.*),(.*),(.*) y (.*)$")
    public void validar_que_los_datos_sean_ingresados_correctamente(String facility,String programa,String visita,String comentario) {
        appointment.validate(facility,programa,visita,comentario);
    }


}

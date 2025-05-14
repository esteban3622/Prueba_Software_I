package steps;
 
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;
 
public class SauceDemoSteps {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
 
    @Given("Navego a la página de inicio de sesión de Saucedemo")
    public void iNavigateToFRT() {
        landingPage.navigateToFreeRangeTesters();
    }
    
    @When("Ingreso el nombre de usuario {word}")
    public void iWriteUsername(String username) {
        landingPage.writeOnUsername(username);
    }
 
    @And("Ingreso la contraseña {word}")
    public void iWritePassword(String password) {
        landingPage.writeOnPassword(password);
    }

    @And("Hago clic en el botón de Login")
    public void iClickOnLoginButton() {
        landingPage.clickOnLoginButton();
    }
    
    @Then("Debería mostrar un mensaje de error de inicio de sesión")
    public void validateMessage(){
        Assert.assertEquals(landingPage.getMessage(), "Epic sadface: Sorry, this user has been locked out.");

    }
}
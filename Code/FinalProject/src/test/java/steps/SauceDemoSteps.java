package steps;
 
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;
 
public class SauceDemoSteps {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
 
    @Given("Navego a la página de inicio de sesión de Saucedemo")
    public void iNavigateToPage() {
        landingPage.navigateToWeb();
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
}
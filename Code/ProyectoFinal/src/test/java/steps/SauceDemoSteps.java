package steps;
 
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.PaginaPrincipal;
 
public class SauceDemoSteps {
 
    PaginaPrincipal landingPage = new PaginaPrincipal();
 
    @Given("Navego a la página de la Calculadora Básica")
    public void iNavigateToFRT() {
        landingPage.navigateToBasicCalculator();
    }
    
    @When("Ingreso {word} en el campo \"Build\"")
    public void iWriteUsername(String opcionBuild) {
        landingPage.cambiarBuild(opcionBuild);
    }
 
    @And("Ingreso \"{word}\" en el campo \"Number 1\"")
    public void iWritePassword(String Number) {
        landingPage.writeFristNumber(Number);
    }

    // @And("Hago clic en el botón de Login")
    // public void iClickOnLoginButton() {
    //     landingPage.clickOnLoginButton();
    // }
    
    // @Then("Debería ser redirigido a la página de productos")
    // public void validateMessage(){
    //     Assert.assertEquals(inventoryPage.getElementText(), "Products");
    //     // Assert.assertEquals(inventoryPage.getURLPage(), "https://www.saucedemo.com/v1/inventory.html");
                
    // }

    // @Then("Debería ser redirigido a la URL {word}")
    // public void validateURL(String urlPage){
    //     Assert.assertEquals(inventoryPage.getURLPage(), urlPage);
                
    // }
}
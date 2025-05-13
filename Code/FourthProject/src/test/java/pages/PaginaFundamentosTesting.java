package pages;
 
public class PaginaFundamentosTesting extends BasePage {
 
    private String fundamentosTestingLink = "//h3[normalize-space()='Introducción al Testing de Software']";
 
    public PaginaFundamentosTesting() {
        super(driver);
    }
 
    public void clickIntroduccionTestingLink() {
        clickElement(fundamentosTestingLink);
    }
 
}

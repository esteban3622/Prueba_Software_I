package pages;

public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//a[normalize-space()='Recursos' and @href]";

    public PaginaPrincipal() {
        super(driver);
    }

    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com/");
    }

    public void clickOnSectionNavigationBar(){
        clickElement(sectionLink);
    }
    
}

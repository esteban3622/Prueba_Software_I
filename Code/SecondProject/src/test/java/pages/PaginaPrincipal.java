package pages;

public class PaginaPrincipal extends BasePage {

    public PaginaPrincipal() {
        super(driver);
    }

    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com/");
    }
    
}

package pages;

public class PaginaPrincipal extends BasePage {

    private String sectionLink = "//a[@class='sc-hORkcV khhKqW sc-fAomSb sc-ijEwUV ibWYYr urOie'][normalize-space()='%s']";
 
    public PaginaPrincipal() {
        super(driver);
    }
 
    // Método para navegar a www.freerangetesters.com
    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com");
 
    }
 
    public void clickOnSectionNavigationBar(String section) {
        // Reemplaza el marcador de posición en sectionLink con el nombre
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }
    
}

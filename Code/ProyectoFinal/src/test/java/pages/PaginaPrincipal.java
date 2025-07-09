package pages;

public class PaginaPrincipal extends BasePage {

    private String elementoBuild = "//select[@id='selectBuild']";
    private String elementoFirstNumber = "//input[@id='number1Field']";
    private String elementoSecondNumber = "//input[@id='number2Field']";
    private String elementoOperation = "//select[@id='selectOperationDropdown']";
    private String elementoCalculate = "//input[@id='calculateButton']";
 
    public PaginaPrincipal() {
        super(driver);
    }
 
    public void navigateToBasicCalculator() {
        navigateTo("https://testsheepnz.github.io/BasicCalculator.html");
 
    }

    public void cambiarBuild(String opcionBuilda){
        selectFromDropdownByValue(elementoBuild, opcionBuilda);
    }
 
    public void writeFristNumber(String number){
        write(elementoFirstNumber, number);
    }
    
    public void writeSecondNumber(String keysToSend){
        write(elementoSecondNumber, keysToSend);
    }

    // public void clickOnLoginButton() {
    //     clickElement(elementClickBoton);
    // }

    // public String getMessage(){
    //     return getText(elementoMessage);
        
    // }
    
}

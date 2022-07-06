package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='appointment-btn scrollto']")
    public WebElement makeAnAppointment;
    @FindBy(xpath = "//*[@data-icon='user']")
    public WebElement userIcon;
    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButton;
    @FindBy(xpath = "//*[text()='Sign in']")
    public WebElement signInButton;
    @FindBy(xpath = "//span[.='Items&Titles']")
    public WebElement itemsAndTitlesButton;
    @FindBy(xpath = "//a[@href='/patient']")
    public WebElement patientButton;
    @FindBy(linkText = "SIGN IN AGAIN")
    public WebElement signInAgain;
    @FindBy(xpath = "//*[@id='hero']/div/h1")
    public WebElement homePage;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signInBox;

}

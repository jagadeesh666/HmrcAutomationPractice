package automationPractice.pages;

import automationPractice.Utils.Utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;


public class RegistrationPage extends BasePage {

    public Utils myUtility=new Utils();

    public RegistrationPage(){
    PageFactory.initElements(driver, this);
    }

    @FindBy(id = "create-account_form")
    private WebElement createAccountForm;

    @FindBy(id = "email_create")
    private WebElement userIdField;

    @FindBy(id="SubmitCreate")
    private WebElement createAnAccountButton;

    @FindBy(id="id_gender1")
    private WebElement maleGenderField;

    @FindBy(id="id_gender2")
    private WebElement femaleGenderField;

    @FindBy(id="customer_firstname")
    private WebElement customerFirstNameField;

    @FindBy(id="customer_lastname")
    private WebElement customerLastNameField;

    @FindBy(id="firstname")
    private WebElement addressFirstNameField;

    @FindBy(id="lastname")
    private WebElement addressLastNameField;

    @FindBy(id="passwd")
    private WebElement passwordField;

    // address element
    @FindBy(id="address1")
    private WebElement address1Field;

    @FindBy(id="city")
    private WebElement cityField;

    @FindBy(id="id_state")
    private WebElement stateField;

    @FindBy(id="postcode")
    private WebElement postcodeField;

    @FindBy(id="id_country")
    private WebElement countryField;

    @FindBy(id="phone_mobile")
    private WebElement mobilePhoneField;

    @FindBy(id="alias")
    private WebElement aliasField;

    @FindBy(id="submitAccount")
    private WebElement clickRegisterButtonField;

// welcome login registration message

    @FindBy(xpath="//*[@id=\"center_column\"]/p")
    private WebElement welcomeLoginMessageField;

    // registration error message
    @FindBy(css=".alert.alert-danger>p")
    private WebElement registrationErrorMessageField;


    public boolean isUserOnRegistrationPage() {
//
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

        return createAccountForm.isDisplayed();
    }


    public void clickCreateAnAccount() {
        //@TODO scroll to the element and click
        createAnAccountButton.click();
    }
    public void enterUserId(String userid) {

        String userName = ""+(int)(Math.random()*Integer.MAX_VALUE);
        String emailID = userid+userName+"@gmail.com";
        userIdField.sendKeys(emailID);

    }

    public void enterPersonnelInfo(String title, String firstname, String surname, String password)
    {
        if (title.equals("Mr")) {

            maleGenderField.click();
        } else {
            femaleGenderField.click();
        }



        customerFirstNameField.sendKeys(firstname);
        customerLastNameField.sendKeys(surname);

        //address section-first name
        addressFirstNameField.clear();
        addressFirstNameField.sendKeys(firstname);
        // address section - last name
        addressLastNameField.clear();
        addressLastNameField.sendKeys(surname);
        // password field
        passwordField.sendKeys(password);

    }

    public void  enterAddressInfo(String address1, String city, String state, String postcode, String country, String mobile, String alias)
    {

            address1Field.sendKeys(address1);
            cityField.sendKeys(city);
            myUtility.selectFromList(stateField,state);
            postcodeField.sendKeys(postcode);
            myUtility.selectFromList(countryField,country);
            mobilePhoneField.sendKeys(mobile);
            aliasField.sendKeys(alias);
    }

    public void clickRegister() {

            clickRegisterButtonField.click();
    }
    public boolean welcomeLoginMessage(String Message)
    {

            return (welcomeLoginMessageField.getText().contains(Message));
    }
    public boolean registrationErrorMessage(String Message)
    {

            return (registrationErrorMessageField.getText().contains(Message));
    }
}
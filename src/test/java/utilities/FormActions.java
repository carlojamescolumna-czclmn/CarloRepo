package utilities;

import config.TestDataLoader;
import pages.QAFormPage;

public class FormActions {
    public static void fillForm(QAFormPage page, String fileName) {
    	TestDataLoader data = new TestDataLoader(fileName);
    	page.firstNameTextBox().type(data.get("firstName"));
    	page.lastNameTextBox().type(data.get("lastName"));
    	page.phoneNumberTextBox().type(data.get("phoneNumber"));
    	page.countryDropdown().click();
    	page.countryDropdown().type(data.get("country"));
    	page.countryDropdown().selectByVisibleText(data.get("country"));
    	page.emailAddressTextBox().type(data.get("email"));
    	page.passwordTextBox().type(data.get("password"));
    	page.iAgreeCheckbox().check();
    	page.registerButton().click();
    }
    public static void clearForm(QAFormPage page) {
    	page.firstNameTextBox().textClear();
    	page.lastNameTextBox().textClear();
    	page.phoneNumberTextBox().textClear();
    	page.countryDropdown().click();
    	page.countryDropdown().type("Select a country...");
    	page.countryDropdown().selectByVisibleText("Select a country...");
    	page.emailAddressTextBox().textClear();
    	page.passwordTextBox().textClear();
    }
}

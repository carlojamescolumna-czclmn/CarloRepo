package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.*;

public class QAFormPage {
    private WebDriver driver;

    public QAFormPage(WebDriver driver) {
        this.driver = driver;
    }
    public TextBox firstNameTextBox() {
        return new TextBox(driver.findElement(By.id("firstName")));
    }
    public TextBox lastNameTextBox() {
        return new TextBox(driver.findElement(By.id("lastName")));
    }

    public TextBox phoneNumberTextBox() {
        return new TextBox(driver.findElement(By.id("phone")));
    }

    public TextBox emailAddressTextBox() {
        return new TextBox(driver.findElement(By.id("emailAddress")));
    }

    public TextBox passwordTextBox() {
        return new TextBox(driver.findElement(By.id("password")));
    }


    public Dropdown countryDropdown() {
        WebElement element = driver.findElement(By.id("countries_dropdown_menu"));
        return new Dropdown(element);
    }


    public CheckBox iAgreeCheckbox() {
        return new CheckBox(driver.findElement(By.id("exampleCheck1")));
    }


    public Button registerButton() {
        return new Button(driver.findElement(By.id("registerBtn")));
    }


    public Label alertBox() {
        return new Label(driver.findElement(By.id("message")));
    }

    
    public Label resultFirstName() {
        return new Label(driver.findElement(By.id("resultFn")));
    }

    public Label resultLastName() {
        return new Label(driver.findElement(By.id("resultLn")));
    }

    public Label resultPhoneNumber() {
        return new Label(driver.findElement(By.id("resultPhone")));
    }

    public Label resultCountry() {
        return new Label(driver.findElement(By.id("country")));
    }

    public Label resultEmail() {
        return new Label(driver.findElement(By.id("resultEmail")));
    }
}

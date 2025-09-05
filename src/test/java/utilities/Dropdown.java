package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
    private Select select;
    private WebElement element;

    public Dropdown(WebElement element) {
        this.select = new Select(element);
        this.element = element;
    }

    public void selectByVisibleText(String text) {
        select.selectByVisibleText(text);
    }

    public String getSelectedOption() {
        return select.getFirstSelectedOption().getText();
    }
    
    public void type(String text) {
        element.sendKeys(text);
    }
    public void click() {
        element.click();
    }
}

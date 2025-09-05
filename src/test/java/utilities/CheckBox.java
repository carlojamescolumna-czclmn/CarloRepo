package utilities;

import org.openqa.selenium.WebElement;

public class CheckBox {
    private WebElement element;

    public CheckBox(WebElement element) {
        this.element = element;
    }

    public void check() {
        if (!element.isSelected()) {
            element.click();
        }
    }

    public void uncheck() {
        if (element.isSelected()) {
            element.click();
        }
    }

    public boolean isChecked() {
        return element.isSelected();
    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }
}
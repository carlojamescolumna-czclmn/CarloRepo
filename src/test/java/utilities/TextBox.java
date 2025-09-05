package utilities;

import org.openqa.selenium.WebElement;

public class TextBox {
    private WebElement element;

    public TextBox(WebElement element) {
        this.element = element;
    }

    public void type(String text) {
        element.clear();
        element.sendKeys(text);
    }

    public String getText() {
        return element.getAttribute("value");
    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }
    
    public void textClear() {
        element.clear();
  }
}
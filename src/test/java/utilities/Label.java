package utilities;

import org.openqa.selenium.WebElement;

public class Label {
    private WebElement element;

    public Label(WebElement element) {
        this.element = element;
    }

    public String getText() {
        return element.getText();
    }

    public boolean isDisplayed() {
        return element.isDisplayed();
    }
	public String getTextSplit () {
		String text = element.getText();
		String[] parts = text.split(": ");
		String result = parts[1];
		return result;
	}
}

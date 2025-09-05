package tests;

import org.junit.jupiter.api.Test;

import base.BaseTest;
import pages.QAFormPage;
import utilities.FormActions;
import utilities.Steps;
import utilities.ValidationUtils;

public class QAFormTest_Scenario1 extends BaseTest {

    @Test
    public void test() {
    	Steps steps = new Steps();
    	QAFormPage page = new QAFormPage(driver);
    	
    	steps.StepInfo("Scenario 1: Fill out every field and no error is encountered.");
    	steps.StepInfo("When: Form is filled out.");
    	FormActions.fillForm(page, "scenario1.properties");
    	steps.StepInfo("Then: Validate if Registration is successful.");
    	ValidationUtils.validateEquals(page.alertBox().getText(), "Successfully registered the following information.");
    	steps.StepInfo("Then: Validate if Registration info is correct.");
    	ValidationUtils.validateEquals(page.resultFirstName().getTextSplit(), "Luke");
    	ValidationUtils.validateEquals(page.resultLastName().getTextSplit(), "Skywalker");
    	ValidationUtils.validateEquals(page.resultPhoneNumber().getTextSplit(), "0912345678");
    	ValidationUtils.validateEquals(page.resultCountry().getTextSplit(), "Philippines");
    	ValidationUtils.validateEquals(page.resultEmail().getTextSplit(), "LukeSkywalker@email.com");
    	
    }
}

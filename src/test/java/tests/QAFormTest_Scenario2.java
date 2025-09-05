package tests;

import org.junit.jupiter.api.Test;

import base.BaseTest;
import pages.QAFormPage;
import utilities.FormActions;
import utilities.Steps;
import utilities.ValidationUtils;

public class QAFormTest_Scenario2 extends BaseTest {
	@Test
    public void errorTest2() {
    	Steps steps = new Steps();
    	QAFormPage page = new QAFormPage(driver);
    	
    	steps.StepInfo("Scenario 2-1: Fill out form. Leave required fields (Last Name) as blank.");
    	steps.StepInfo("When: Form is filled out.");
    	FormActions.fillForm(page, "scenario2-1.properties");
    	steps.StepInfo("Then: Validate if Registration is unsuccessful.");
    	ValidationUtils.validateNotEquals(page.alertBox().getText(), "Successfully registered the following information");
    	FormActions.clearForm(page);
    	steps.StepInfo(" ");
    	
    	steps.StepInfo("Scenario 2-2: Fill out form. Leave required fields (Phone Number) as blank.");
    	steps.StepInfo("When: Form is filled out.");
    	FormActions.fillForm(page, "scenario2-2.properties");
    	steps.StepInfo("Then: Validate if Registration is unsuccessful.");
    	ValidationUtils.validateEquals(page.alertBox().getText(), "The phone number should contain at least 10 characters!");
    	FormActions.clearForm(page);
    	steps.StepInfo(" ");
    	
    	steps.StepInfo("Scenario 2-3: Fill out form. Leave required fields (Email address) as blank.");
    	steps.StepInfo("When: Form is filled out.");
    	FormActions.fillForm(page, "scenario2-3.properties");
    	steps.StepInfo("Then: Validate if Registration is unsuccessful.");
    	ValidationUtils.validateNotEquals(page.alertBox().getText(), "Successfully registered the following information");
    	FormActions.clearForm(page);
    	steps.StepInfo(" ");
    	
    	steps.StepInfo("Scenario 2-4: Fill out form. Leave required fields (Password) as blank.");
    	steps.StepInfo("When: Form is filled out.");
    	FormActions.fillForm(page, "scenario2-4.properties");
    	steps.StepInfo("Then: Validate if Registration is unsuccessful.");
    	ValidationUtils.validateEquals(page.alertBox().getText(), "The password should contain between [6,20] characters!");
    	FormActions.clearForm(page);
    	steps.StepInfo(" ");

    }
    @Test
    public void errorTest3() {
    	Steps steps = new Steps();
    	QAFormPage page = new QAFormPage(driver);
    	
    	steps.StepInfo("Scenario 3-1: Fill out form. Validate field restrictions (Phone Number");
    	steps.StepInfo("When: Form is filled out.");
    	FormActions.fillForm(page, "scenario3-1.properties");
    	steps.StepInfo("Then: Validate if Registration is unsuccessful.");
    	ValidationUtils.validateNotEquals(page.alertBox().getText(), "Successfully registered the following information");
    	FormActions.clearForm(page);
    	steps.StepInfo(" ");
    	
    	steps.StepInfo("Scenario 3-2: Fill out form. Validate field restrictions (Phone Number");
    	steps.StepInfo("When: Form is filled out.");
    	FormActions.fillForm(page, "scenario3-2.properties");
    	steps.StepInfo("Then: Validate if Registration is unsuccessful.");
    	ValidationUtils.validateEquals(page.alertBox().getText(), "The password should contain between [6,20] characters!");
    	FormActions.clearForm(page);
    	steps.StepInfo(" ");
    	
    	steps.StepInfo("Scenario 3-3: Fill out form. Validate field restrictions (Phone Number");
    	steps.StepInfo("When: Form is filled out.");
    	FormActions.fillForm(page, "scenario3-3.properties");
    	steps.StepInfo("Then: Validate if Registration is unsuccessful.");
    	ValidationUtils.validateEquals(page.alertBox().getText(), "The password should contain between [6,20] characters!");
    	FormActions.clearForm(page);
    	steps.StepInfo(" ");

    }
    @Test
    public void errorTest4() {
    	Steps steps = new Steps();
    	QAFormPage page = new QAFormPage(driver);
    	
    	steps.StepInfo("Scenario 4-1: Fill out form. Validate if checkbox is working.");
    	steps.StepInfo("When: Form is filled out.");
    	FormActions.fillForm(page, "scenario1.properties");
    	steps.StepInfo("Then: Validate if Registration is unsuccessful.");
    	ValidationUtils.validateCheckboxChecked(page.iAgreeCheckbox(), "I Agree checkbox");
    	FormActions.clearForm(page);
    	steps.StepInfo(" ");
 

    }
}

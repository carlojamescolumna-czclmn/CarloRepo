package utilities;

import org.junit.jupiter.api.Assertions;

public class ValidationUtils {
    public static void validateEquals(String actualMessage, String expectedMessage) {
        Steps steps = new Steps();
        try {
            Assertions.assertEquals(expectedMessage, actualMessage);
            steps.StepInfo("✅ Passed: " + actualMessage + "\" is equal to \"" + expectedMessage + "\"");
        } catch (AssertionError e) {
            steps.StepInfo("❌ Failed: " + actualMessage + "\" is NOT equal to \"" + expectedMessage + "\"");
//            throw e;
        }
    }
    public static void validateNotEquals(String actualMessage, String expectedMessage) {
        Steps steps = new Steps();
        try {
            Assertions.assertNotEquals(expectedMessage, actualMessage);
            steps.StepInfo("✅ Passed: " + actualMessage + "\" is NOT equal to \"" + expectedMessage + "\"");
        } catch (AssertionError e) {
            steps.StepInfo("❌ Failed: " + actualMessage + "\" is equal to \"" + expectedMessage + "\"");
//            throw e;
        }
    }
    public static void validateCheckboxChecked(CheckBox checkBox, String label) {
        Steps steps = new Steps();
        try {
            Assertions.assertTrue(checkBox.isChecked(), label + " is not checked.");
            steps.StepInfo("✅ Passed: " + label + " is checked.");
        } catch (AssertionError e) {
            steps.StepInfo("❌ Failed: " + label + " is NOT checked.");
            throw e;
        }
    }

}

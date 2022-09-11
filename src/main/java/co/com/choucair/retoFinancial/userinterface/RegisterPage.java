package co.com.choucair.retoFinancial.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {
    public static final Target JOIN_BUTTON=Target.the("Click on join today button").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target FIRST_NAME_INPUT=Target.the("Where do we write the first name").located(By.xpath("//*[@id=\"firstName\"]"));
    public static final Target LAST_NAME_INPUT=Target.the("Where do we write the last name").located(By.xpath("//*[@id=\"lastName\"]"));
    public static final Target MAIL_INPUT=Target.the("Where do we write the email address").located(By.xpath("//*[@id=\"email\"]"));
    public static final Target BIRTH_MONTH_INPUT=Target.the("Where do select the month of the birth").located(By.xpath("//*[@id=\"birthMonth\"]"));
    public static final Target BIRTH_DAY_INPUT=Target.the("Where do select the day of the birth").located(By.xpath("//*[@id=\"birthDay\"]"));
    public static final Target BIRTH_YEAR_INPUT=Target.the("Where do select the year of the birth").located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target NEXT_LOCATION_BUTTON=Target.the("Button to continue with the register, location").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target NEXT_DEVICES_BUTTON=Target.the("Button to continue with the register, devices").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target NEXT_LAST_SEPT_BUTTON=Target.the("Button to continue with the register, last step").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target CREATE_PASSWORD_INPUT=Target.the("where do write the password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD_INPUT=Target.the("where do confirm the password").located(By.id("confirmPassword"));
    public static final Target TERMS_CHECK=Target.the("Checkbox to accept uTest terms of use").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY_CHECK=Target.the("Checkbox to accept the privacy and security policy").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_SETUP_BUTTON=Target.the("Button to complete the register").located(By.xpath("//*[@id=\"laddaBtn\"]"));
    public static final Target WELCOME_MESSAGE= Target.the("Welcome message to the community").located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));


}

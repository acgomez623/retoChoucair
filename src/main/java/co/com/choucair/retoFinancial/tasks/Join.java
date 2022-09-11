package co.com.choucair.retoFinancial.tasks;

import co.com.choucair.retoFinancial.userinterface.RegisterPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromBy;
import net.serenitybdd.screenplay.waits.Wait;


public class Join implements Task {

    private String firstName;
    private String lastName;
    private String mail;
    private String month;
    private String day;
    private String year;
    private String password;

    public Join(String firstName, String lastName, String mail, String month, String day, String year, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.month = month;
        this.day = day;
        this.year = year;
        this.password = password;
    }

    public static Join onThePage(String firstName, String lastName, String mail, String month, String day, String year, String password) {
        return Tasks.instrumented(Join.class, firstName, lastName, mail, month, day, year, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(RegisterPage.JOIN_BUTTON),
                Enter.theValue(firstName).into(RegisterPage.FIRST_NAME_INPUT),
                Enter.theValue(lastName).into(RegisterPage.LAST_NAME_INPUT),
                Enter.theValue(mail).into(RegisterPage.MAIL_INPUT),
                Click.on(RegisterPage.BIRTH_MONTH_INPUT),
                new SelectByVisibleTextFromBy(month, By.xpath("//*[@id=\"birthMonth\"]")),
                Click.on(RegisterPage.BIRTH_DAY_INPUT),
                new SelectByVisibleTextFromBy(day, By.xpath("//*[@id=\"birthDay\"]")),
                Click.on(RegisterPage.BIRTH_YEAR_INPUT),
                new SelectByVisibleTextFromBy(year, By.xpath("//*[@id=\"birthYear\"]")),
                Click.on(RegisterPage.NEXT_LOCATION_BUTTON),
                Click.on(RegisterPage.NEXT_DEVICES_BUTTON),
                Click.on(RegisterPage.NEXT_LAST_SEPT_BUTTON),
                Enter.theValue(password).into(RegisterPage.CREATE_PASSWORD_INPUT),
                Enter.theValue(password).into(RegisterPage.CONFIRM_PASSWORD_INPUT),
                Click.on(RegisterPage.TERMS_CHECK),
                Click.on(RegisterPage.PRIVACY_CHECK),
                Click.on(RegisterPage.COMPLETE_SETUP_BUTTON));
    }
}

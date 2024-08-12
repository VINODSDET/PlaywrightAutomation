import com.microsoft.playwright.*;

public class FirstPlaywright {
    public static void main(String[] args) {
       Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext context = browser.newContext();
       Page page = context.newPage();
        page.navigate("https://www.facebook.com/");
        page.click("a[data-testid=\"open-registration-form-button\"]");
        page.fill("name=firstname", "Vinod");
        page.fill("name=lastname", "Gore");
        page.fill("id=password_step_input", "Vinod@123");
        page.fill("name=reg_email__", "");
        page.fill("name=reg_email_confirmation__", "");
        page.selectOption("name=birthday_day", "26");
        page.selectOption("name=birthday_month", "May");
        page.selectOption("name=birthday_year", "1997");


    }
}

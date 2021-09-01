import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver driver;

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    ////*[@id="passp-field-login"]
    @FindBy(xpath = "//*[@id=\"passp-field-login\"]")
    private WebElement loginField;
    @FindBy(xpath = "//*[@id=\"passp:sign-in\"]")
    private WebElement loginBtn;
    @FindBy(xpath = "//*[@id=\"passp-field-passwd\"]")
    private WebElement passwdField;

    public void inputLogin(String login) {
        loginField.sendKeys(login);
    }

    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

}

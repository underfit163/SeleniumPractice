import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage {
    private WebDriver driver;

    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "#root > div > div.profile.page-bg > div > div:nth-child(1) > div > div > div > div:nth-child(1) > div.personal.personal-layout__new > div.personal-info > div.personal-info__main-block > div.personal-info-login > div")
    private WebElement userName;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/a[1]")
    private WebElement userMenu;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/div/ul/ul/li[6]/a")
    private WebElement logoutBtn;

    /**
     * метод для получения имени пользователя из меню пользователя
     */
    public String getUserName() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#root > div > div.profile.page-bg > div > div:nth-child(1) > div > div > div > div:nth-child(1) > div.personal.personal-layout__new > div.personal-info > div.personal-info__main-block > div.personal-info-login > div")));
        return userName.getText();
    }

    /**
     * метод для нажатия кнопки меню пользователя
     */
    public void entryMenu() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div/div/div/a[1]")));
        userMenu.click();
    }

    /**
     * метод для нажатия кнопки выхода из аккаунта
     */
    public void userLogout() {
        logoutBtn.click();
    }
}



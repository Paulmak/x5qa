import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class Testx5 {

    @Test
    public void mainTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://marmelab.com/react-admin-demo/#/login");
        By username = By.xpath("//*[@id='username']");
        By password = By.xpath("//*[@id='password']");
        By signInButton = By.xpath("//*[@class='MuiButton-root MuiButton-contained MuiButton-containedPrimary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-fullWidth MuiButtonBase-root  css-1e6co9j']");
        By ordersList = By.xpath("//*[@class='MuiMenuItem-root MuiMenuItem-gutters MuiButtonBase-root  css-18x74ig'][@href='#/commands']");
        By deliveryList = By.xpath("//*[@class='MuiButtonBase-root MuiTab-root MuiTab-textColorPrimary MuiTab-fullWidth css-1b5xyu3'][1]");
        By firstCheckbox = By.xpath("//*[@class='MuiTableBody-root datagrid-body RaDatagrid-tbody css-1xnox0e']/tr[1]//input[@class='PrivateSwitchBase-input css-1m9pwf3']");
        By secondCheckbox = By.xpath("//*[@class='MuiTableBody-root datagrid-body RaDatagrid-tbody css-1xnox0e']/tr[2]//input[@class='PrivateSwitchBase-input css-1m9pwf3']");
        By thirdCheckbox = By.xpath("//*[@class='MuiTableBody-root datagrid-body RaDatagrid-tbody css-1xnox0e']/tr[3]//input[@class='PrivateSwitchBase-input css-1m9pwf3']");
        By numberOfChosenCheckbox = By.xpath("//h6[@class='MuiTypography-root MuiTypography-subtitle1 css-1uk7wdo']");
        By invoicesList = By.xpath("//a[@href='#/invoices']");
        By dateFieldSince = By.xpath("//*[@id='date_gte']");
        By dateFieldBefore = By.xpath("//*[@id='date_lte']");
        driver.findElement(username).click();
        driver.findElement(username).sendKeys("demo");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("demo");
        driver.findElement(signInButton).click();
        driver.findElement(ordersList).click();
        driver.findElement(deliveryList).click();
        driver.findElement(firstCheckbox).click();
        driver.findElement(secondCheckbox).click();
        driver.findElement(thirdCheckbox).click();
        if (driver.findElement(numberOfChosenCheckbox).getText().equals("3 items selected")) {
            System.out.println("Correct number");
        } else {
            throw new RuntimeException("Incorrect number");
        }
        driver.findElement(invoicesList).click();
        driver.findElement(dateFieldSince).sendKeys("01-01-2021");


    }
}


package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.AddressData;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    public WebDriver wd;
    public  SessionHelper sessionHelper;
    public  NavigationHelper navigationHelper;
    public  GroupeHelper groupeHelper;
    public AddressHelper addressHelper;


    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/addressbook/group.php");
        groupeHelper = new GroupeHelper(wd);
        addressHelper = new AddressHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.login("admin", "secret");
    }


    public void logout() {
      wd.findElement(By.linkText("Logout")).click();
    }

   /* public void filllAddressForm(AddressData addressdata) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(addressdata.getFirstname());
      wd.findElement(By.name("middlename")).clear();
      wd.findElement(By.name("middlename")).sendKeys(addressdata.getMidlename());
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(addressdata.getLastname());
      wd.findElement(By.name("mobile")).click();
      wd.findElement(By.name("mobile")).clear();
      wd.findElement(By.name("mobile")).sendKeys(addressdata.getMobilephone());
      wd.findElement(By.name("email")).click();
      wd.findElement(By.name("email")).clear();
      wd.findElement(By.name("email")).sendKeys(addressdata.getEmail());

      wd.findElement(By.name("new_group")).click();
     // new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(addressdata.getSelectgroupe());
    }
*/


    public void   stop() {

        wd.findElement(By.linkText("Logout")).click();

    }
    public void getAcceptDialogWindow() {
        wd.switchTo().alert().accept();
    }

       private boolean isAlertPresent() {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public GroupeHelper getGroupeHelper() {
        return groupeHelper;
    }

    public AddressHelper getAddressHelper() {
        return addressHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public void gotoGroupPage() {
        navigationHelper.gotoGroupPage();
    }

    public void gotoAddPage() {
        navigationHelper.gotoAddPage();
    }
}

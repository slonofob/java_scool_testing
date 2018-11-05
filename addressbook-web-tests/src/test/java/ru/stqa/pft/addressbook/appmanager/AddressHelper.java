package ru.stqa.pft.addressbook.appmanager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.AddressData;


public class AddressHelper extends HelperBase {

    public AddressHelper(WebDriver wd) {
        super(wd);
    }

    public void fillAddressForm(AddressData addressData) {
        type(By.name("firstname"), addressData.getFirstname());
        type(By.name("middlename"), addressData.getMidlename());
        type(By.name("lastname"), addressData.getLastname());
        type(By.name("mobile"), addressData.getMobilephone());
        type(By.name("email"), addressData.getEmail());

    }

    public void submitCreationAddress() {
        click(By.xpath("//input[@value='Enter']")); //

    }
    public void submitUpdateAddress() {
        click(By.xpath("//input[@value='Update']")); //

    }

    public void selectAddressForm() {
        click(By.name("selected[]"));
    }


    public void submitDeleteAddress() {
        click(By.xpath("//input[@value='Delete']"));
    }
    public void initAddressModification() {
        click(By.xpath("//img[@alt='Edit']"));

    }
}
package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddressData;

public class AddressModificationTest extends TestBase {

    @Test
    public void testModificationAddress() throws Exception {
        app.getNavigationHelper().gotoHomePage();
        app.getAddressHelper().initAddressModification();
        app.getAddressHelper().fillAddressForm(new AddressData("Изменено", "Изменено", "Изменено", "89999999999", "modification@gmail.ru"));
        app.getAddressHelper().submitUpdateAddress();
    }
}

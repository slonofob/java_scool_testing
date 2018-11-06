package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;

public class AddressDeletionTest extends TestBase {

    @Test
    public void testDeletionAddress() throws Exception {
        app.getNavigationHelper().gotoHomePage();
        app.getAddressHelper().selectAddressForm();
        app.getAddressHelper().submitDeleteAddress();
        app.getAcceptDialogWindow();
        app.getNavigationHelper().gotoHomePage();
    }
}
package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddressData;


public class AddAddressTest extends TestBase {

  @Test
  public void testAddAddress() throws Exception {
    app.getNavigationHelper().gotoAddPage();
    app.getAddressHelper().fillAddressForm(new AddressData("Петр", "Осетр", "Пупкин", "89126555555", "kostin.a.p@gmail.ru"));
    app.getAddressHelper().submitCreationAddress();
      }

 }

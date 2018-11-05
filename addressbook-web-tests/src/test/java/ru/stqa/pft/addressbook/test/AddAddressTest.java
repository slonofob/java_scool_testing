package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddressData;


public class AddAddressTest extends TestBase {

  @Test
  public void testAddAddress() throws Exception {
    app.gotoAddPage();
    app.fillAddressForm(new AddressData("Тестовый", "Клиент", "Клиентович", "89126555555", "kostin.a.p@gmail.ru", "test3"));
    app.getGroupeHelper().submitCreationTest();
    app.logout();
  }

 }

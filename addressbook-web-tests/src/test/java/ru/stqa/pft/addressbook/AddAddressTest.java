package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;


public class AddAddressTest extends TestBase {

  @Test
  public void testAddAddress() throws Exception {
    gotoAddPage();
    fillAddressForm(new AddressData("Тестовый", "Клиент", "Клиентович", "89126555555", "kostin.a.p@gmail.ru", "test3"));
    submitCreationTest();
    logout();
  }

 }

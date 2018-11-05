package ru.stqa.pft.addressbook.test;

import org.testng.annotations.*;




public class GroupeDeletionTest extends TestBase{

  @Test
  public void testGroupeDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupeHelper().slectGroupe();
    app.getGroupeHelper().deleteSelectedGroups();
   app.getGroupeHelper().returnToGroupePage();
  }

}

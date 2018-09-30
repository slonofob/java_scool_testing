package ru.stqa.pft.addressbook;

import org.testng.annotations.*;




public class GroupeDeletionTest  extends TestBase{

  @Test
  public void testGroupeDeletion() {
    gotoGroupPage();
    slectGroupe();
    deleteSelectedGroups();
   returnToGroupePage();
  }

}

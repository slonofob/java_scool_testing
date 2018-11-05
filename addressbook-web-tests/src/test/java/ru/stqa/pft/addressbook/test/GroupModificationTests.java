package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupeData;

public class GroupModificationTests  extends TestBase{
    @Test

    public void testGroupeModification () {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupeHelper().slectGroupe();
        app.getGroupeHelper().initGroupeModification();
        app.getGroupeHelper().fillGroupForm(new GroupeData("testmod", "testmod", "testmod"));
        app.getGroupeHelper().saveUpdateGoupeModification();
        app.getGroupeHelper().returnToGroupePage();
        }
}

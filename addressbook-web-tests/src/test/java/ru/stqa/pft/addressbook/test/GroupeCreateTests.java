package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupeData;

public class GroupeCreateTests extends TestBase{


    @Test
    public void testGroupeCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupeHelper().initGroupeCreation();
        app.getGroupeHelper().fillGroupForm(new GroupeData("test3", "test4", "test5"));
        app.getGroupeHelper().submitCreationGroupe();
        app.getGroupeHelper().returnToGroupePage();

    }

}

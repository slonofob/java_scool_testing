package ru.stqa.pft.addressbook.test;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupeData;

public class GroupeCreateTests extends TestBase{


    @Test
    public void testGroupeCreation() throws Exception {
                app.gotoGroupPage();
        app.getGroupeHelper().initGroupeCreation();
        app.getGroupeHelper().fillGroupForm(new GroupeData("test3", "test4", "test5"));
        app.getGroupeHelper().submitCreationTest();
        app.getGroupeHelper().returnToGroupePage();

    }

}

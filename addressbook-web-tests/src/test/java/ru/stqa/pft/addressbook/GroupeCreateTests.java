package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupeCreateTests extends TestBase{


    @Test
    public void testGroupeCreation() throws Exception {
        gotoGroupPage();
        initGroupeCreation();
        fillGroupForm(new GroupeData("test3", "test4", "test5"));
        submitCreationTest();
        returnToGroupePage();

    }

}

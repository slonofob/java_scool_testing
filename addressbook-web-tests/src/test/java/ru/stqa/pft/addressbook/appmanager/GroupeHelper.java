package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupeData;

public class GroupeHelper extends HelperBase {

    public GroupeHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToGroupePage() {
        click(By.linkText("group page"));
    }


    public void fillGroupForm(GroupeData groupeData) {
        type(By.name("group_name"), groupeData.getName());
        type(By.name("group_header"), groupeData.getHeader());
        type(By.name("group_footer"), groupeData.getFooter());
    }

    public void initGroupeCreation() {
        click(By.name("new"));
    }

    public void deleteSelectedGroups() {
        click(By.name("delete"));
    }

    public void slectGroupe() {
        click(By.name("selected[]"));
    }

    public void submitCreationGroupe() {
        click(By.name("submit"));
    }

    public void initGroupeModification() {
        click(By.name("edit"));
    }

    public void saveUpdateGoupeModification() {
        click(By.name("update"));
    }
}

package ru.stqa.pft.addressbook.model;

public class AddressData {
    private final String firstname;
    private final String midlename;
    private final String lastname;
    private final String mobilephone;
    private final String email;


    public AddressData(String firstname, String midlename, String lastname, String mobilephone, String email) {
        this.firstname = firstname;
        this.midlename = midlename;
        this.lastname = lastname;
        this.mobilephone = mobilephone;
        this.email = email;

    }

    public String getFirstname() {
        return firstname;
    }

    public String getMidlename() {
        return midlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public String getEmail() {
        return email;
    }


}

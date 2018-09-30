package ru.stqa.pft.addressbook;

public class Addressdata {
    private final String firstname;
    private final String midlename;
    private final String lastname;
    private final String mobilephone;
    private final String email;
    private final String selectgroupe;
    private final String addressclient;

    public Addressdata(String firstname, String midlename, String lastname, String mobilephone, String email, String selectgroupe, String addressclient) {
        this.firstname = firstname;
        this.midlename = midlename;
        this.lastname = lastname;
        this.mobilephone = mobilephone;
        this.email = email;
        this.selectgroupe = selectgroupe;
        this.addressclient = addressclient;
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

    public String getSelectgroupe() {
        return selectgroupe;
    }

    public String getAddressclient() {
        return addressclient;
    }
}

package group3.dk.controllers;

public class Member {
    private String mail;
    private String password;
    private String name;
    private String cvrOrCpr;
    private String address;
    private String phoneNr;

    public Member(String mail, String password, String name, String cvrOrCpr, String address, String phoneNr) {
        this.mail = mail;
        this.password = password;
        this.name = name;
        this.cvrOrCpr = cvrOrCpr;
        this.address = address;
        this.phoneNr = phoneNr;
    }

    @Override
    public String toString() {
        return "Member{" +
                "mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", cvrOrCpr='" + cvrOrCpr + '\'' +
                ", address='" + address + '\'' +
                ", phoneNr='" + phoneNr + '\'' +
                '}';
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCvrOrCpr() {
        return cvrOrCpr;
    }

    public void setCvrOrCpr(String cvrOrCpr) {
        this.cvrOrCpr = cvrOrCpr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNr() {
        return phoneNr;
    }

    public void setPhoneNr(String phoneNr) {
        this.phoneNr = phoneNr;
    }
}

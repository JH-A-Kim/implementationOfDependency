package org.example;

public class person {
    mobile mobile1=new mobile();
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile1(int phoneNumber) {
        mobile1.setNumber(phoneNumber);
    }

    public int getMobile1() {
        return mobile1.getNumber();
    }
}
class mobile{
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

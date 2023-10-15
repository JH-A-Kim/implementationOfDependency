package org.example;

public class Main {
    public static void main(String[] args) {
        person person1=new person();
        person1.setName("Jung Kim");
        person1.setMobile1(77902324);

        System.out.println(person1.getMobile1()+" is the phone number of "+ person1.getName());
    }
}
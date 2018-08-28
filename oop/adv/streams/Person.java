package javase.oop.adv.streams;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private String givenName;
    private String surName;
    private int age;
    private Gender gender;
    private String eMail;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String code;


    public String getGivenName() {
        return givenName;
    }

    public String getSurName() {
        return surName;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEMail() {
        return eMail;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCode() {
        return code;
    }

    public void print() {
        System.out.println("\nName: " + givenName + " " + surName + "\n" + "Age: " + age + "\n" + "Gender: " + gender +
                           "\n" + "eMail: " + eMail + "\n" + "Phone: " + phone + "\n" + "Address: " + address + "\n" +
                           "City: " + city + "\n" + "State: " + state + "\n" + "Code: " + code + "\n");

    }


}

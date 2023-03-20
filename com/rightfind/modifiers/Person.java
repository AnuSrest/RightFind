package com.rightfind.modifiers;

import java.util.Date;

public abstract class Person {
    public int id;
    public String firstName; //jata bata ni access garna pauxa
    String lastName;
    String address;
    String phoneNumber;

    Date dateOfBirth;


    public int getAge(){
        return 20;

    }
    public abstract String getPersonId();

}

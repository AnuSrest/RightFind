package com.rightfind.modifiers;

public class Employee extends Person {
    @Override
    public String getPersonId() {
        return "EmployeeId"+id;
    }
    Employee(int id){
        this.id=id;

    }
    public void setPersonId(String name){
        this.firstName=name;
    }



}

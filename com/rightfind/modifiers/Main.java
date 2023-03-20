package com.rightfind.modifiers;

public class Main {
    public static void main(String args[]){
       // Person peopleObject = new Person();
        Employee employee = new Employee(1);
        employee.getAge();
        employee.getPersonId();
        Employee arpana = new Employee(2);
        Employee anu = new Employee(3);
        arpana.getPersonId();
        System.out.println("Result-"+ employee.getPersonId());
        System.out.println("Result-"+ arpana.getPersonId());
        System.out.println("Result-"+ anu.getPersonId());
    }
}

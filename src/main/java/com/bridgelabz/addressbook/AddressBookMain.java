package com.bridgelabz.addressbook;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

import java.util.Iterator;
import java.util.List;

class Person {
    private String firstName, lastName, state, city, email;
    private long zip, phoneNumber;

    public Person(String firstName, String lastName, String state, String city, String email, long zip,
                  long phoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.state = state;
        this.city = city;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", lastName=" + lastName + ", state=" + state + ", city=" + city
                + ", email=" + email + ", zip=" + zip + ", phoneNumber=" + phoneNumber + "]";
    }
}

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to day-10 address book management system");
        Scanner sc = new Scanner(System.in);
        List<Person> person = new ArrayList<Person>();

        System.out.println("Enter address book");

        int ch;
        do {
            System.out.println("choose your options below: ");
            System.out.println("1. INSERT");
            System.out.println("2. DISPLAY");
            System.out.println("3. SEARCH");

            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("IF you have choosen 1 then insert following details");
                    System.out.print("Enter first name: ");
                    String firstName = sc.next();
                    System.out.print("Enter last name: ");
                    String lastName = sc.next();
                    System.out.print("Enter state name: ");
                    String state = sc.next();
                    System.out.print("Enter city name: ");
                    String city = sc.next();
                    System.out.print("Enter email: ");
                    String email = sc.next();
                    System.out.print("Enter phone number: ");
                    long phoneNumber = sc.nextLong();
                    System.out.print("Enter zip: ");
                    long zip = sc.nextLong();
                    // calling the constructor of person by providing the values
                    // once the values are being passed inside this constructor and a object will be
                    // created and that object will be added to the collection.
                    person.add(new Person(firstName, lastName, state, city, email, zip, phoneNumber));
                    break;
                case 2:
                    System.out.println("-----------------------------------------");

                    // this iterator has the collection person
                    Iterator<Person> i = person.iterator();
                    while (i.hasNext()) {
                        // here each and every instance will be retrieved into this p variable.
                        Person p = i.next();
                        // here printing the instance of person it will call simply
                        // the tooString function here.
                        System.out.println(p);

                    }
                    System.out.println("-----------------------------------------");
                    break;
                case 3:
                    boolean found = false;
                    System.out.println("Enter person name to search his/her record: ");
                    String firstName1 = sc.next();
                    // this iterator has the collection person
                    i = person.iterator();
                    while (i.hasNext()) {
                        // here each and every instance will be retrieved into this p variable.
                        Person p = i.next();
                        if (firstName1.equals(p.getFirstName())) {
                            System.out.println(firstName1);
                            found = true;
                        }

                    }
                    if (!found) {
                        System.out.println("Record not found");
                    }
                    System.out.println("-----------------------------------------");
                    break;

            }

        } while (ch != 0);

    }
}

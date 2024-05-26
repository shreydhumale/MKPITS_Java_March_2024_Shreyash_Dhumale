3. Basic Address Book: Develop an address book program that allows users to store and manage contact information, including names, phone numbers, and email addresses.


import java.util.Scanner;

public class addresssBook {
    String name;
    long contact;
    String email;

    public String nameOfPerson(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Name:");
        String name=scanner.next();
        return name;
    }
    public long contactNO(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Contact Number:");
        long contact = scanner.nextLong();
        return contact;
    }
    public String emailAddress(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Email Address:");
        String email=scanner.next();
        return email;
    }
}

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        addresssBook Ad = new addresssBook();
        String name = Ad.nameOfPerson();
        System.out.println("Name added successfully!\n");
        long contact = Ad.contactNO();
        System.out.println("Contact number added successfully!\n");
        String email = Ad.emailAddress();
        System.out.println("Email Address added successfully!\n");
        System.out.println("------------------------------------");
        System.out.println("* YOUR DETAILS:-\n");
        System.out.println("* NAME:- " + name);
        System.out.println("* CONTACT NUMBER:- " + contact);
        System.out.println("* EMAIL ADDRESS:- " + email);
        System.out.println("------------------------------------");


        }
    }











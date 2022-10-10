package com.codinclub;

import java.util.Scanner;

public class UserRegistrationMain extends UserDetailsValidation {
    static Scanner scanner = new Scanner(System.in);
    static String firstName;
    static String lastName;
    static String email;
    static String mobileNumber;

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem");
        userFirstName();
        userLastName();
        userEmail();
        userMobileNumber();
    }
    public static void userFirstName() {
        System.out.println("Enter your First Name");
        firstName = scanner.nextLine();
        UserDetailsValidation.isValidFirstName(firstName);
    }

    public static void userLastName(){
        System.out.println("Enter your Last Name");
        lastName = scanner.nextLine();
        UserDetailsValidation.isValidFirstName(lastName);
    }

    public static void userEmail() {
        System.out.println("Enter your Email");
        email = scanner.nextLine();
        UserDetailsValidation.isValidEmail(email);
    }

    public static void userMobileNumber(){
        System.out.println("Enter your Mobile number ");
        mobileNumber = scanner.nextLine();
        UserDetailsValidation.isValidMobileNumber(mobileNumber);
    }
}

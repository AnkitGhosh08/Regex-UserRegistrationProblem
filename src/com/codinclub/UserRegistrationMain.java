package com.codinclub;

import java.util.Scanner;

public class UserRegistrationMain extends UserDetailsValidation {
    static Scanner scanner = new Scanner(System.in);
    static String firstName;
    static String lastName;
    static String email;

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem");
        userFirstName();
        userLastName();
        userEmail();
    }

    public static void userFirstName() {
        System.out.println("Enter your First Name");
        firstName = scanner.next();
        UserDetailsValidation.isValidFirstName(firstName);
    }

    public static void userLastName() {
        System.out.println("Enter your Last Name");
        lastName = scanner.next();
        UserDetailsValidation.isValidFirstName(lastName);
    }

    public static void userEmail() {
        System.out.println("Enter your Email");
        email = scanner.next();
        UserDetailsValidation.isValidEmail(email);
    }
}
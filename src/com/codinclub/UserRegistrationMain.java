package com.codinclub;

import java.util.Scanner;

public class UserRegistrationMain extends UserDetailsValidation {
    static Scanner scanner = new Scanner(System.in);
    static String firstName;

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration Problem");
        userFirstName();
    }
    public static void userFirstName() {
        System.out.println("Enter your First Name");
        firstName = scanner.next();
        UserDetailsValidation.isValidFirstName(firstName);
    }
}

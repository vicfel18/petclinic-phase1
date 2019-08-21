package com.example.petclinic.utility;

public class Validator {

    public static boolean phoneValidation(String phoneNumber){

        return phoneNumber.matches("^[2-9]\\d{2}-\\d{3}-\\d{4}$");
    }

    /*
    public static void main(String[] args) {
        System.out.println(phoneValidation("954-482-3110"));
    }

     */
}

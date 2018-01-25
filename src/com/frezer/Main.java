package com.frezer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        int height;

        System.out.println("Enter your age please!");
        age= input.nextInt();

        System.out.println("Enter Your  height in pound please!");
        height = input.nextInt();

        if (age > 50 || height > 60 ) {
            System.out.println("True" );
        }
        else {
            System.out.println("Your age need to be over 50 or your height has to be over 60 pounds now " +
                    "you are " + age +" years old, and "+ height + " height " );
        }
    }
}

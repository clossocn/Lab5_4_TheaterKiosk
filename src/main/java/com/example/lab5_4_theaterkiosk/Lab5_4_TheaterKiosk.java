package com.example.lab5_4_theaterkiosk;
import java.util.Scanner;

public class Lab5_4_TheaterKiosk {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Please enter your age: ");
            int age = scanner.nextInt();

            if (age >= 21) {
                System.out.println("Congratulations! You get a wristband.");
            }

            scanner.close();
        }

}

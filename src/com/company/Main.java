package com.company;
/*Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to
vote. A person who is eligible to vote must be older than or equal to 18 years old.*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please introduce your age: ");
        int age = scan.nextInt();

        AgeToVote user = new AgeToVote();
        user.compareAge(age);
    }
}

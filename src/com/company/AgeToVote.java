package com.company;

/**
 * Created by User on 08.02.2018.
 */
public class AgeToVote {

    public int compareAge (int age) {
        if (age >= 18){
            System.out.println("You are allowed to vote");
        } else {
            System.out.println("Your are not eligible to vote");
        } return age;
    }
}

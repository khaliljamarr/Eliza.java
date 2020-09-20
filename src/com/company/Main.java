package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name, day, feeling;

        System.out.println("Hello my name is Eliza, What's your name?");
        name=input.nextLine();

        System.out.println("Nice to meet you " + name + ", how has your day been?");
        day=input.nextLine();

        System.out.println("Okay, is there any particular way you are feeling?");
        feeling=input.nextLine();

        System.out.println("It has been my pleasure to speak with you " + name + " have an amazing day!\n");

        System.out.println("Here are your responses: " + name + " " + day + " " + feeling);
    }
}

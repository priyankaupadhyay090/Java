/*
Function: a series of finite steps that accomplish some task.
define above main function

Syntax:

public static void function_name(){}


Example: announceDeveloperTeaTime()

*/


import java.util.Scanner;

// define the function
public class Functions_Exercise {

    public static void announceDeveloperTeaTime() {
        System.out.println("Waiting for developer Tea time..");
        System.out.println("Type in a random word/number and press Enter to start developer tea time");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("It's developer tea time!");

    }

    public static void main(String[] args) {
        System.out.println("Welcome to your new job");

        // calling or using the function
        announceDeveloperTeaTime();

        System.out.println("Write code");
        System.out.println("Review code");

        announceDeveloperTeaTime();

        System.out.println("Get promoted");

    }
}
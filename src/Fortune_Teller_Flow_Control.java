// control flow- if condition and loops: For and while
// decision making logic
// a program control flow is the order in which the program instruction or code statement are executed

// relational operators: <, >, ==, >=, <=, !=

// exercise: Fortune Teller Program: user will pick a number, depending on the number picked user receives a fortune

import java.util.Scanner;

public class Fortune_Teller_Flow_Control {
    public static void main(String[] args) {
        // taking input from user
        System.out.println("Pick a number between 1 and 10: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        // if statement

        if (userInput < 5) {
            System.out.println("\"Enjoy the good luck!\"");
        } else {

            System.out.println("\"your shoe selection will make your happy today\"");
        }

    }
}



// note: Scope
// scope of a variable is the part of the program where a piece of code is accessible or in which it can be used
// so if a variable is defined  outside of if-else, it is accessibe by both if and else statement -- In scope
// if a variable is defined inside of if statement, only if block can access it, else block can not -- Out of scope
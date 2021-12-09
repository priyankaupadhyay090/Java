/*
Task: Creative Multiple Choice questions. one question- three answers choice (one is ocrrect)
Steps:
ask the user a question
output answers choice to user
Collect user's input( that is, the answer they provide)
Print out an appropriate message to the user(depending on if they were correct or not)
*/

import java.util.Scanner;
public class Loop_Exercise {
    public static void main(String[] args) {

        String question = "Which company is owner of WhatsApp?";
        String choiceOne = "google";
        String choiceTwo = "facebook";
        String choiceThree = "tesla";

        String correctAnswer = choiceTwo;

        // write a print statement asking the question
        System.out.println(question);
        // write a print statement giving the answer choices
        System.out.println("Choose one of the following answers: " +
                choiceOne + ", " + choiceTwo + ", " + choiceThree);

        // Have the user input an answer
        Scanner scanner = new Scanner(System.in);

        // Retrieve the user's input
        String input = scanner.next();


            // If the user's input matches to the correctAnswer...
            //.equals() si case sensitive so better convert user input into lower case
            if (correctAnswer.equals(input.toLowerCase())) {
                // then the user is correct and we want to print out a congrats message to the user
                System.out.println("Congratulations! your answer is correct.");
            }

            // if the user's input does not match to the correctAnswer...
            else {
                // then the user is incorrect and we want to print out a message saying the user is incorrect
                System.out.println("Your answer is incorrect, correct answer is " + correctAnswer);
            }

        }
    }


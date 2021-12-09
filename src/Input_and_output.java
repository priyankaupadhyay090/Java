// output to the use: System.out --> to print at console
// input: take input from user and then output it to the user

//exercise: we can change GPA dynamically


import java.util.Scanner;

public class Input_and_output {
    public static void main(String[] args){

        // int student_age = 15;
        double studentGPA = 1.2;
        String studentFirstName= "Priyanka";
        String studentLastName= "Upadhyay";

        System.out.println(studentFirstName+ " " + studentLastName +" " + "has a GPA of" + " " + studentGPA);
        System.out.println("Upgrade GPA: What do you want to update it to?");

        // to take use rinput for GPA, can create scanner with system.in and save it in input variable
        // Scanner input --> Scanner is a data type
        // this will create new scanner that will scan system.in for the user input

        Scanner input = new Scanner(System.in);

        // now use next double operation on input scanner to get double value of GPA
        studentGPA = input.nextDouble();// since we ahve already defined studentGPA before, e do not need to put datatytpe here while define student GPA again as java will recognised it


        System.out.println(studentFirstName+" "+ studentLastName+" " +
                "now has a GPA of" + " " + studentGPA);




    }

}




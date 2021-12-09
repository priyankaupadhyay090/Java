// Exercise: lets try to access string index using charAt

public class String_Exercise{
    public static void main(String[] args) {

        double studentGPA = 1.2;
        String studentFirstName= "Priyanka";
        String studentLastName= "Upadhyay";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentlastinitial = studentLastName.charAt(0);


        System.out.println(studentFirstInitial);
        System.out.println(studentlastinitial);
        System.out.println(studentFirstName);
        System.out.println(studentLastName);

        // String concatination
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of" + " " +studentGPA);


    }

}




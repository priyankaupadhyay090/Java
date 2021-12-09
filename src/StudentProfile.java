/*
* Student profile attributes: first name, last name, expected year to graduate, GPA, declared Major
* atleast one behaviour/method : increase expected year graduation by one
* create 2 instances of this class
*
*
* */

public class StudentProfile {

    // creating attribute
    String studentFirstName;
    String studentLastName;
    double studentGPA;
    int expectedYeartoGraduate;
    String studentMajor;

    // creating constructor
    public StudentProfile(String studentFirstName,String studentLastName,
                          double studentGPA,String studentMajor,
                          int expectedYeartoGraduate){

        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.studentGPA = studentGPA;
        this.expectedYeartoGraduate = expectedYeartoGraduate;
        this.studentMajor = studentMajor;
    }

    public int increaseExpectedGraduationYear(){
        return (this.expectedYeartoGraduate + 1);
    }

}

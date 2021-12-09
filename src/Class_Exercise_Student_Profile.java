



public class Class_Exercise_Student_Profile {

    public static void main(String[] args){

        StudentProfile studentA = new StudentProfile("Priyanka", "Upadhyay", 1.0,"MSc. in Data Science and AI", 2022);
        StudentProfile studentB = new StudentProfile("Pravin", "Upadhyay", 1.2, "B.Tech in Auronautical Engineering", 2023);


        int getStudentIncreadedGraduationYear = studentA.increaseExpectedGraduationYear();
        System.out.println("StudnetA increaed year of graduation "+ getStudentIncreadedGraduationYear);

        System.out.println(studentA.studentGPA);
        System.out.println(studentB.studentLastName);

    }
}

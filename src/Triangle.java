// check class basic file

// attribute are accessible throughout the class but constructor parameter are only accessible inside the constructor


public class Triangle {

    // creating all attributes variable/instance variable for Triangle
    double height;
    double base;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    // creating constructor : public Class_name goes as constructor name
    // since attribute and constructor parameter are same. we use 'this' operator to keep them seperate
    public Triangle(double height, double base, double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.base = base; // constructor variable
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    // creating other  functions/method --> also called as instance methods bcz it will use by instance

    public double findArea(){
        return (this.base * this.height)/2;

    }

    // creat a static variable
    static int numOfSides = 3;


// going to main class to make some instances:  class_basic.java




}

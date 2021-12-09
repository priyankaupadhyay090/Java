/*
* class: blueprint which contain attribute/property and behaviour/functions/method
* class: has constructor that allows to creat instances (without constructor, we wont be  abel to creat instances)
* instance: is a object which will use the class blueprint
*
* class: has attribute variable
* class: has first method: a constructor (with constructor parameter) and it will automatically return the value
* class: has other method/functions(with parameter variable)
* instance: Class_name object_name = new Class_name(pass attribute variable value)
*
*Task: write a Triangle class(base, height, side length) --> check Traingle class
* */

public class Class_Basic {

    public static void main(String[] args){

        // making instances/object while calling the Triangle class --> method_datatype instance_name = new method_name

        // Triangle triangleA --> Triangle datatype for class and constructor, triangleA--> instance/object name
        // new Triangle --> Triangle constructor(method)
        // 'new' keyword--> use to initialize a object/instance followed by a call to constructor
        Triangle triangleA = new Triangle(15, 8, 15, 8, 17);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3 );


        // calling other method from class

        // triangleA.findArea() --> passing argument from triangleA instance into findArea() instance method
        // double --> is the findArea() datatype
        double triangleAarea = triangleA.findArea(); // instance.method()
        System.out.println("Area of TriangleA is: "+triangleAarea);


        // class method/static method --> class_name.method_name() --> Math.pow()
        // instance method/ non-static method --> instance_name.method_name()--> triangleA.findArea()
        // Math.pow() --> as pow() is a static method/class method/non instance method which can be used directly with classname.methodname
        // here findArea() --> is a instance method/non-static method which can not be used without creating instance



        double triangleBarea = triangleB.findArea();
        System.out.println("Area of TriangleB is: "+triangleBarea);


        // we can also use other attribute variable value using dot operator
        System.out.println(triangleA.sideLenOne);// we use dot operator on instance(triangleA) to access it's attribute/instance variable
        System.out.println(triangleA.base);
        System.out.println(triangleB.height);



        // calling static variable using dot operator with class name
        System.out.println(Triangle.numOfSides);
    }
}


/*
* Non static Vs statis method
*
* Non static instance method: are those method whose value are not same for every triangle, their value change
* depending on the triangle instance
*
* Static method: static class variables do not change per instance;they hold a value for
* the whole class to use
* */
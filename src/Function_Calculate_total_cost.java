/*
Task: calculate total cost of Meal
step1: calculate tip; tip = tipRate * listedMealPrice
step2:calculate Tax; Tax = taxRate * listedMealPrice
step3: calculate result: result = tip +tax + listedMealPrice
step4: output result: print result

Problem: How can we account for different ripRates, tipTaxes and listedMealPrice
* */

/*
public class Function_Calculate_total_cost {

    // Define function
    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = tip +tax + listedMealPrice;
        System.out.println("Your total meal price is " + result);
    }


    public static void main(String[] args){

        // calling function
        calculateTotalMealPrice(15, .2, .08);

    }
}
*/


// want our function to return some value  -- to find out group total meal cost
// without any return type in function, function parameter can only be used inside func
// but t=when func return a value, it can be access by other func as well.

public class Function_Calculate_total_cost {

    // function return result (double datatype --. so use double instead of void
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = tip +tax + listedMealPrice;
        return result;
    }


    public static void main(String[] args){

        // this time while calling the function --> it will be stored in a varible which has double datatype (bcz function is returning double value)
        double groupTotalMealPrice= calculateTotalMealPrice(100, .2, .08);
        System.out.println(groupTotalMealPrice);

        double individualTotalMealPrice = groupTotalMealPrice/5;
        System.out.println(individualTotalMealPrice);
    }
}




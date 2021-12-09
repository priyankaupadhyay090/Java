/* Taks: built a function to: Calculate an Employee's Salary
input1: number of hours work/week
input2: amount/hour
output: gross yearly salary

one vacation day = 8 hours
* */



public class Function_Salary_Calculator {

    public static double EmployeeSalary(double hourPerWeek, double amountPerHour, int vacationDays){

        // to make sure HourPerWeek and amountPerHour are not negeative
        if(hourPerWeek < 0){
            return -1;
        }
        if (amountPerHour<0){
            return -1;
        }
        // this block will work when both value are positive
        double weekSalary = (hourPerWeek * amountPerHour);
        double unpaidTime = vacationDays * amountPerHour * 8;
        double grossYearSalary =  (52 * weekSalary) - unpaidTime; // 52 weeks in a year
        return grossYearSalary;

    }


    public static void main(String[] args){

        double employeeSalary = EmployeeSalary(40, 15, 8);
        System.out.println("Employee's Yearly Salary is EUR "+employeeSalary+ " and Employee took 8 Vacation days.");


    }
}

package myapp.core;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double result = 0;

        Scanner sc = new Scanner(System.in);
        

        // ask users to enter numbers
        System.out.println("Enter first number");
        double num1 = sc.nextDouble();

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        char operator = sc.next().charAt(0);

        //while (operator != '+' || operator != '-' || operator != '*' || operator != '/') {
        //    System.out.println("Choose a valid operator: +, -, *, or /");
        //    operator = sc.next().charAt(0);
        //}

        // ask users to enter numbers
        System.out.println("Enter second number");
        double num2 = sc.nextDouble();

        if (operator == '+') {
            result = num1 + num2;
        }
        else if (operator == '-') {
            result = num1 - num2;
        } 
        else if (operator == '*') {
            result = num1 * num2;
        } 
        else if (operator == '/') {
            result = num1 / num2;
        }

        System.out.printf("The result for %f %s %f is = %f" ,num1,operator,num2,result);
        sc.close();
    }
}

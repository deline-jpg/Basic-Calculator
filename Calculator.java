import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("           BASIC CALCULATOR!");
        System.out.println("========================================");

        try(Scanner scan = new Scanner(System.in))
        {
            //Prints supported operators
            //Prompts user to choose an operator listed
            System.out.println("Supported operations: Addition, Subtraction, Multiplication, Division.");
            System.out.println("Enter an operator: (+, -, *, /) ");

            //scans operator
            char operator = scan.next().charAt(0);

            //Error message displayed if user enters an unsupported operator
            if (!(operator == '+' || operator == '-' || operator == '*' || operator == 'x' || operator == '/')) {
                System.err.println("Invalid Operator. Please only use one of the following: (+, -, *, /)");
            }

            //Prompts user to enter their first number
            System.out.println("Enter First Number: ");
            double firstNum = scan.nextDouble();

            //Prompts user to enter their second number
            System.out.println("Enter Second Number: ");
            double secondNum = scan.nextDouble();

            //Prints error message when user tries to divide a number by zero
            if (operator == '/' && secondNum == 0.0) {
                System.err.println("Cannot divide by zero.");
            }

            //if user entered "+", result as addition equation is printed.
            if (operator == '+') {
                System.out.println("Result: " + "\n" + firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
            }
            //if user entered "-", result as subtraction equation is printed.
            else if (operator == '-') {
                System.out.println("Result: " + "\n" + firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
            }
            //if user entered "*", result as multiplication equation is printed.
            else if (operator == '*') {
                System.out.println("Result: " + "\n" + firstNum + " x " + secondNum + " = " + (firstNum * secondNum));
            }
            //if user entered "/", result as division equation is printed.
            else if (operator == '/') {
                System.out.println("Result: " + "\n" + firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
            }
            //Error message displayed if user enters an unsupported operator
            else {
                System.out.println("The operator you entered is invalid.");
            }
        }
        catch (InputMismatchException exc) //catches wrong input entered
        {
            System.err.println(exc.getMessage());
        }
    }
}
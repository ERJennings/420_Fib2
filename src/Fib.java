/**
 * @author Eric Jennings
 * @version 12/9/2020
 * CPSC 420 Final Project, Fib2 algorithm
 */

import java.util.Scanner;

public class Fib {

    public static void main(String[] args) {

        //Variables to hold previous two numbers
        int u = 0;
        int v = 1;

        //Get the index n of the Fibonacci number desired by the user
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");
        String enteredNumber = input.nextLine();
        try {
            n = Integer.parseInt(enteredNumber);
        }
        catch (NumberFormatException e) {
            n = -1;
        }

        //Find v, the value of the nth Fibonacci number
        for (int i = 2; i < n; i++) {
            v += u;
            u = v - u;
        }

        //Print the result
        if (n < 0) {
            System.out.print("Input must be a non-negative integer");
        }
        else if (n == 0) {
            System.out.print("Fibonacci number 0 is 0");
        }
        else {
            System.out.print("Fibonacci number " + n + " is " + v);
        }

    }

}

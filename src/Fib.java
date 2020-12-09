import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int u = 0;
        int v = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");

        String enteredNumber = input.nextLine();
        int n = Integer.parseInt(enteredNumber);

        for (int i = 2; i < n; i++) {
            v += u;
            u = v - u;
        }

        if (n == 0) {
            System.out.print("Fibonacci number " + n + " is 0");
        }
        else {
            System.out.print("Fibonacci number " + n + " is " + v);
        }

    }

}

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of terms to go to:  ");

        int number = parseInt(myObj.nextLine());

        fibonacciTime(number);

    }


    /**
     * This is a class that when provided int, n, will output n number of Fibonacci terms.
     *
     * @param n the number of time the Fibonacci sequence will iterate.
     */
    static void fibonacciTime(int n) {

        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    };
}
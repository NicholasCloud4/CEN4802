/**
 * Name: Nicholas Dhannie
 * Date: 1-7-2025
 * Class: CEN4802C
 * Assignment 1 - Learning about Version Control
 */

public class Fibonacci {

    /**
     * Computes the nth term of the Fibonacci sequence using recursion.
     *
     * @param n the position in the Fibonacci sequence to calculate. Must be a positive integer.
     * @return the nth term of the Fibonacci sequence.
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * The main method serves as the entry point of the program. It calculates
     * and prints the nth term of the Fibonacci sequence using the {@code fibonacci} method.
     *
     * @param args command-line arguments passed to the program; not utilized in this implementation.
     *
     * Calling the fibonacci method with n = 10
     */
    public static void main(String[] args) {
        int n = 10;
        int result = fibonacci(n);

        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
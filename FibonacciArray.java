package IMPJavaQ.Array;
import java.util.Scanner;
//WAJP to store n terms of Fibonacci series into an array.
public class FibonacciArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int num = sc.nextInt(); // Read number of Fibonacci terms
        // Call method to generate fibonacci series
        int[] fibonacci = getFibonacci(num);

        // Print the fibonacci series
        System.out.println("First "+ num + " terms of the fibonacci series : ");
        for (int x : fibonacci){
            System.out.print(x + " ");
        }
    }
    // Method to generate Fibonacci series in an array
    public static int[] getFibonacci(int num) {
        int[] fib = new int[num];  // create array to store series
        // Initialize first term if array size is at least 1
        if (num > 0)
            fib[0] = 0;
        // Initialize second term if array size is at least 2
        if (num > 1)
            fib[1] = 1;
        // Generate remaining fibonacci terms
        for (int i = 2; i < num; i++){
            fib[i] = fib[i - 1]+ fib[i - 2];
        }
        return fib;

    }
}

package IMPJavaQ.Array;
import java.util.Scanner;
// WAJP: Insert an element at a given position in an array
public class InsertTheElementCertainPosition {
    public static void main(String[] args) {
        int[] a = new int[10]; // Array with extra capacity
        int size = 6;          // current number of filled element
        // Initial values
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        a[5] = 6;
        Scanner sc = new Scanner(System.in);
        // Take position input from user
        System.out.println("Enter the position");
        int pos = sc.nextInt();
        // Take value from user
        System.out.println("Enter the value :");
        int val = sc.nextInt();

        // Method calling to insert the element specific index
        insertCertainPosition(a, size, pos, val);

    }
    // Create Method to insert element of a specific index
    public static void insertCertainPosition(int[] a, int size, int pos, int val){
        // Check for valid index
        if(pos < 0 || pos > size){
            System.out.println("Invalid index! Insertion not possible");
            return;
        }
        //Shift element from right -> left to create space
        for (int i = size; i > pos; i--){
            a[i] = a[i-1];
        }
        // Insert element at the desired position
        a[pos]  = val;

        //Output the updated array
        System.out.println("Array after insertion :");
        for (int x : a) {
            System.out.print(x + " ");
        }

    }

}








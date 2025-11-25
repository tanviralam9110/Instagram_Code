package IMPJavaQ.Array;
// WAJP: Remove an element from a specific position in an array
import java.util.Scanner;
public class RemoveElementCertainPosition {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
      // Print existing array
        for(int x : a){
            System.out.print(x + " ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println();
        //Input the position to remove
        System.out.println();
        System.out.println("Enter the position : ");
        int pos = sc.nextInt();
        // method calling to remove element
        removeCertainPosition(a, pos);
    }
    //Method to remove element from a given position
    public static void removeCertainPosition(int[] a, int pos){
        // Check Valid index
        if (pos < 0 || pos >= a.length){
            System.out.println("Invalid Index! || Removal not possible");
            return;
        }
        //Shift element left to flip the gap
        for (int i = pos; i < a.length-1; i++){
            a[i] = a[i+1];
        }
        System.out.println("Removed element at position : "+ pos);
        // printing updated array (length reduce by 1 logically)
        System.out.println("Array after removal:");
        for (int i = 0; i < a.length-1; i++){
            System.out.print(a[i] + " ");
        }
    }
}


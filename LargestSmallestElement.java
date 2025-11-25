package IMPJavaQ.Array;
// WAJP (Write a Java Program) to find the largest and smallest element in an array
public class LargestSmallestElement {
    public static void main(String[] args) {
        // Given array of elements
        int[] a = {44, 25, 85, 22, 14, 56, 2, 45, 25, 54, 545, 555, 25, 14};
        // Initialize largest and smallest with first element
        int big = a[0];
        int small = a[0];
        System.out.print("Array Elements: ");
        for (int i = 0; i < a.length; i++) {    // Traverse the array
            if (a[i] > big) { // Check for largest element
                big = a[i];
            }
            else if (a[i] < small) {  // Check for smallest element
                small = a[i];
            }
            System.out.print(a[i] + " ");  // Printing array elements
        }
        // Print results
        System.out.println("\nLargest element: " + big);   // Largest element: 555
        System.out.println("Smallest element: " + small);   // Smallest element: 2
    }
}

package IMPJavaQ.Array;
// WAJP to Print reverse a given Array
public class ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        // Method 1: Reverse using last index (simple backward loop)
        // ------------------------------
        System.out.print("Reverse (Method 1): ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(a[i] + " ");
        }
        System.out.println(); // for next line
        // Method 2: Reverse by calculating index (a[length - i - 1])
        // ------------------------------
        System.out.print("Reverse (Method 2): ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[a.length - i - 1] + " ");
        }
        // Output: // 9 8 7 6 5 4 3 2 1
    }
}

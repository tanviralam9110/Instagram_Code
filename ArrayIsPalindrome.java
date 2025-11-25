package IMPJavaQ.Array;
// WAJP: Check if a given array is a Palindrome or not
public class ArrayIsPalindrome {
    public static void main(String[] args) {
        //Given Array
        int[] a = {1,2,3,2,1,5};
        // Calling Method to check palindrome
        if (isPalindromeArray(a)){
            System.out.println("Array is palindrome");
        }
        else {
            System.out.println("Array is not Palindrome");
        }
    }
    //Method to check if array is palindrome
    public static boolean isPalindromeArray(int[] a){
        int start = 0;        // Pointer at beginning
        int end  = a.length-1; // Pointer at end

        // Compare element from both ends
        while (start < end){
            //if  mismatch found Not palindrome
            if (a[start] != a[end]){
                return false;
            }
            start ++;  // Move forward
            end  --;   // Move backward
        }
        // All matched It is palindrome
        return true;
    }
}


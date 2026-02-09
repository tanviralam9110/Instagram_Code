package IMPJavaQ.Array;
// WAJP to search an element in an array using Binary Search
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int key = 40;
        int result = searchElement(arr, key);
        if (result >= 0){
            System.out.println("Element found at index:  "+result);
        }
        else {
            System.out.println("Element not found in the array");
        }
    }
    // Binary Search function to find the index of a given key
    public static int searchElement(int[] a, int key){
        int start = 0;          // starting index of the array
        int end = a.length-1;   // Ending index of the array
        // Loop until search space is valid
        while (start <= end){
            int mid = start+(end - start)/2;    // calculate mid
            // if element is found at mid
            if (a[mid] == key){
                return mid;
            }
            // If key is greater than search right half
            else if (a[mid] < key) {
                start = mid+1;
            }
            else
                end = mid-1; // If key is smaller  than search left half
        }
        // Return -1 if element is not found
        return  -1;
    }
}

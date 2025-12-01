package IMPJavaQ.Array;
 // WAJP to search an element in an array using Linear Search
public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {14,25,85,445,74,584,575,};
        int key = 74;
        int result = linearSearch(a, key);
        if (result >= 0){
            System.out.println("Element is found index No : "+ result);
        }
        else
            System.out.println("Element is not found ");
    }
    // Method to perform linear search
    public static int linearSearch(int[] a, int key) {
         // Traverse array one element at a time
        for (int i = 0; i < a.length; i++){
            // If element matched the key , return its index
            if (a[i] == key){
                return i;
            }
        }
        // If key is not found , return -1
        return  -1;
    }
}

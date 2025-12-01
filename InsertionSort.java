package IMPJavaQ.Array;
// Ques: Write a program to sort an array using Insertion Sort.
public class InsertionSort {
    public static void main(String[] args) {
        //Given Array
        int[]a={45,25,66,88,95,42,14,5,658,45};
        // Calling method
        insertionSort(a);
        for(int x : a){
            System.out.print(x+" ");

        }

    }

    public static void insertionSort(int[] a) {
        // Loop start from index 1 because index 0 is already sorted
        for (int i = 1; i < a.length; i++) {
            int key = a[i];   // element to be inserted in the sorted part
            int j = i - 1;    // sort checking from previous element


            // Move all element greater than key one step to the right
            // This create the correct empty position from the key
            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];  // shift element to the right
                j--;            // move left to compare more element
            }
            // Insert the key at the correct sorted position
            a[ j+ 1] = key;
        }

    }
}

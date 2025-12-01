package IMPJavaQ.Array;
//Write a program to sort an array using Selection Sort in Java
public class SelectionSort {
    public static void main(String[] args) {
        // Given unsorted array
        int[] a = {45, 25, 45, 4,45, 25, 51, 5, 6};
        // Calling function
        selectionSort(a);
        for (int x : a){
            System.out.print(x+" ");
        }
    }
    private static void selectionSort(int[] a) {
        // Outer loop selected each position in the array
       for (int i=0; i<a.length-1; i++){
           // Assume the current position holds the minimum
           int min = a[i];
           int minIndex = i;
          // Inner loop finds the actual minimum in the remaining  array
           for (int j = i+1; j<a.length; j++){
               // If a smaller elements is found , update min and its index
               if (a[j] < min){
                   min = a[j];
                   minIndex = j;
               }
           }
           // swap the minimum found with element at position i
           a[minIndex] = a[i];
           a[i]  = min;
       }
    }
}

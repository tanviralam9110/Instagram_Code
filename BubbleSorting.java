package IMPJavaQ.Array;
//WAJP to sort an array using Bubble Sort
public class BubbleSorting {
    public static void main(String[] args) {
        int[] a = {12, 5, 4, 85, 24, 65, 45, 65};
        // Method calling
         bubbleSort(a);
         for(int x : a){
             System.out.print(x+" ");
         }
      }
      // Crate a Method  to sorting array
    public static void bubbleSort(int[] a) {
       for (int i = 0; i< a.length-1; i++){
           int count = 0; // Track if any swap happens
           for(int j = 0; j <a.length-1-i ; j++){
               // swap if larger element found
               if(a[j] > a[j+1]){
                   int temp = a[j];
                   a[j] = a[j + 1];
                   a[j+1]= temp;
                   count++;
               }
           }
           // if no swap > already sorted
           if(count == 0)
               return;
       }
    }
}

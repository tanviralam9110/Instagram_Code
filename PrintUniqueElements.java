package IMPJavaQ.Array;
// Ques: WAJP to print only the unique elements present in an array (using frequency counting)
public class PrintUniqueElements {
    public static void main(String[] args) {
        // Given array with repeated elements
        int[] a = {8, 9, 8, 9, 9, 6, 4, 9, 4, 9, 4, 2, 9, 5, 5, 9, 6, 100};
        // Method calling to print unique element
           getFrequency(a);
    }
    // Method to print only unique elements using frequency array
    public static void getFrequency(int[] a) {
        //Frequency array to count occurrences (0-100 range)
        int[] freq = new int[101];
        // Count how many times each element occurs
        for (int i = 0; i < a.length; i++){
            freq[a[i]]++;
        }
        // Print only those elements that exist int the array
        System.out.println("Unique elements in the array");
        for (int i = 0; i < freq.length; i++){
            if (freq[i] > 0){
                System.out.print(i + " ");
            }
        }

    }
}

package IMPJavaQ.Array;
// Ques: WAJP to find the frequency of each element in an array
public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        // Given Array
        int[] a = {1,2,5,1,4,51,4,6,24,1,5,2,3,6,8,7,45,24,6,25,21,52,45,2,45};
       // Method Calling9o
        getFrequency(a);
    }
    // Method to find nd print frequency of each elements int the array
    public static void getFrequency(int[] a){
        //Frequency array of size 101 (0 - 100)
        int[] freq = new int[101];
        // count occurrences of each number
        for (int i = 0; i < a.length; i++){
            freq[a[i]]++;
        }
        // Print number that appeared at least one
        for (int i = 0; i < freq.length; i++){
            if (freq[i] > 0){
                System.out.println(i + " : Appears :"+ freq[i] + " : Times");
            }
        }

    }
}


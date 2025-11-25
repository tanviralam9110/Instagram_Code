package IMPJavaQ.Array;
// Q-10: Find the Largest and Smallest String (Based on Length) from an Array
public class ArrayOfStringLargestSmallest {
    public static void main(String[] args) {
        // Input array of string
        String[] s = {"Java","Coder","Noida","Mohan","Python"};
        // Initialize largest and smallest with the first element
        String largest = s[0];
        String smallest = s[0];
        //Enhanced loop to iterate through array
        for (String word : s){
            // Check if current string is larger than  Largest
            if (word.length() > largest.length()){
                largest = word;
            }
            // Check current string is shorter than smallest
            else if (word.length() < smallest.length()) {
                smallest = word;
            }
        }
        // Output with length
        System.out.println("Largest string :"+ largest + " | Length :" +largest.length());
        System.out.println("Smallest string :"+ smallest + " | Length :" +smallest.length());

    }



}

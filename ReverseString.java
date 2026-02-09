package ImpJavaString;
// Design a method which will accept a String input and return the reverse of
// the String.
public class ReverseString {
    public static void main(String[] args) {
        String s = "I love programming";
        System.out.println(reverseStringFront(s));
        System.out.println("==================================");
        System.out.println(reverseStringBack(s));
    }
    // Method 1: Reverse string by adding each character at the front
    public static String reverseStringFront(String s) {
        String rev = ""; // will store reversed string
        // Loop from start to end
        for (int i = 0; i < s.length(); i++){
            rev = s.charAt(i) +rev;    // take current character and place it at of reverse

        }
        return  rev;    // return reversed string

    }
    // Method 2: Reverse string by iterating from last character to first
    public static String reverseStringBack(String s) {
        String rev = "";   // will store reversed string
        // loop from end to start
        for (int i = s.length()-1; i >=0; i--){
            char c = s.charAt(i); // get current character
            rev += c;  // append character to end

        }
        return rev; // return reverse string

    }
}

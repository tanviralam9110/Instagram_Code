package ImpJavaString;
/*WAJP to take a String input and check whether the
 String is a Palindrome String or not (using reversing). */
public class StringPalindrome {
    public static void main(String[] args) {
        // Input as a string
        String s ="aallaa";
        // check condition
        if (isPalindrome(s)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
   // To check whether the given string is palindrome or not.
    public static boolean isPalindrome(String s) {
        // Take input as a empty String
        String reverse ="";
        // Using loop for reverse the string
        for (int i =0; i < s.length(); i++){
            reverse = s.charAt(i)+reverse;
        }
        // Comparing original and reversed string (case sensitive)
        return s.equalsIgnoreCase(reverse);


    }
}

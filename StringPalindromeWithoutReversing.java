package ImpJavaString;
/* WAJP to take a String input and check whether the
   String is a Palindrome String or not (without reversing).
 */
public class StringPalindromeWithoutReversing {
    public static void main(String[] args) {
        // input
        String s ="aallaa";
        if (isPalindrome(s)){
            System.out.println("String is palindrome");
        }
        else
            System.out.println("String is not palindrome");
    }
    //Check String is  palindrome without creating a reversed string.
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        // Run loop until start meets end
        while (start < end){
            // if checking don't matched Not palindrome
            if (s.charAt(start) != s.charAt(end))
                return false;
            start ++;
            end --;
        }
        return true; // All character matched Palindrome String
    }
}

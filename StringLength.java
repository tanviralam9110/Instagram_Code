package ImpJavaString;
// WAJP to take a String input get length of String without using length() method in
// at least four different ways.
public class StringLength {
    public static void main(String[] args) {
        String s = "SocialDude";

        // 1.  length using toCharArray()
        int length1 = s.toCharArray().length;
        System.out.println("Length using toCharArray : "+ length1);
        // 2. legth using getBytes()
        int length2 = s.getBytes().length;
        System.out.println("Length using getBytes : "+ length2);
        // 3. finding string length using CharAt()
        int count = 0;
        for (int i =0; ; i++){
            try {
                char c = s.charAt(i);  // Access character one by one
                count++;
            } catch (Exception e){  // when index exceed exit loop
                break;
            }
        }
        System.out.println("Using CharAt : "+ count);
        // 4. find length using null character
        s = s + '\0';
        int length4 = s.indexOf('\0');
        System.out.println("Using null Character : "+ length4);




    }

}

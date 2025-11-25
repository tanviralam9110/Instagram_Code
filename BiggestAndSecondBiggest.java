package IMPJavaQ.Array;
// WAJP to find the biggest and second biggest element is an array
public class BiggestAndSecondBiggest {
    public static void main(String[] args) {
        // Given Array
        int[] a = {44,55,22,55,66,88,45,75,88};
        for(int x : a){
            System.out.print(x+ " ");
        }
        biggestSecondBiggestArray(a);
    }
    // Create one method
    public static void biggestSecondBiggestArray(int[] a){
        // Initialize big and second bgg with MIN_VALUE
        int big = Integer.MIN_VALUE;
        int secondBig = Integer.MIN_VALUE;
        //Loop through array
        for(int i = 0; i <a.length; i++ ){
            // If current element is greater than  big > Update
            if (a[i] > big){
                secondBig = big; // previous biggest becomes secondBiggest
                big = a[i];      // Update
            }
            // if element is not equal to big and greater than secondBig
            else if (a[i] > secondBig && a[i] != big) {
                secondBig = a[i];
            }
        }
        // print biggest
        System.out.println("\nFirst biggest is :" +big);

        // print SecondBiggest And (exists)
        if (secondBig != Integer.MIN_VALUE)
            System.out.println("Second biggest is : "+secondBig);
        else
            System.out.println("Second biggest doesn't exists");
    }


}

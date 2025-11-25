package IMPJavaQ.Array;
// WAJP: Find the Smallest and Second Smallest Element in an Array
public class SmallestAndSecondSmallest {
    public static void main(String[] args) {
        // Given Array
        int[] a = {4,5,25,65,84,58,15,452,452,5};
        for (int x : a){
            System.out.print(x+" ");
        }
        // Method calling
        smallestAndSecondSmallestArray(a);
    }
    // Create method to find smallest and second smallest

    public  static void smallestAndSecondSmallestArray(int [] a){
        int smallest = a[0];
        int secondSmallest = Integer.MAX_VALUE;
        // Loop through array
        for (int i = 1; i < a.length; i++){
            // current element is smaller than smallest
            if(a[i] < smallest){
                secondSmallest = smallest;  // update second smallest
                smallest = a[i];            // update smallest
            }
            else if (a[i] < secondSmallest && a[i] >smallest) {
                secondSmallest = a[i];
            }
        }
        // output
        System.out.println("\nSmallest element is :"+smallest);

        if (secondSmallest == Integer.MAX_VALUE)
            System.out.println("Second smallest is not found");
        else
            System.out.println("Second smallest element is : "+secondSmallest);
    }


}

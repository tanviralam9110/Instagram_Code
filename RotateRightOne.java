package IMPJavaQ.Array;
// WAJP to rotate an array to the right by one position
public class RotateRightOne {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        // print existing Array
        System.out.println("Existing array is : ");
        for (int x : a){
            System.out.print(x+ " ");
        }
        System.out.println();
        // Method calling
        rotateRight(a);
        // printing the rotated array
        System.out.println("Current Array after right roted");
        for(int x : a){
            System.out.print(x+ " ");
        }
    }

    // Mthod to rotate array to the  right by one position
    public static  void rotateRight(int[] a){
        // Store the last element
        int temp = a[a.length-1];
        //Shift all element one step to the right
        for (int i = a.length-2; i >= 0; i--){
            a[i + 1] = a[i];
        }
        //Place the last element (store in temp) at the first position
        a[0] = temp;
    }
}


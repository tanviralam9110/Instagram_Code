package IMPJavaQ.Array;
// Ques: WAJP to rotate an array to the left by one position
public class RotateLeftOnePosition {
    public static void main(String[] args) {
        // Given Array
        int[] a = {10,20,30,40,50,60,70,80,90};
        // Print the existing array
        System.out.println("Existing Array is : ");
        for (int x : a){
            System.out.print(x + " ");
        }
        System.out.println();
        // Method calling to rotate to left 1 position
        rotateLeftPosition(a);
        // Printing the current array after left side rotate
        for (int x : a){
            System.out.print(x + " ");
        }

    }
    // Method to rotate array to the left by one position
    public static  void rotateLeftPosition(int[] a){
        // Store the first element temporarily
        int temp = a[0];
        // Shift element one step to the left
        for(int i = 1; i < a.length; i++){
            a[i - 1] = a[i];
        }
        // Place the first element at the last index
        a[a.length - 1] = temp;

    }
}


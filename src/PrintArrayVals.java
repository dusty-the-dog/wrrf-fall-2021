import java.util.Arrays;

public class PrintArrayVals {
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < (arr.length - 1); i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + "]");
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{8, 23, 18, 90};
        printArray(arr1); // using our method
        // java standard library method
        System.out.println(Arrays.toString(arr1)); 
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print(":" + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(arr);
        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

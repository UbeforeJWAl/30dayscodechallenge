import java.util.Arrays;
import java.util.Scanner;

public class ArrayStringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter yor choice:");
        System.out.println("1. Reverse an Array");
        System.out.println("2. Reverse a String");
        System.out.println("3. Check if two Arrays are equal");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                reverseArray();
                break;
            case 2:
                reverseString();
                break;
            case 3:
                checkArraysEquality();
                break;
                    
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
                break;
        }

        scanner.close();
    }

    public static void reverseArray() {
       int[] array = {1, 2, 3, 4, 5};
       
        System.out.println("Original Array: " + Arrays.toString(array));
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    public static void reverseString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String inputString = scanner.next();
        StringBuilder reversedString = new StringBuilder(inputString);
        reversedString.reverse();
        System.out.println("Reversed String: " + reversedString.toString());
    }

    public static void checkArraysEquality() {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 4, 3, 2, 1};

        boolean isEqual = Arrays.equals(array1, array2);

        if (isEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}

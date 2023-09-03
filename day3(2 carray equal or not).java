// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.Scanner;
public class ArrayEquality {
        public static void main(String[] args) {
       
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements you want to store");
        n=sc.nextInt();
        int[] array1=new int[10];
        int[] array2=new int[10];

        System.out.println("enter the array1 elements:");
        for(int i=0;i<n;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("enter the array2 elements:");
        for(int i=0;i<n;i++){
            array2[i]=sc.nextInt();
        }
        boolean areEqual = areArraysEqual(array1, array2);
        
        if (areEqual) {
            System.out.println("The arrays are equal.");
        } else {
            System.out.println("The arrays are not equal.");
       }
    }
    public static boolean areArraysEqual(int[] array1, int[] array2) {
       
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
     return true;
    }
}

import java.util.Scanner;
public class CountOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 4, 5, 6, 6, 7};
        int keyToFind ;
        System.out.println("enter the key element to be found");
        keyToFind=sc.nextInt();
        int count = countOccurrences(numbers, keyToFind);
        
        
        System.out.println("The key " + keyToFind + " appears " + count + " times in the array.");
    }
    
    public static int countOccurrences(int[] array, int key) {
        int count = 0;
        
        for (int number : array) {
            if (number == key) {
                count++;
            }
        }
        
        return count;
    }
}

public class EvenOddArray {
    public static void main(String[] args) {
       
        int[] numbers = { 10, 25, 8, 17, 42 };
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i] + " is even.");
            } else {
                System.out.println(numbers[i] + " is odd.");
            }
        }
    }
}

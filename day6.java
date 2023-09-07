public class FindSingleElementInArray {
    public static void main(String[] args) {
        int[] sortedArray = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6};

     int low = 0;
    int high = sortedArray.length - 1;

    while (high < low) {
            int mid = low + (high - low) / 2;

            if (mid % 2 == 1) {
                mid--; 
            }

            if (sortedArray[mid] != sortedArray[mid + 1]) {
                high = mid;
            } else {
                low = mid + 2;
            }
        }

        int singleElement = sortedArray[low];
        System.out.println("The element that appears once is: " + singleElement);
    }
}

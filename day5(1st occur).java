public class FirstOccurrenceIndex {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int[] arr = { 4, 2, 7, 1, 3, 7, 9 };

      
        int key ;;
         System.out.println("enter the key to search");
         key=sc.nextInt();
        int index = FirstOccurrence(arr, key);

        if (index != -1) {
            System.out.println("The first occurrence of " + key + " is at index " + index);
        } 
        else 
        {
            System.out.println(key + " not found in the array.");
        }
    }

   
    public static int FirstOccurrence(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] == key)
             {
                return i; 
            }
        }
        return -1; 
    }
}

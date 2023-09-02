import java.util.Scanner;
import java.io.*;
class Main {
  public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
    int[] num={1,2,3,4,5,6,7,8,9};
    int key ;
    boolean found = false;
    System.out.println("enter the key element to be found");
     key=sc.nextInt();

    for (int n : num) {
      if (n == key) {
        found = true;
        break;
      }
    }
    
    if(found)
      System.out.println(key + " is found.");
    else
      System.out.println(key + " is not found.");
  }
}

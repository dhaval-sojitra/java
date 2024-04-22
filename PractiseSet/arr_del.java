
// 13)Write a program to create an array of elements and delete a given element from the
// array. Your program should display an appropriate error message if the element to
// be deleted is not found in the array.
// Example:
// Size of the array:5
// Input 5 Integers :1,2,4,5,6
// Enter the element to be deleted:4
// Output:
// 1,2,5,6
import java.util.*;

class chk {
    Scanner sc = new Scanner(System.in);

    chk() {
        System.err.print("Enter Size Of An Array :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] newarr = new int[arr.length-1];
        for (int i = 0; i < size; i++) {
            System.err.print("Enter An Element arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        System.err.println("------------------------------------");
        System.err.print("Array Before Deleting The Element : ");
        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i] + " ");
        }
        System.err.println("\n------------------------------------");

        System.err.print("Enter An Element Which You Want To Delete :");
        int val = sc.nextInt();
        boolean val2 = false;
        int d = 0;
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                val2 = true;
            } else {
                if(d==newarr.length)
                    break;
                newarr[d] = arr[i];
                d++;
                // val2 = true;
            }
        }
        if (val2) {
            System.err.println("------------------------------------");
            System.err.print("Array After Deleting The Element : ");
            for (int i = 0; i < newarr.length; i++) {
                System.err.print(newarr[i] + " ");
            }
            System.err.println("\n------------------------------------");
        } else
            System.err.println("Element Not found In the Array..");
    }
}

public class arr_del {
    public static void main(String[] args) {
        chk c = new chk();
    }
}

// 12)Write a program to create an array of n elements and insert a given at the given
// position in the array .Your program should display appropriate error message if the
// position is invalid.
// Example:
// Size of the array:5

// Programming With JAVA

// CIA Practical-Assignment Page 4
// Input 5 integers:1,2,4,5,6
// Enter the element to be inserted :3
// Enter the position at which the element should be inserted:3
// OUTPUT:
// 1,2,3,4,5,6
import java.util.*;
class get{
    get(){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Size of an array :");
        int size = sc.nextInt();
        int arr[]  = new int[size+1];
        for(int i=0;i<size;i++) {
            System.err.print("Enter Element of arr["+i+"]:");
            arr[i] = sc.nextInt();
        }
        System.err.println("-----------------------------------------");
        System.err.println("Array Before Insert Element :");
        for(int i = 0;i<size;i++){
            System.err.print(arr[i]+" ");
        }
        System.err.println("\n-----------------------------------------");
        System.err.print("Enter the Element to be inserted :");
        int ele = sc.nextInt();
        System.err.print("Enter the position at which the element should be inserted :");
        int pos = sc.nextInt();
        if(pos < 0 || pos >= size)
        {
            System.err.println( "Invalid Position" );
        }
        else{
            int val = arr[pos];
            arr[pos] = ele;
            for(int i=pos;i<arr.length-1;i++)
            {   
                int val2 = arr[i+1];
                arr[i+1] = val;
                val = val2;
            }
            System.err.println("Enter Element Successfully!..");
            System.err.println("Array After Insert Element :");
        for(int i = 0;i<arr.length;i++){
            System.err.print(arr[i]+" ");
        }
        System.err.println("\n-----------------------------------------");
        }
        
    }
}
public class pro12 {
    public static void main(String[] args) {
        get g = new get();
    }
}

import java.util.Scanner;

public class selectionsort {
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many elements you want to enter in array? ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
        System.err.print("Enter element "+(i+1)+" : ");
        arr[i] = sc.nextInt();
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]  = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printarr(arr);
    }
}

public class inserionsort {
    public static void printarr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 2, 5, 1, 3 };

        for (int i = 1; i < arr.length; i++) {
            for(int j=i-1;j>=0;j--){
                
                if (arr[j] > arr[i]) {
                   int temp = arr[j]; 
                   arr[j] = arr[i];
                   arr[i] = temp;
                }
            }
        }
        printarr(arr);
    }
}

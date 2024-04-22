import java.util.*;

class twosum {
    public static void main(String[] args) {
        int[] a = { 10, 20, 30, 40, 50 };
        int sum = 0, n;
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Number : ");
        n = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            int no = a[i + 1];

            sum = a[i] + a[i + 1];
            if (sum == n) {
                System.err.println("a[" + i + "] " + "+ a[" + (i + 1) + "]");
                break;
            } else
                System.err.println("Elements not found");
        }
    }
}
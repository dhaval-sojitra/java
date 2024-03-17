import java.util.*;

class primenumber {
    public static void main(String[] args) {
        int no, count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number :");
        no = sc.nextInt();
        for (int i = 1; i <= no; i++) {
            if (no % i == 0)
                count++;
        }
        if (count > 2)
            System.err.println("Given Number is not Prime Number.");
        else
            System.err.println("Given Number is Prime Number.");
    }
}
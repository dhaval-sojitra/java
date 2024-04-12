// 4) Write a program user through input one number and perform Factor .Using
// Constructor.
// Example: Factors of 12: - 1, 2, 3, 4, 6, 12.
import java.util.*;
class get{
    Scanner sc = new Scanner(System.in);
    get(){
        System.err.print("Enter Any Number :");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(num%i==0)
                System.err.println(i);
        }
    }
}
public class pro4 {
    public static void main(String[] args) {
        get g = new get();
    }
}

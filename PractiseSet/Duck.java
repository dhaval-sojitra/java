// 8) Write a program that a Duck number is a number which has zeroes present in it,
// but there should be no zero present in the beginning of the number.
import java.util.*;
class chk{
    Scanner sc = new Scanner(System.in);
    chk(){
        System.err.print("Enter Any Number :");
        int num = sc.nextInt();
        int i,temp=num;
        while(temp>0)
        {
            i = temp%10;
            if(i==0){
                System.err.println("Given Number is Duck Number..");
                break;
            }
            temp /=10;
            if(temp == 0 ){
                System.err.println("Given Number is not Duck Number..");
                break;
            }
        }
    }
}  
public class Duck{
    public static void main(String[] args) {
      chk c = new chk();  
    }
}
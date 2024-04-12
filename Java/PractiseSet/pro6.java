// 6) Write a Program Armstrong Number is a positive number if it is equal to the sum
// of cubes of its digits is called Armstrong number and if its sum is not equal to the
// number then it’s not a Armstrong number.
// Examples: 153 is Armstrong
// (1*1*1)+(5*5*5)+(3*3*3) = 153
import java.util.*;
class chk{
    Scanner sc = new Scanner(System.in);
    chk(){
        System.err.print("Enter Any Number :");
        int num = sc.nextInt();
        int temp=num,cube=0,sum=0;
        while(temp>0)
        {   System.err.println("Temp"+temp);
            cube = temp%10;
            sum +=cube*cube*cube;
            System.err.println(sum);
            temp /=10;
        }
        if(sum==num) 
            System.err.println("Given Number is Armstrong Number..");
        else
            System.err.println("Given Number is not Armstrong Number..");
    }
}
public class pro6 {
    public static void main(String[] args) {
        chk c =new chk();
    }
}

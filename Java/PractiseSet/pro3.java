// 3) Write a program user through input one number and perform Factorial.
// Using Constructor.
import java.util.*;
class chk{
    Scanner sc = new Scanner(System.in);
    chk(){
        System.err.print("Enter Any Number :");
        int num = sc.nextInt();
        int temp=num,tot=1;
        while(temp>=1)
        {   
            tot = temp*tot;
            temp-=1;
            fact += tot;
        }
        System.err.println("Factorial of "+num+" : "+tot);
    }
}
public class pro3 {
    public static void main(String[] args) {
        chk k = new chk();
    }    
}

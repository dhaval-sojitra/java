// 9) Write a program to input a natural number less than 1000 and display it in words.
// Test your program on the sample data and some random data.
// Example:
// Input :29
// Output: TWENTY NINE.

// Input :17001
// Output: Out Of Range.

// Input :119
// Output: ONE HUNDRED AND NINETEEN.
import java.util.*;
class get{
    Scanner sc = new Scanner(System.in);
    String[] num = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
    get(){
        System.err.print("Enter Any Number :");
        int no = sc.nextInt();
        int temp=no,i;
        System.err.println("Number :"+num[no]);
        while(temp>0)
        {
            if(temp/10 == 0)
            {
                System.err.println(no + " : "+num[no]);
            }
            i = temp%10;
            
            
            temp /=10;
        
        }
    }
}
public class pro9 {
    public static void main(String[] args) {
        get g = new get();
    }
}

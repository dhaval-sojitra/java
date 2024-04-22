// 10)A bank intends to design a program to display the denomination of an input amount,
// upto 5 digits. The available denomination with the bank are of rupees
// 1000,500,100,50,20,10,5 2 and 1.
// Design the program to accept the amount from the user and display the break-up in
// descending order of denominations. (i.e preference should be given to the highest
// denomination available)along with the total number of notes.[Note:Only the
// denomination used should be displayed ].Also print the amount in words according
// to the digits.

// Programming With JAVA

// CIA Practical-Assignment Page 3
// Example:1
// Input:14836
// Output:ONE FOUR EIGHT THREE SIX
// DENOMINATION:
// 1000 X 14=14000
// 500 X 1=500
// 100 X 3=300
// 5 X 1=50
// 1 X 1=1
// 5 X 1=5
import java.util.*;
class convert{
    Scanner sc = new Scanner(System.in);
    String[] words = {"Zeor","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    convert(){
        System.err.print("Enter Any Number : ");
        int num = sc.nextInt();
        int temp=num,i;
        String numb = "";
        while (temp>0) {
            i = temp%10;
            String val = Integer.toString(i);
            numb += val;
            temp/=10;
        }
        // System.err.println(Integer.parseInt(numb));
        int temp1 = Integer.parseInt(numb);
        while(temp1>0)
        {
            i = temp1%10;
            System.err.print(words[i].toUpperCase() + " ");
            temp1 /= 10;
        }
        System.err.println("\n---------DENOMINATION:---------");
        int x,temp2=num;
            i = temp2/1000;
            System.err.println("1000 x "+i+ " = " + i*1000);
            temp2 = temp2-i*1000;
            i = temp2/500;
            System.err.println("500 X "+i+ " = " + i*500);
            temp2 = temp2-i*500;
            i = temp2/100;
            System.err.println("100 X "+i+ " = "+i*100);
            temp2 = temp2-i*100;
            i = temp2/50;
            System.err.println("50 X "+i+ " = "+i*50);
            temp2 = temp2-i*50;
            i = temp2/20;
            System.err.println("20 X "+i+ " = "+i*20);
            temp2 = temp2-i*20;
            i = temp2/10;
            System.err.println("10 X "+i+ " = "+i*10);
            temp2 = temp2-i*10;
            i = temp2/5;
            System.err.println("5 X "+i+ " = "+i*5);
            temp2 = temp2-i*5;
            i = temp2/2;
            System.err.println("2 X "+i+ " = "+i*2);
            temp2 = temp2-i*2;
            i = temp2/1;
            System.err.println("1 X "+i+ " = "+i*1);
        
    }
}
public class Dimention{
    public static void main(String[] args) {
        convert c = new convert();
    }
}
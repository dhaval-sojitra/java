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

class get {
    Scanner sc = new Scanner(System.in);
    String[] onedigit = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };
    String[] twodigit = { "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen" };
    String[] lastdigit = { "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
    String[] threedigit = { "Hundred" };

    void cal(int num) {
        int temp3, i2;
        String word2 = "";
        int rev = num, x;
        while (rev > 0) {
            x = rev % 10;
            String y = Integer.toString(x);
            word2 += y;
            rev /= 10;
        }
        temp3 = Integer.parseInt(word2);
        if (temp3 > 19) {
            String word3 = "";
            int rev1 = temp3, x1;
            while (rev1 > 0) {
                x1 = rev1 % 10;
                String y = Integer.toString(x1);
                word3 += y;
                rev1 /= 10;
            }
            int temp4 = Integer.parseInt(word3);
            i2 = temp4 % 10;
            while (temp4 > 0) {
                System.err.print(lastdigit[i2 - 2].toUpperCase()+" ");
                temp4 /= 10;
                lastdigit = onedigit;
                i2 = temp3 % 10;
                i2 += 2;
            }
        } else {
            System.err.println(twodigit[temp3 - 10].toUpperCase());
        }
    }

    get() {
        System.err.print("Enter Any Number :");
        int no = sc.nextInt();
        int len = Integer.toString(no).length();
        if (len >= 4)
            System.err.println("Please enter number lessthan 1000");
        else if (len == 2) {
            int temp = no, i;
            String word = "";
            if (temp > 19) {
                int rev = no, x;
                while (rev > 0) {
                    x = rev % 10;
                    String y = Integer.toString(x);
                    word += y;
                    rev /= 10;
                }
                temp = Integer.parseInt(word);
                i = temp % 10;
                System.err.print(no + " : ");
                while (temp > 0) {
                    System.err.print(lastdigit[i - 2].toUpperCase()+" ");
                    temp /= 10;
                    lastdigit = onedigit;
                    i = temp % 10;
                    i += 2;
                }
            } else {
                System.err.println(no + " : " + twodigit[no - 10].toUpperCase());
            }
        } else if (len == 3) {
            int temp1 = no, i1;
            String word1 = "";
            while (temp1 > 0) {
                i1 = temp1 % 10;
                String x = Integer.toString(i1);
                word1 += x;
                temp1 /= 10;
            }
            temp1 = Integer.parseInt(word1);
            while (temp1 > 0) {
                i1 = temp1 % 10;
                String d = onedigit[i1] +" " + threedigit[0] + " And ";
                System.err.print(d.toUpperCase());
                temp1 /= 10;
                int len1 = Integer.toString(temp1).length();
                if (len1 == 2) {
                    cal(temp1);
                    break;
                }
            }

        } else {
            System.err.println(no + " : " + onedigit[no].toUpperCase());
        }

    }
}

public class pro9 {
    public static void main(String[] args) {
        get g = new get();
    }
}

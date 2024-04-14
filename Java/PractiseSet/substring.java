// 15)Write a program to enter a main string and sub string and find the number of times
// the substring is present in the main string ignoring case consideratins.
// Assusem that substring is present only as a single word.It is neither found inside
// the string nor as a group of words.
// Example:
// Enter main String: The man goes to the theatre.
// Enter a substring: The
// CIA Practical-Assignment Page 5
// Output:
// No of times substring is present in the main string:2
import java.util.*;
class get{
    Scanner sc = new Scanner(System.in);
    get(){
        System.err.print("Enter Main String :");
        String main = sc.nextLine();
        System.err.println("-------------------------------");
        System.err.println("Main String :");
        System.err.println(main);
        System.err.println("-------------------------------");
        System.err.print("Enter A Substring : ");
        String sub = sc.nextLine();
        String[] subcount = main.toLowerCase().split(" ");
        int count = 0;
        boolean val = false;
        for(String word : subcount)
        {
            if(word.equals(sub.toLowerCase()))
            {
                count++;
                val=true;
            }
            else    
                val=false;
        }
        if(val)
            System.err.println("No of times substring is present in the main string : "+count);
        else
            System.err.println("Substring Not Found in Main String");

    }
}
public class substring {
    public static void main(String[] args) {
        get g = new get();
    }    
}

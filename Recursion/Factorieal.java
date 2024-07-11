import java.util.Scanner;

public class Factorieal {
    static void fact(int i,int fact){
        if(i<=0){
            System.out.println("Factoreal :" +fact);
            return;
        }
        fact = fact * i;
        fact(i-1,fact);
    }
    public static void main(String[] args) {
        System.out.print("Enter any number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int fact = 1;
        fact(a,fact);
    }    
}

import java.util.Scanner;

class Sumnumbers{
    static void count(int i,int sum){
        
        if(i<0){
            System.out.println("Sum is : "+sum);
            return;
        }
        sum = sum + i;
        count(i-1,sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = sc.nextInt();
        int sum = 0;
        count(num,sum);
    }
}
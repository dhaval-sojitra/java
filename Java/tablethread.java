import java.util.*;
class Table extends Thread
{
    Scanner sc = new Scanner(System.in);
    int no;
    public void run(){
        System.out.print("Enter Any Number :");
        no = sc.nextInt();
        try{
            for(int i=1; i<=10 ;i++){
                System.out.println(no + " X " + i + " = " + no*i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println(ie);
        }
    }
}
class tablethread
{
    public static void main(String[] args)throws InterruptedException
    {
        Table t = new Table();
        t.start();
    }
}
import java.util.*;

class square extends Thread {
    Scanner sc = new Scanner(System.in);
    int no;

    public void run() {
        System.out.print("Enter Any Number :");
        no = sc.nextInt();
        try {
            for (int i = 1; i <= no; i++) {
                System.out.println("Square : " + i + "*" + i + " = " + i * i);
                long x = i * i;
                System.out.println("Cube : " + x + "*" + x + "*" + x + " = " + (x*x*x));
                System.out.println("--------------------------------------------------\n");
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }
}

class squearethread {
    public static void main(String[] args) throws InterruptedException {
        square t = new square();
        t.start();
    }
}
import java.util.*;
class Cal{
	Cal(){
		Scanner sc=new Scanner();
		System.out.print("Enter value of Number 1 :");
		int no1 = sc.nextInt();
		System.out.print("Enter value of Number 2 :");
		int no2 = sc.nextInt();
	}
	void add(){
		System.out.println("Addition of Number 1 "+no1+" and Number 2 "+no2+" :"+(no1+no2));
	}
}
class Ccalculator{
	public static void main(String[] args) {
		Cal c=new Cal();
		c.add();
	}
}
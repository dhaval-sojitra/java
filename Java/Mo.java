import java.util.*;
class First{
	void add(int no1,int no2){
		System.out.println("Addition of "+no1+" And "+no2+" :"+(no1+no2));
	}
	void add(int no1,int no2,int no3){
		System.out.println("Addition of "+no1+" And "+no2+" And "+no3+" :"+(no1+no2+no3));
	}
}
class Mo{
	public static void main(String[] args) {
		First f=new First();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No 1 :");
		int x = sc.nextInt();
		System.out.print("Enter No 2 :");
		int y = sc.nextInt();
		System.out.print("Enter No 3 :");
		int z = sc.nextInt();
		f.add(x,y);
		f.add(x,y,z);
	}
}
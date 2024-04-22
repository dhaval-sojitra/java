package dhaval;
import dhaval.*;
public class Dis{
	TA d = new TA();
	public Dis(){
		System.out.println("\n\n\n----------EMPLOYEE DETAILS----------");
		System.out.println("Employee Name :"+d.t.i.name);
		System.out.println("Employee Post :"+d.t.i.post);
		System.out.println("Employee City :"+d.t.i.city);
		System.out.println("Employee Mobile Number :"+d.t.i.mno);
		System.out.println("Employee Basic Salary :"+d.t.i.salary);

		System.out.println("\n----------TAX COUNT----------");
		System.out.println("Tax Applied "+d.t.tax_per+"% : " +d.t.tax );
		System.out.println("Salary Afer Appling Tax :"+d.t.tax2);

		System.out.println("\n----------TA/DA COUNT----------");
		System.out.println("TA applied 5% :"+d.ta);
		System.out.println("DA applied 2% :"+d.da);

		System.out.println("\n--------------ON HAND--------------");
		System.out.println("Net Salary : "+d.netsal);


	}
}
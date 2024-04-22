package dhaval;
import dhaval.*;
public class Tax{
	Info i = new Info();
	int tax;
	int tax2;
	int tax_per = 0;
	public Tax()
	{
		if(i.salary<10000){
			// System.out.println("Tax Applied on Your Salary 0%");
			// System.out.println("Salary Afer Appling Tax :"+i.salary);
			tax_per = 0;
			tax2=i.salary;
		}
		else if(i.salary>=10000 && i.salary<=30000){
			tax=i.salary*2/100;
			tax2=i.salary-tax;
			// System.out.println("Tax Applied on Your Salary 2% : "+tax);
			// System.out.println("Salary Afer Appling Tax :"+tax2);
			tax_per = 2;


		}
		else if(i.salary>30000 && i.salary<=50000){
			tax=i.salary*4/100;
			tax2=i.salary-tax;
			// System.out.println("Tax Applied on Your Salary 4% : "+tax);
			// System.out.println("Salary Afer Appling Tax :"+tax2);
			tax_per = 4;
		}
		else if(i.salary>50000){
			tax=i.salary*6/100;
			tax2=i.salary-tax;
			// System.out.println("Tax Applied on Your Salary 6% : "+tax);
			// System.out.println("Salary Afer Appling Tax :"+tax2);
			tax_per = 6;
		}
		else
			System.out.println("Enter Valid Salary...");
			
	}
}
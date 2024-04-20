class First{
	First()
	{	try{
			int a[] = {1,2,3,4};
			int div = a[2]/0;
			System.out.println("Dvi :"+div);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Index out of bound..");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("0 is not allowd");
		}
		finally{
			System.out.println("done..");
		}
	}
}
class Tc{
	public static void main(String[] args) {
		First f = new First();
	}
}
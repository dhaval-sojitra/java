class First
{
	int no = 10;
	int square(){
		int s=no*no;
		return s;
	}
}
class Cl
{
	public static void main(String[] args) {
		First f=new First();
		System.out.println(f.square());
	}
}
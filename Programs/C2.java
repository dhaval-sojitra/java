class C2{
	public static void main(String[] args) {
		char num = '/';
		int a=10;
		int b=5;

		switch(num){
		case '+':
			System.out.println("Addition :"+(a+b));
			break;
		case '-':
			System.out.println("Substration :"+(a-b));
			break;
		case '*':
			System.out.println("Multiplication :"+(a*b));
			break;
		case '/':
			System.out.println("Divison :"+(a/b));
			break;		
		default:
			System.out.println("You select only 1 to 4");
		}
	}
}
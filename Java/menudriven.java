import java.io.*;
import java.util.*;

class menu {
	menu() {
		System.out.println("------------------Choices------------------");
		System.out.println("1.File Name");
		System.out.println("2.File Path");
		System.out.println("3.File Can Read");
		System.out.println("4.File Can Write");
		System.out.println("5.File Write");
		System.out.println("6.File Read");
		System.out.println("7.File Rename");
		System.out.println("8.File Delete");
		System.out.println("9.exit");
	}
}

class getname {
	getname() {
		File f = new File("file1.txt");
		String name = f.getName();
		System.out.println("======================================");
		System.out.println("File Name : " + name);
		System.out.println("======================================");

	}
}

class getfilepath {
	getfilepath() {
		File f = new File("file1.txt");
		String name = f.getAbsolutePath();
		System.out.println("======================================");
		System.out.println("File Path : " + name);
		System.out.println("======================================");

	}
}

class canread {
	canread() {
		File f = new File("file1.txt");
		System.out.println("======================================");
		System.out.println("File Can Be Read : " + f.canRead());
		System.out.println("======================================");

	}
}

class canwrite {
	canwrite() {
		File f = new File("file1.txt");
		System.out.println("======================================");
		System.out.println("File Can Be Write : " + f.canWrite());
		System.out.println("======================================");

	}
}

class write {
	write() {
		try {
			FileWriter fw = new FileWriter("file1.txt");
			fw.write("Is It enough?");
			fw.close();
			System.out.println("======================================");
			System.err.println("File Wrote Successfully...");
			System.out.println("======================================");
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}

class read {
	read(){
		try{
			FileReader fr = new FileReader("file1.txt");
			int character;
			System.out.println("======================================");
			while((character=fr.read())!=-1)
			{
				System.err.print((char)character);
			}
			System.err.println();
			System.out.println("======================================");
		}
		catch(IOException ie)
		{
			System.err.println(ie);
		}
	}
}
class rename{
	rename()
	{
		File f = new File("file2.java");
		String name = "File1.txt";
		f.renameTo(new File(name));
		System.out.println("======================================");
		System.err.println("Rename file Successfully...");
		System.out.println("======================================");

	}
}
class delete{
	delete(){
		File f = new File("file1.txt");
		f.delete();
		System.out.println("======================================");
		System.err.println("File Deleted Successfully...");
		System.out.println("======================================");
	}
}
class select {
	select() {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------");
		System.out.print("Enter Above choice : ");
		i = sc.nextInt();
		switch (i) {
			case 1:
				new getname();
				break;
			case 2:
				new getfilepath();
				break;
			case 3:
				new canread();
				break;
			case 4:
				new canwrite();
				break;
			case 5:
				new write();
				break;
			case 6:
				new read();
				break;
			case 7:
				new rename();
				break;
			case 8:
				new delete();
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("======================================");
				System.out.println("Please Enter Valid Choice.");
				System.out.println("======================================");

		}
	}
}

class menudriven {
	public static void main(String[] args) {
		while (true) {
			menu m = new menu();

			select s = new select();
		}
	}
}
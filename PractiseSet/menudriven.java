// 11)A menu-driven file handling program in Java is a software application that presents
// users with a menu interface to perform various file operations. This program offers
// users predefined options, such as creating, reading, writing, or deleting files,
// displayed in a menu format. It leverages Java's file handling capabilities, utilizing
// classes and methods from the java.io package, to execute file operations seamlessly
// within its execution flow.
// Example:
// File Handling Menu
// 1. Create New File
// 2. Read From a File
// 3. Write to a File
// 4. Delete to a File
// 5. Exit
import java.util.*;
import java.io.*;
class sc{
    Scanner sc = new Scanner(System.in);
    sc(){
    }
}
class menu{
    menu(){
        System.err.println("---------------Choice---------------");
        System.err.println("1.Enter 1 for create new file.");
        System.err.println("2.Enter 2 for read form file.");
        System.err.println("3.Enter 3 for write to a file.");
        System.err.println("4.Enter 4 for delete the file.");
        System.err.println("5.Enter 5 for Exit.");
        System.err.println("------------------------------------");
    }
}
class create extends sc{
    create(){
        System.err.print("Enter File Name : ");
        String name = sc.nextLine();
        try{
            File f = new File(name); 
            f.createNewFile();
            System.err.println("****************************************");
            System.err.println("File Created Successfully...");
            System.err.println("****************************************");
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
    }
}
class read extends sc{
    read(){
        System.err.print("Enter File Name :");
        String name = sc.nextLine();
        try{
            FileReader f = new FileReader(name);
            int i;
            System.err.println("****************************************");
            while((i=f.read())!=-1)
            {
                System.err.print((char)i);
            }
            System.err.println();
            System.err.println("****************************************");
            f.close();
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
    }
}
class write extends sc{
    write(){
        System.err.print("Enter File Name :");
        String name = sc.nextLine();
        try{
            FileWriter fw = new FileWriter(name);
            System.err.println("Enter Content Which you enter in file :");
            String content = sc.nextLine();
            fw.write(content);
            System.err.println("****************************************");
            System.err.println("Content Writed in file Successfully...");
            System.err.println("****************************************");
            fw.close();            
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
    }
}
class delete extends sc{
    delete(){
        System.err.print("Enter File Name : ");
        String name = sc.nextLine();
        File f = new File(name);
        f.delete();
        System.err.println("****************************************");
        System.err.println("File Deleted Successfully...");
        System.err.println("****************************************");
    }
}
class select extends sc{
        select(){
        System.err.print("Enter Your Choice :");
        int num = sc.nextInt(); 
        switch (num){
            case 1 :
                new create();
                break;
            case 2 :
                new read();
                break;
            case 3 :
                new write();
                break;
            case 4 :
                new delete();
                break;
            case 5:
                System.err.println("Good Bye!...");
                System.exit(0);
            default :
                System.err.println("Enter Vaid Choice..");
        }
    }
}
public class menudriven {
    public static void main(String[] args) {
        while (true) {            
            menu m = new menu();
            select s = new select();
        }
    }

}
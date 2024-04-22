import java.util.*;
import java.io.*;
class sc{
    Scanner sc = new Scanner(System.in);
    sc(){
    }
}
class menu{
    menu(){
        System.err.println("----------------Choices----------------");
        System.err.println("1.Enter 1 for Create a file.");
        System.err.println("2.Enter 2 for get file name.");
        System.err.println("3.Enter 3 for get file path.");
        System.err.println("4.Enter 4 for know to file can read?");
        System.err.println("5.Enter 5 for know to file can write?");
        System.err.println("6.Enter 6 for Write something in file.");
        System.err.println("7.Enter 7 for read the file.");
        System.err.println("8.Enter 8 for rename the file.");
        System.err.println("9.Enter 9 for delete the file.");
        System.err.println("10.Enter 10 for Exit.");
        System.err.println("------------------------------------------------");
    }
}
class create extends sc{
    create(){
        System.err.print("Enter File Name :");
        String name = sc.nextLine();
        try{

            File f = new File(name);
            f.createNewFile();
            System.err.println("**********************************");
            System.err.println("File Created Successfully...");
            System.err.println("**********************************");
        }
        catch(IOException e){
            System.err.println(e);
        }
    }
}
class getname extends sc{getname(){
        System.err.print("Enter File Path :");
        String path = sc.nextLine();
        File f = new File(path);
        System.err.println("**********************************");
        System.err.println("File Name : "+f.getName());
        System.err.println("**********************************");
    }
}
class getpath extends sc{
    getpath(){
        System.err.print("Enter File Name :");
        String name = sc.nextLine();
        File f = new File(name);
        System.err.println("**********************************");
        System.err.println("File Path : "+f.getAbsolutePath());
        System.err.println("**********************************");
    }
}
class canread extends sc{
    canread(){
        System.err.print("Enter File Name :");
        String name = sc.nextLine();
        File f = new File(name);
        System.err.println("**********************************");
        System.err.println("File Can Read ? : "+f.canRead());
        System.err.println("**********************************");
    }
}
class canwrite extends sc{
    canwrite(){
        System.err.print("Enter File Name :");
        String name = sc.nextLine();
        File f = new File(name);
        System.err.println("**********************************");
        System.err.println("File Can Write ? : "+f.canWrite());
        System.err.println("**********************************");
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
            fw.close();
            System.err.println("**********************************");
            System.err.println("Content Write Successfully..");
            System.err.println("**********************************");
            
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
            FileReader fr = new FileReader(name);
            int i;
            System.err.println("**********************************");
            while((i=fr.read())!=-1){
                System.err.print((char)i);
            }
            fr.close();
            System.err.println("\n**********************************");
            
        }
        catch(IOException e)
        {
            System.err.println(e);
        }
    }
}
class rename extends sc{
    rename(){
        System.err.print("Enter Existing File Name :");
        String name = sc.nextLine();
        File f = new File(name);
        System.err.print("Enter New File Name :");
        String newName = sc.nextLine();
        f.renameTo(new File(newName));
        System.err.println("**********************************");
        System.err.println("File Ranamed Successfully..");
        System.err.println("**********************************");
    }
}
class delete extends sc{
    delete(){
        System.err.print("Enter Existing File Name :");
        String name = sc.nextLine();
        File f = new File(name);
        f.delete();
        System.err.println("**********************************");
        System.err.println("File Deleted Successfully..");
        System.err.println("**********************************");
    }
}
class select extends sc{
    select(){
        System.err.print("Enter Your Choice : ");
        int i = sc.nextInt();
        switch (i) {
            case 1 :
                new create();
                break;
            case 2 :
                new getname();
                break;
            case 3 :
                new getpath();
                break;
            case 4 :
                new canread();
                break;
            case 5 :
                new canwrite();
                break;
            case 6 :
                new write();
                break;
            case 7 :
                new read();
                break;
            case 8 :
                new rename();
                break;
            case 9 :
                new delete();
                break;
            case 10:
                System.err.println("Goood Bye!..");
                System.exit(0);
                break;
            default:
                System.err.println("Enter Valid Choise..");
        }
    }
}
class menudriven3
{
    public static void main(String[] args) {
        while (true) {
            
            menu m = new menu();
            select s = new select();
        }
    }
}
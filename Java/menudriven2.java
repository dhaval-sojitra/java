import java.io.*;
import java.util.*;

class menu {
    menu() {
        System.err.println("--------------------Select Your Choice--------------------");
        System.err.println("Enter 1 for Create New File :");
        System.err.println("Enter 2 for get File Name :");
        System.err.println("Enter 3 for get File Path :");
        System.err.println("Enter 4 for know to file can read ? :");
        System.err.println("Enter 5 for know to file can Write ? :");
        System.err.println("Enter 6 for Write in File :");
        System.err.println("Enter 7 for Read in File :");
        System.err.println("Enter 8 for Rename to File :");
        System.err.println("Enter 9 for Delete the File :");
        System.err.println("Enter 10 for Exit :");
        System.err.println("------------------------------------------------------------");
    }
}

class create {
    create() {
        try {
            Scanner sc = new Scanner(System.in);
            System.err.print("Enter File Name :");
            String name = sc.nextLine();
            File f = new File(name);
            f.createNewFile();
            System.err.println("====================================================");
            System.out.println("File Created Successfully...");
            System.err.println("====================================================");
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}

class getname {
    getname() {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter File Path :");
        String path = sc.nextLine();
        File f = new File(path);
        System.err.println("====================================================");
        System.err.println("File Name :"+f.getName());
        System.err.println("====================================================");
    }
}
class getpath{
    getpath(){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter File Name :");
        String name = sc.nextLine();
        File f = new File(name);
        System.err.println("====================================================");
        System.err.println("File Path :"+f.getAbsolutePath());
        System.err.println("====================================================");
    }
}
class canread{
    canread(){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter File Name :");
        String name = sc.nextLine();
        File f = new File(name);
        System.err.println("====================================================");
        System.err.println("File Can Read :"+f.canRead());
        System.err.println("====================================================");
    }
}
class canwrite{
    canwrite(){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter File Name :");
        String name = sc.nextLine();
        File f = new File(name);
        System.err.println("====================================================");
        System.err.println("File Can Write :"+f.canWrite());
        System.err.println("====================================================");
    }
}
class write{
    write(){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter File Name :");
        String name = sc.nextLine();
        try{
            FileWriter fw = new FileWriter(name);
            System.err.print("Enter Content Which you enter in file :");
            String data = sc.nextLine();
            fw.write(data);
            fw.close();
            System.err.println("====================================================");
            System.err.println("Write Content in file Successfully..");
            System.err.println("====================================================");    
        }
        catch(IOException e){
            System.err.println(e);
        }
    }
}
class read{
    read(){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter File Name :");
        String name = sc.nextLine();
        try{
            FileReader fr = new FileReader(name);
            int val;
            System.err.println("====================================================");    
            while((val=fr.read())!=-1)
            {
                System.err.print((char)val);
            }
            System.err.println();
            System.err.println("====================================================");    
            fr.close();
        }
        catch(IOException e){
            System.err.println(e);
        }
    }
}
class rename{
    rename(){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Exits File Name :");
        String name = sc.nextLine();
        System.out.print("Enter New Name :");
        String newname = sc.nextLine();
        File f = new File(name);
        f.renameTo(new File(newname));
        System.err.println("====================================================");
        System.err.println("Renamed file Successfully..");
        System.err.println("====================================================");    

    }
}
class delete{
    delete(){
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Exits File Name :");
        String name = sc.nextLine();
        File f = new File(name);
        f.delete();
        System.err.println("====================================================");
        System.err.println("File Deleted Successfully..");
        System.err.println("====================================================");    

    }
}

class select {
    select() {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Your Choice :");
        int i = sc.nextInt();
        System.err.println("------------------------------------------------------------");
        System.err.println();
        switch (i) {
            case 1:
                new create();
                break;
            case 2:
                new getname();
                break;
            case 3:
                new getpath();
                break;
            case 4:
                new canread();
                break;
            case 5:
                new canwrite();
                break;
            case 6:
                new write();
                break;
            case 7:
                new read();
                break;
            case 8:
                new rename();
                break;
            case 9:
                new delete();
                break;
            case 10:
                System.out.println("Good bye!");
                System.exit(0);
            default:
                System.err.println("Please Enter Valid Choice..");
                break;
        }
    }
}

class menudriven2 {
    public static void main(String[] args) {
        while (true) {
            menu m = new menu();
            select s = new select();
        }
    }
}

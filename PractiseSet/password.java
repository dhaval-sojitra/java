import java.util.*;

class password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password :");
        String pass = sc.nextLine();
        int digit = 0;
        boolean chk = true;

        char[] password = pass.toCharArray();
        for (int i = 0; i < password.length; i++) {
            if (password[i] == '0' || password[i] == '1' || password[i] == '2' || password[i] == '3'
                    || password[i] == '4' || password[i] == '5' || password[i] == '6' || password[i] == '7'
                    || password[i] == '8' || password[i] == '9') {
                digit++;
            } else {
                for (char j = 'a'; j <= 'z'; j++) {
                    char lowerpass = Character.toLowerCase(password[i]);
                    if (lowerpass == j || password[i] == j) {
                        chk = true;
                        break;
                    } else {
                        chk = false;
                    }
                }
            }
            if ((chk == false)) {
                break;
            }
        }
        if (password.length <= 10) {
            System.out.println("***************************************");
            System.out.println("Password must be atleast 10 characters...");
            System.out.println("***************************************");
        } else if (digit < 2) {
            System.out.println("***************************************");
            System.out.println("Password must be contain two digits...");
            System.out.println("***************************************");
        } else if (chk == false) {
            System.out.println("***************************************");
            System.out.println("Password must be contain only characters and digits...");
            System.out.println("***************************************");
        } else {
            System.out.println("***************************************");
            System.out.println("Password Successfully Saved...");
            System.out.println("***************************************");
        }
    }
}
